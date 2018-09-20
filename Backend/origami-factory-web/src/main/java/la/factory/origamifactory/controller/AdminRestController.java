package la.factory.origamifactory.controller;

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

import la.factory.origami.factory.model.Admin;
import la.factory.origami.factory.model.Views;
import la.factory.origami.factory.repository.IRepoAdmin;


@RestController
@RequestMapping("/admin")
public class AdminRestController {

	@Autowired
	private IRepoAdmin adminRepo;
	
	@GetMapping("")
	@ResponseBody
	@JsonView(Views.ViewAdmin.class)
	public List<Admin> list() {
		return adminRepo.findAll();
	}
	
	@PostMapping("")
	@ResponseBody
	@JsonView(Views.ViewAdmin.class)
	public Admin add(@RequestBody Admin admin) {
		 adminRepo.save(admin); 
		 return admin;
	}

	@PutMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewAdmin.class)
	public Admin edit(@RequestBody Admin admin, @PathVariable Long id) {
		 adminRepo.save(admin); 
		 return (Admin) adminRepo.findById(id).get(); 
	}
	
	@DeleteMapping("/{id}")
	@JsonView(Views.ViewAdmin.class)
	public void delete(@PathVariable Long id) {
		adminRepo.deleteById(id);
	}
}
