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

import la.factory.origami.factory.model.Etape;
import la.factory.origami.factory.repository.IRepoEtape;

@RestController
@RequestMapping("/etape")
public class EtapeRestController {

	@Autowired
	private IRepoEtape etapeRepo;
	
	@GetMapping("")
	@ResponseBody
	public List<Etape> list(){
		return etapeRepo.findAll();
	}
	
	@GetMapping("/origami/{id}")
	@ResponseBody
	public List<Etape> group(){
		return etapeRepo.findEtapeByOrigami();
	}
	@PostMapping("")
	@ResponseBody
	public Etape add(@RequestBody Etape etape) {
		etapeRepo.save(etape);
		
		return etape;
	}
	
	@PutMapping("/{id}")
	@ResponseBody
	public Etape edit(@RequestBody Etape etape, @PathVariable Long id) {
		etapeRepo.save(etape);

		return (Etape) etapeRepo.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void  delete(@PathVariable Long id) {
		etapeRepo.deleteById(id);
	}
}
