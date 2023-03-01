package com.example.blackJack.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CardDeck")
public class CardDeck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private List<Card> cards;

    public CardDeck(){
    }
}
