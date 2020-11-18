package com.pollingapp.InCrowd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InCrowdApplicationTests {

	@Value("${incrowd.api.url.newsArticle}")
    public String newsArticleInformationURL;


	@Test
	void contextLoads() {
	}

	@Test
	public void testAPI() throws ClientProtocolException, IOException {
		String url = newsArticleInformationURL+"1";
		
		// Given
		String xmlMimeType = "text/xml";
		HttpUriRequest request = new HttpGet( url );
	
		// When
		HttpResponse response = HttpClientBuilder.create().build().execute( request );
	
		// Then
		String mimeType = ContentType.getOrDefault(response.getEntity()).getMimeType();
		System.out.println("\n MimeType of call: "+mimeType+"\n");
		assertEquals( xmlMimeType, mimeType );
	}
}
