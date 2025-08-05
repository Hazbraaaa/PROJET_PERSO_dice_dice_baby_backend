package com.dicedicebaby.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cards")
public class Card {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "combinaison")
    private String combinaison;

    @Column(name = "color")
    private String color;

    @Column(name = "pt_lvl_1")
    private int pt_lvl_1;

    @Column(name = "pt_lvl_2")
    private int pt_lvl_2;


    // Constructor
    public Card() {
    }

    public Card(String combinaison, String color, int pt_lvl_1, int pt_lvl_2) {
        this.combinaison = combinaison;
        this.color = color;
        this.pt_lvl_1 = pt_lvl_1;
        this.pt_lvl_2 = pt_lvl_2;
    }


    // Getters
    public Long getId() {
        return id;
    }

    public String getCombinaison() {
        return combinaison;
    }

    public String getColor() {
        return color;
    }

    public int getPt_lvl_1() {
        return pt_lvl_1;
    }

    public int getPt_lvl_2() {
        return pt_lvl_2;
    }
}
