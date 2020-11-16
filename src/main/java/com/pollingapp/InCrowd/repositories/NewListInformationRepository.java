package com.pollingapp.InCrowd.repositories;

import com.pollingapp.InCrowd.classes.NewListInformation;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewListInformationRepository extends MongoRepository<NewListInformation, Long> {
    
}
