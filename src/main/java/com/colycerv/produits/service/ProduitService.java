package com.colycerv.produits.service;

import com.colycerv.produits.entities.Categorie;
// import com.colycerv.produits.entities.Categorie;
import com.colycerv.produits.entities.Produit;
import java.util.List;

public interface ProduitService {
  Produit saveProduit(Produit p);
  Produit updateProduit(Produit p);
  void deleteProduit(Produit p);
  void deleteProduitById(Long id);
  Produit getProduit(Long id);
  List<Produit> getAllProduits();

  List<Produit> findByNomProduit(String nom);
  List<Produit> findByNomProduitContains(String nom);
  List<Produit> findByNomPrix(String nom, Double prix);
  List<Produit> findByNomPrixOther(String nom, Double prix);
  List<Produit> findByCategorie(Categorie categorie);
  List<Produit> findByCategorieOther(Categorie categorie);
  List<Produit> findByCategorieIdCat(Long id);
  List<Produit> findByCategorieNomCat(String nom);
  List<Produit> findByCategorieNomCatContains(String nom);
  List<Produit> findByOrderByNomProduitAsc();
  List<Produit> findByOrderByCategorieNomCatDesc();
  List<Produit> trierProduitsNomsPrix();
}
