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

import la.factory.origami.factory.model.Origami;
import la.factory.origami.factory.repository.IRepoOrigami;

@RestController
@RequestMapping("/origami")
public class OrigamiRestController {

	@Autowired
	private IRepoOrigami origamiRepo;
	
	@GetMapping("")
	@ResponseBody
	public List<Origami> list(){
		return origamiRepo.findAll();
	}
	
	@GetMapping("/origami/{id}")
	@ResponseBody
	public List<Origami> group(){
		return origamiRepo.findOrigamiWithEtapesWithCategories();
	}
	@PostMapping("")
	@ResponseBody
	public Origami add(@RequestBody Origami origami) {
		origamiRepo.save(origami);
		
		return origami;
	}
	
	@PutMapping("/{id}")
	@ResponseBody
	public Origami edit(@RequestBody Origami origami, @PathVariable Long id) {
		origamiRepo.save(origami);

		return (Origami) origamiRepo.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void  delete(@PathVariable Long id) {
		origamiRepo.deleteById(id);
	}
}
