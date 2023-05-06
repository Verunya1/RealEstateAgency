package com.example.realestateagency.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "ads")
@AllArgsConstructor
@NoArgsConstructor
public class Realty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "square")
    private int square;

    @Column(name = "room")
    private int room;

    @Column(name = "floor")
    private int floor;

    @Column(name = "allfloor")
    private int allFloor;

    @Column(name = "price")
    private int price;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "type")
    private String type;

    @Column(name = "author")
    private String author;

    @Column(name = "number")
    private String number;


}
