package com.pollingapp.InCrowd.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.Executor;

import javax.xml.bind.JAXBException;

import com.pollingapp.InCrowd.classes.NewListInformation;
import com.pollingapp.InCrowd.services.NewListInformationService;
import com.pollingapp.InCrowd.classes.NewsArticleInformation;
import com.pollingapp.InCrowd.services.NewsArticleInformationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping(path = "hello-world")
    public String HelloWorld() {
        return "Hello world !";
    }


    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("Polling-");
        executor.initialize();
        return executor;
    }

    // separate functions for each service
    // optional spring parameters for the service
    @GetMapping(path="newsListInfo/{url}/{id}")
    private ResponseEntity newsListInfo(
        @PathVariable(name="url",required = true) String newsListInformationURL,
        @PathVariable(name="count",required = false) String count) {
        NewListInformation listInfo;
        try {
            listInfo = newsListInformationService
            .newsListInformationAPICall(newsListInformationURL,count);
            newsListInformationService.saveNewListInformation(listInfo);
            // newsListInformationService.getAll();
            return ResponseEntity.ok(listInfo);
        } catch (IOException | JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return  (ResponseEntity) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    
    private NewsArticleInformation newsArticleInfo(
        @RequestParam(required = true) String newsArticleInformationURL,
        @RequestParam(required = false, defaultValue = "173860") String id){
        NewsArticleInformation article;
        try {
            article = newsArticleInformationService
            .newsArticleInformationAPICall(newsArticleInformationURL,id);
            newsArticleInformationService.saveNewsArticleInformation(article);
            newsArticleInformationService.getAll();
            return article;
        } catch (IOException | JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
                
    }

    @Async
    @Scheduled(fixedDelay = 10000) //run every ten seconds
    protected void pollingProcess() {
        try {

            newsListInfo(newsListInformationURL,"5");
            newsArticleInfo(newsArticleInformationURL, "173860");
            // contents revealed, saving successfully
        } catch (Exception e) {
            System.out.println(e);            
        }
        System.out.println("\nPolling Process running: "+LocalDateTime.now());
    }

}

