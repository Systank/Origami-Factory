package la.factory.origami.factory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import la.factory.origami.factory.model.Categorie;
import la.factory.origami.factory.model.Views;
import la.factory.origami.factory.repository.IRepoCategorie;



@RestController
@RequestMapping("/categorie")
public class CategorieRestController {

	@Autowired
	private IRepoCategorie categorieRepo;
	
	@GetMapping("")
	@ResponseBody
	@JsonView(Views.ViewCategorie.class)
	public List<Categorie> list(){
		return categorieRepo.findAll();
		
		
	}
	@GetMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewCategorieWithOrigamis.class)
	public Categorie detail(@PathVariable Long id) {
		return categorieRepo.findByIdWithOrigamis(id);
	}
	@GetMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewCategorieWithSousCats.class)
	public Categorie detail1(@PathVariable Long id) {
		return categorieRepo.findByIdWithCategories(id);
	}
	
	@PostMapping("")
	@ResponseBody
	@JsonView(Views.ViewCategorie.class)
	public Categorie add(@RequestBody Categorie categorie) {
		categorieRepo.save(categorie);
		return categorie; 
	}
	@PutMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewCategorie.class)
	public Categorie edit(@RequestBody Categorie categorie, @PathVariable Long id) {
		categorieRepo.save(categorie);
		
		return (Categorie) categorieRepo.findById(id).get();
		
	
	}
	
	@DeleteMapping("/{id}")
	@JsonView(Views.ViewCategorie.class)
	public void delete(@PathVariable Long id) {
		categorieRepo.deleteById(id);
	}
	
	
	

}
