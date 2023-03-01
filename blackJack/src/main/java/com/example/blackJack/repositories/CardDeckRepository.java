package com.example.blackJack.repositories;

import com.example.blackJack.model.CardDeck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardDeckRepository extends JpaRepository<CardDeck, Long> {

}