package com.colycerv.produits.repos;

import com.colycerv.produits.entities.Categorie;
import com.colycerv.produits.entities.Produit;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "rest")
public interface ProduitRepository extends JpaRepository<Produit, Long> {
  List<Produit> findByNomProduit(String nom);
  List<Produit> findByNomProduitContains(String nom);

  @Query(
    "select p from Produit p where p.nomProduit like %?1 and p.prixProduit > ?2"
  )
  List<Produit> findByNomPrixOther(String nom, Double prix);

  @Query(
    "select p from Produit p where p.nomProduit like %:nom and p.prixProduit > :prix"
  )
  List<Produit> findByNomPrix(
    @Param("nom") String nom,
    @Param("prix") Double prix
  );

  @Query("select p from Produit p where p.categorie = ?1")
  List<Produit> findByCategorieOther(Categorie categorie);

  @Query("select p from Produit p where p.categorie = :cat")
  List<Produit> findByCategorie(@Param("cat") Categorie categorie);

  List<Produit> findByCategorieIdCat(Long id);

  List<Produit> findByCategorieNomCat(String nom);

  List<Produit> findByCategorieNomCatContains(String nom);

  List<Produit> findByOrderByNomProduitAsc();

  List<Produit> findByOrderByCategorieNomCatDesc();

  @Query(
    "select p from Produit p order by p.nomProduit ASC, p.prixProduit DESC"
  )
  List<Produit> trierProduitsNomsPrix();
}
