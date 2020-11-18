package com.pollingapp.InCrowd.services;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.pollingapp.InCrowd.classes.NewsArticleInformation;
import com.pollingapp.InCrowd.repositories.NewsArticleInformationRepository;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.InputSource;

@Service
public class NewsArticleInformationService {
    @Autowired
    NewsArticleInformationRepository newsArticleInformationRepository;

    public NewsArticleInformation newsArticleInformationAPICall(String urlString,String id) throws 
    ClientProtocolException, IOException, JAXBException {
        // Given
        HttpUriRequest request = new HttpGet( urlString+id );
    
        // When
        HttpResponse response = HttpClientBuilder.create().build().execute( request );

        // Handling XML string
        String xmlFromResponse = EntityUtils.toString(response.getEntity());
        JAXBContext jaxbContext = JAXBContext.newInstance(NewsArticleInformation.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        NewsArticleInformation newsArticleInformation = 
        (NewsArticleInformation) unmarshaller
        .unmarshal(new InputSource(new StringReader(xmlFromResponse)));
        return newsArticleInformation;
    }

    public void saveNewsArticleInformation(NewsArticleInformation item) {
        newsArticleInformationRepository.save(item);
    }

	public void getAll() {
        System.out.println(newsArticleInformationRepository.findAll());
	}


}
