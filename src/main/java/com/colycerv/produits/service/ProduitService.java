package com.colycerv.produits.service;

import com.colycerv.produits.dto.ProduitDTO;
import com.colycerv.produits.entities.Categorie;
// import com.colycerv.produits.entities.Categorie;
import com.colycerv.produits.entities.Produit;
import java.util.List;

public interface ProduitService {
  ProduitDTO saveProduit(ProduitDTO p);
  ProduitDTO updateProduit(ProduitDTO p);
  void deleteProduit(Produit p);
  void deleteProduitById(Long id);
  ProduitDTO getProduit(Long id);
  List<ProduitDTO> getAllProduits();

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

  ProduitDTO convertEntityToDto(Produit p);
  Produit convertDtoToEntity(ProduitDTO produitDto);
}
