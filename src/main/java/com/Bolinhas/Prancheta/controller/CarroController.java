package com.Bolinhas.Prancheta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Bolinhas.Prancheta.model.Carro;
import com.Bolinhas.Prancheta.repository.CarroRepository;
import com.Bolinhas.Prancheta.service.CarroService;

@Controller
public class CarroController {
	
	@Autowired
	private CarroRepository carroRepository;
	@Autowired
	private CarroService carroService;
	
	@GetMapping("/prancheta")
	public String list(Model model) {
		List<Carro> carros = carroRepository.findAll();
        model.addAttribute("carros", carros);
        return "Prancheta";
	}
	
	@GetMapping("/export")
	public String export(Model model) {
		List<Carro> carros = carroRepository.findAll();
        model.addAttribute("carros", carros);
        return "Export";
	}
	
	@GetMapping("/cadastrar")
    public String cadastrar(Model model) {
        model.addAttribute("carro", new Carro());
        return "CadastrarCarro";
    }
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") long id,ModelMap model) {
		Carro carro = carroRepository.findById(id);
		model.addAttribute("carro",carro);
		return "edit";
	}
	
	@PostMapping("/prancheta")
    public String salvar(@ModelAttribute("carro") Carro carro) {
		carroRepository.save(carro);
        return "redirect:/prancheta";
    }
	
	@PostMapping("/delete")
	public String delete(Long id) {
		carroRepository.deleteById(id);
		return "redirect:/prancheta";
	}
}
