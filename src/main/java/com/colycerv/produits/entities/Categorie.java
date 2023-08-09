package com.colycerv.produits.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categorie {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idCat;

  private String nomCat;
  private String descriptionCat;

  @OneToMany(mappedBy = "categorie")
  @JsonIgnore
  private List<Produit> produits;
}
