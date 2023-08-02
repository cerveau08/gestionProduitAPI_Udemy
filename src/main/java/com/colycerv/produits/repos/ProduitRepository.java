package com.colycerv.produits.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colycerv.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    List<Produit> findByNomProduit(String nom);
    List<Produit> findByNomProduitContains(String nom); 
}
