package la.factory.origamifactory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import la.factory.origami.factory.model.Etape;
import la.factory.origami.factory.repository.IRepoEtape;

@RestController
@RequestMapping("/etape")
public class EtapeRestController {

	@Autowired
	private IRepoEtape etapeRepo;
	
	public List<Etape> group(){
		return etapeRepo.findEtapeByOrigami();
	}
}
