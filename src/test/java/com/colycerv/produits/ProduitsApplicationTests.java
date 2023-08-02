package com.colycerv.produits;

import com.colycerv.produits.entities.Produit;
import com.colycerv.produits.repos.ProduitRepository;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProduitsApplicationTests {

  @Autowired
  private ProduitRepository produitRepository;

  @Test
  public void testCreateProduit() {
    Produit prod = new Produit("PC HP", 2600.500, new Date());
    produitRepository.save(prod);
  }

  @Test
  public void testFindProduit() {
    Produit p = produitRepository.findById(2L).get();
    System.out.println(p);
  }

  @Test
  public void testUpdateProduit() {
    Produit p = produitRepository.findById(2L).get();
    p.setPrixProduit(1000.0);
    p.setNomProduit("ThinkPads");
    produitRepository.save(p);
  }

  @Test
  public void testDeleteProduit() {
    produitRepository.deleteById(3L);
  }

  @Test
  public void testListerTousProduits() {
    List<Produit> prods = produitRepository.findAll();
    for (Produit p : prods) {
      System.out.println(p);
    }
  }

  @Test
  public void testFindByNomProduit() {
    List<Produit> prods = produitRepository.findByNomProduit("PC Dell");
    for (Produit p : prods) {
      System.out.println(p);
    }
  }

  @Test
  public void testFindByNomProduitContains() {
    List<Produit> prods = produitRepository.findByNomProduitContains("P");
    for (Produit p : prods) {
      System.out.println(p);
    }
  }
}
