package com.tipocambio.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tipocambio.project.interfaceService.IMonedaService;
import com.tipocambio.project.model.Moneda;

@Controller
@RequestMapping
public class MonedaController {

	@Autowired
	private IMonedaService service;
	
	@GetMapping("/listarMonedas")
	public String listarTodos(Model model) {
		List<Moneda> monedas = service.listarMonedas();
		model.addAttribute("monedas", monedas);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("moneda", new Moneda());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Moneda m, Model model) {
		service.guardarOActualizarMoneda(m);
		return "redirect:/listarMonedas";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Moneda> moneda = service.obtenerMonedaPorId(id);
		model.addAttribute("moneda", moneda);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete( Model model, @PathVariable int id) {
		service.eliminarMoneda(id);
		return "redirect:/listarMonedas";
	}
}
