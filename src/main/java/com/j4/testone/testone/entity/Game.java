package com.j4.testone.testone.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private int category;

    @Column(name = "price")
    private double price;

    @Column(name = "publisher")
    private LocalDate publisher;

    @ManyToOne
    private Console console;

    public Game(){

    }
    public Game(String name, int category, double price, LocalDate publisher, Console console) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.publisher = publisher;
        this.console = console;
    }
}


