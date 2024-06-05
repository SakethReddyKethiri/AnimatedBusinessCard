package com.giftcardgenerator.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giftcardgenerator.db.entity.BusinessCard;
import com.giftcardgenerator.service.BusinessCardService;

@RestController
@RequestMapping("/api/cards")
public class BusinessCardAPI {
    @Autowired
    private BusinessCardService service;

    @CrossOrigin
    @PostMapping
    public BusinessCard createCard(@RequestBody BusinessCard card) {
        return service.saveCard(card);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public BusinessCard getCard(@PathVariable Long id) {
        return service.getCard(id);
    }
}
