package com.colycerv.produits.restControllers;

import com.colycerv.produits.dto.ProduitDTO;
import com.colycerv.produits.entities.Produit;
import com.colycerv.produits.service.ProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {

  @Autowired
  ProduitService produitService;

  @RequestMapping(method = RequestMethod.GET)
  public List<ProduitDTO> getAllProduits() {
    return produitService.getAllProduits();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ProduitDTO getProduitById(@PathVariable("id") Long id) {
    return produitService.getProduit(id);
  }

  @RequestMapping(method = RequestMethod.POST)
  public ProduitDTO createProduit(@RequestBody ProduitDTO p) {
    return produitService.saveProduit(p);
  }

  @RequestMapping(method = RequestMethod.PUT)
  public ProduitDTO updateProduit(@RequestBody ProduitDTO p) {
    return produitService.updateProduit(p);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteProduit(@PathVariable("id") Long id) {
    produitService.deleteProduitById(id);
  }

  @RequestMapping(value = "/prodscat/{idCat}", method = RequestMethod.GET)
  public List<Produit> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
    return produitService.findByCategorieIdCat(idCat);
  }
}
