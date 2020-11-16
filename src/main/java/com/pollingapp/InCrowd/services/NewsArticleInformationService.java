package com.pollingapp.InCrowd.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.pollingapp.InCrowd.classes.NewsArticleInformation;
import com.pollingapp.InCrowd.repositories.NewsArticleInformationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.InputSource;

@Service
public class NewsArticleInformationService {
    @Autowired
    NewsArticleInformationRepository newsArticleInformationRepository;

    public NewsArticleInformation newsArticleInformationAPICall(String urlString,String id) throws IOException, JAXBException {
        // open connection
        URL url = new URL(urlString+id+"");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("accept", "text/html,application/xhtml+xml,application/xml");         

        // building a string of the content
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
        }       
        in.close();
        connection.disconnect();

        JAXBContext jaxbContext = JAXBContext.newInstance(NewsArticleInformation.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        NewsArticleInformation newsArticleInformation = 
        (NewsArticleInformation) unmarshaller
        .unmarshal(new InputSource(new StringReader(content.toString())));
        // System.out.println("\nValue of Response : "+newsArticleInformation.toString()+" |END");

        return newsArticleInformation;
    }

    public void saveNewsArticleInformation(NewsArticleInformation item) {
        newsArticleInformationRepository.save(item);
    }

	public void getAll() {
        System.out.println(newsArticleInformationRepository.findAll());
	}


}
