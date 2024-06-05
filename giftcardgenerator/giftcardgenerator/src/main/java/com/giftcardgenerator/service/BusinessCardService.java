package com.giftcardgenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giftcardgenerator.db.entity.BusinessCard;
import com.giftcardgenerator.db.repository.BusinessCardRepo;
@Service
public class BusinessCardService {
    @Autowired
    private BusinessCardRepo repository;

    public BusinessCard saveCard(BusinessCard card) {
        return repository.save(card);
    }

    public BusinessCard getCard(Long id) {
        return repository.findById(id).orElse(null);
    }
}
