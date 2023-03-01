package com.example.blackJack.components;

import com.example.blackJack.repositories.CardDeckRepository;
import com.example.blackJack.repositories.CardRepository;
import com.example.blackJack.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CardRepository cardRepository;

    @Autowired
    CardService cardService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        cardService.createCard();
        cardService.createCard();
        cardService.createCard();
        cardService.createCard();
    }
}
