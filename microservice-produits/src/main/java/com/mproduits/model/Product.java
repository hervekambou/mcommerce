package com.mproduits.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String titre;
    private String description;
    private String image;
    private Double prix;
}
