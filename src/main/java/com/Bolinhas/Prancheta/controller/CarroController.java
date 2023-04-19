package com.Bolinhas.Prancheta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Bolinhas.Prancheta.model.Carro;
import com.Bolinhas.Prancheta.repository.CarroRepository;

@Controller
public class CarroController {
	
	@Autowired
	private CarroRepository carroRepository;
	
	@GetMapping("/prancheta")
	public String list(Model model) {
		List<Carro> carros = carroRepository.findAll();
        model.addAttribute("carros", carros);
        return "Prancheta";
	}
	
	@GetMapping("/cadastrar")
    public String cadastrar(Model model) {
        model.addAttribute("carro", new Carro());
        return "CadastrarCarro";
    }
	
	@PostMapping("/prancheta")
    public String salvar(@ModelAttribute("carro") Carro carro) {
        carroRepository.save(carro);
        return "redirect:/prancheta";
    }
}
