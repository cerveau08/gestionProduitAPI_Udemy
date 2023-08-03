package com.colycerv.produits.service;

import com.colycerv.produits.entities.Categorie;
// import com.colycerv.produits.entities.Categorie;
import com.colycerv.produits.entities.Produit;
import com.colycerv.produits.repos.ProduitRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImpl implements ProduitService {

  @Autowired
  ProduitRepository produitRepository;

  @Override
  public Produit saveProduit(Produit p) {
    return produitRepository.save(p);
  }

  @Override
  public Produit updateProduit(Produit p) {
    return produitRepository.save(p);
  }

  @Override
  public void deleteProduit(Produit p) {
    produitRepository.delete(p);
  }

  @Override
  public void deleteProduitById(Long id) {
    produitRepository.deleteById(id);
  }

  @Override
  public Produit getProduit(Long id) {
    return produitRepository.findById(id).get();
  }

  @Override
  public List<Produit> getAllProduits() {
    return produitRepository.findAll();
  }

  @Override
  public List<Produit> findByNomProduit(String nom) {
    return produitRepository.findByNomProduit(nom);
  }

  @Override
  public List<Produit> findByNomProduitContains(String nom) {
    return produitRepository.findByNomProduitContains(nom);
  }

  @Override
  public List<Produit> findByNomPrix(String nom, Double prix) {
    return produitRepository.findByNomPrix(nom, prix);
  }

  @Override
  public List<Produit> findByCategorie(Categorie categorie) {
    return produitRepository.findByCategorie(categorie);
  }

  @Override
  public List<Produit> findByCategorieIdCat(Long id) {
    return produitRepository.findByCategorieIdCat(id);
  }

  @Override
  public List<Produit> findByOrderByNomProduitAsc() {
    return produitRepository.findByOrderByNomProduitAsc();
  }

  @Override
  public List<Produit> trierProduitsNomsPrix() {
    return produitRepository.trierProduitsNomsPrix();
  }

  @Override
  public List<Produit> findByNomPrixOther(String nom, Double prix) {
    return produitRepository.findByNomPrixOther(nom, prix);
  }

  @Override
  public List<Produit> findByCategorieOther(Categorie categorie) {
    return produitRepository.findByCategorieOther(categorie);
  }

  @Override
  public List<Produit> findByCategorieNomCat(String nom) {
    return produitRepository.findByCategorieNomCat(nom);
  }

  @Override
  public List<Produit> findByCategorieNomCatContains(String nom) {
    return produitRepository.findByCategorieNomCatContains(nom);
  }

  @Override
  public List<Produit> findByOrderByCategorieNomCatDesc() {
    return produitRepository.findByOrderByCategorieNomCatDesc();
  }
}
