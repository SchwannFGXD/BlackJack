package com.example.blackJack.services;

import com.example.blackJack.model.Card;
import com.example.blackJack.repositories.CardDeckRepository;
import com.example.blackJack.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    private List<String> suitList = new ArrayList<>(List.of("Spade","Club","Heart","Diamond"));
    private List<String> valueList = new ArrayList<>(List.of("1","2","3","4","5","6","7","8","9","10","J","Q","K","A"));


    public Card createCard(){
        Random rand = new Random();
        int randomSuit = rand.nextInt(4);
        int randomValue = rand.nextInt(14);
        Card card= new Card();
        card.setSuit(suitList.get(randomSuit));
        card.setValue(valueList.get(randomSuit));
        cardRepository.save(card);
        return card;
    }
}