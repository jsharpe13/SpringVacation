package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Vacation;
import dmacc.repository.VacationRepository;

@Controller
public class WebController{
	@Autowired
	VacationRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllVacations(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewVacation(model);
		}
		model.addAttribute("vacations", repo.findAll());
		
		return "results";
	}
	
	@GetMapping("/inputVacation")
	public String addNewVacation(Model model) {
		Vacation v = new Vacation();
		model.addAttribute("newVacation", v);
		return "input";
	}
	
	@PostMapping("/inputVacation")
	public String addNewVacation(@ModelAttribute Vacation v, Model model) {
		repo.save(v);
		return viewAllVacations(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateVacation(@PathVariable("id") long id, Model model) {
		Vacation v = repo.findById(id).orElse(null);
		model.addAttribute("newVacation", v);
		return "input";
	}
	@PostMapping("/update/{id}")
	public String reviseContact(Vacation v, Model model) {
		repo.save(v);
		return viewAllVacations(model);
	}
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Vacation v = repo.findById(id).orElse(null);
		repo.delete(v);
		return viewAllVacations(model);
	}
}
