package com.pollingapp.InCrowd.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.concurrent.Executor;

import com.pollingapp.InCrowd.classes.NewListInformation;
import com.pollingapp.InCrowd.services.NewListInformationService;
import com.pollingapp.InCrowd.classes.NewsArticleInformation;
import com.pollingapp.InCrowd.services.NewsArticleInformationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;





/**
 * HelloWorldController
 */
@EnableAsync
@Configuration
@EnableScheduling
@RestController
@RequestMapping("HelloWorld")
public class PollingController {

    // Take urls from properties sheet
    @Value("${incrowd.api.url.newsList}")
    public String newsListInformationURL;
    @Value("${incrowd.api.url.newsArticle}")
    public String newsArticleInformationURL;

    @Autowired
    NewListInformationService newsListInformationService;
    @Autowired
    NewsArticleInformationService newsArticleInformationService;

    @GetMapping(path="hello-world")
    public String HelloWorld() {
        return "Hello world !";
    }


    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity   (100);
        executor.setThreadNamePrefix("Polling-");
        executor.initialize();
        return executor;
    }


    @Async
    @Scheduled(fixedDelay = 10000) //run every ten seconds
    protected void pollingProcess() {
        try {

            NewListInformation listInfo = newsListInformationService
            .newsListInformationAPICall(newsListInformationURL);
            
            NewsArticleInformation article = newsArticleInformationService
            .newsArticleInformationAPICall(newsArticleInformationURL);


            newsArticleInformationService.saveNewsArticleInformation(article);
            newsListInformationService.saveNewListInformation(listInfo);
            
            // contents revealed, saving successfully
            newsArticleInformationService.getAll();
            newsListInformationService.getAll();
        } catch (Exception e) {
            System.out.println(e);            
        }
        System.out.println("\npollingProcess running: "+LocalDateTime.now());
    }

}

