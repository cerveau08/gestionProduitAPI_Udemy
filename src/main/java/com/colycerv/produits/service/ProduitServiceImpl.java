package com.colycerv.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.colycerv.produits.entities.Categorie;
import com.colycerv.produits.entities.Produit;
import com.colycerv.produits.repos.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService{

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

    // @Override
    // public List<Produit> findByNomProduit(String nom) {
    //     throw new UnsupportedOperationException("Unimplemented method 'findByNomProduitContains'");
    // }

    // @Override
    // public List<Produit> findByNomProduitContains(String nom) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'findByNomProduitContains'");
    // }

    // @Override
    // public List<Produit> findByNomPrix(String nom, Double prix) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'findByNomPrix'");
    // }

    // @Override
    // public List<Produit> findByCategorie(Categorie categorie) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'findByCategorie'");
    // }

    // @Override
    // public List<Produit> findByCategorieIdCat(Long id) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'findByCategorieIdCat'");
    // }

    // @Override
    // public List<Produit> findByOrderByNomProduitAsc() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'findByOrderByNomProduitAsc'");
    // }

    // @Override
    // public List<Produit> trierProduitsNomsPrix() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'trierProduitsNomsPrix'");
    // }
    
}
