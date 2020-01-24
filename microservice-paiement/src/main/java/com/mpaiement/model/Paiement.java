package com.mpaiement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Paiement {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private Integer idCommande;
    private Integer montant;
    private Long numeroCarte;
}
