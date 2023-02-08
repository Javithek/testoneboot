package com.j4.testone.testone.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "console")
@Getter
@Setter
public class Console {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "company")
    private String company;

    @Column(name = "price")
    private double price;

    @Column(name = "publisher")
    private LocalDate publisher;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "console", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Game> game;

    public Console(){

    }
    public Console(String company, double price, LocalDate publisher, String name) {
        this.company = company;
        this.price = price;
        this.publisher = publisher;
        this.name = name;
    }

}
