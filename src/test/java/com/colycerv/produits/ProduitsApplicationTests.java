package com.colycerv.produits;

import com.colycerv.produits.entities.Categorie;
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
    Produit prod = new Produit("PC Samsung", 1800.500, new Date());
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

  @Test
  public void testfindByNomPrix1() {
    List<Produit> prods = produitRepository.findByNomPrixOther(
      "PC del",
      1000.0
    );
    for (Produit p : prods) {
      System.out.println(p);
    }
  }

  @Test
  public void testfindByNomPrix() {
    List<Produit> prods = produitRepository.findByNomPrix("PC dell", 1000.0);
    for (Produit p : prods) {
      System.out.println(p);
    }
  }

  @Test
  public void testfindByCategorie() {
    Categorie cat = new Categorie();
    cat.setIdCat(1L);
    List<Produit> prods = produitRepository.findByCategorie(cat);
    for (Produit p : prods) {
      System.out.println(p);
    }
  }

  @Test
  public void testfindByCategorieOther() {
    Categorie cat = new Categorie();
    cat.setIdCat(1L);
    List<Produit> prods = produitRepository.findByCategorieOther(cat);
    for (Produit p : prods) {
      System.out.println(p);
    }
  }

  @Test
  public void findByCategorieIdCat() {
    List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
    for (Produit p : prods) {
      System.out.println(p);
    }
  }

  @Test
  public void findByCategorieNomCat() {
    List<Produit> prods = produitRepository.findByCategorieNomCat("PC mobile");
    for (Produit p : prods) {
      System.out.println(p);
    }
  }

  @Test
  public void findByCategorieNomCatContains() {
    List<Produit> prods = produitRepository.findByCategorieNomCatContains(
      "mobile"
    );
    for (Produit p : prods) {
      System.out.println(p);
    }
  }

  @Test
  public void testfindByOrderByNomProduitAsc() {
    List<Produit> prods = produitRepository.findByOrderByNomProduitAsc();
    for (Produit p : prods) {
      System.out.println(p);
    }
  }

  @Test
  public void testfindByOrderByCategorieNomCatDesc() {
    List<Produit> prods = produitRepository.findByOrderByCategorieNomCatDesc();
    for (Produit p : prods) {
      System.out.println(p);
    }
  }

  @Test
  public void testTrierProduitsNomsPrix() {
    List<Produit> prods = produitRepository.trierProduitsNomsPrix();
    for (Produit p : prods) {
      System.out.println(p);
    }
  }
}
