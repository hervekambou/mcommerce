package com.clientui.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
public class ProductBean {
    private int id;
    private String titre;
    private String description;
    private String image;
    private Double prix;
}