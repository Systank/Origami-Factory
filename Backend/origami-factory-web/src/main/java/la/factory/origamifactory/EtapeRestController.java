package la.factory.origamifactory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import la.factory.origami.factory.model.Etape;
import la.factory.origami.factory.repository.IRepoEtape;

@RestController
@RequestMapping("/etape")
public class EtapeRestController {

	@Autowired
	private IRepoEtape etapeRepo;
	
	@GetMapping("/{id}")
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
}
