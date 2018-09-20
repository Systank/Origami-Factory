package la.factory.origamifactory;

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
import la.factory.origami.factory.repository.IRepoCategorie;

@RestController
@RequestMapping("/categorie")
public class CategorieRestController {

	@Autowired
	private IRepoCategorie categorieRepo;
	
	@GetMapping("")
	@ResponseBody

	public List<Categorie> list(){
		return categorieRepo.findAll();
		
		
	}
	
	@PostMapping("")
	@ResponseBody
	public Categorie add(@RequestBody Categorie categorie) {
		categorieRepo.save(categorie);
		return categorie; 
	}
	@PutMapping("/{id}")
	@ResponseBody
	public Categorie edit(@RequestBody Categorie categorie, @PathVariable Long id) {
		categorieRepo.save(categorie);
		
		return (Categorie) categorieRepo.findById(id).get();
		
	
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		categorieRepo.deleteById(id);
	}
	
	
	

}
