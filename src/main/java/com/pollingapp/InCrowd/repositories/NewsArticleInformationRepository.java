package com.pollingapp.InCrowd.repositories;

import com.pollingapp.InCrowd.classes.NewsArticleInformation;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsArticleInformationRepository extends MongoRepository<NewsArticleInformation, Long> {

}
