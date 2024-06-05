package com.giftcardgenerator.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giftcardgenerator.db.entity.BusinessCard;
@Repository
public interface BusinessCardRepo extends JpaRepository<BusinessCard, Long> {

}
