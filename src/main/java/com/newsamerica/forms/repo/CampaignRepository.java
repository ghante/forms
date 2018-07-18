package com.newsamerica.forms.repo;

import com.newsamerica.forms.model.Campaign;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CampaignRepository extends MongoRepository<Campaign, String> {
}