package com.generationc20.quesadillotasapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.generationc20.quesadillotasapp.model.Quesadillota;
import com.generationc20.quesadillotasapp.service.PedidoService;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoService service;
	
	
	@GetMapping
	public String showPedidos(Model model) {
		model.addAttribute("quesadillotas", service.getAll());
		return "quesadillotas";
	}
	
	@GetMapping("/nuevo")
	public String loadFormView(Model model) {
		return "form";
	}
	
	@GetMapping("/editar")
	public String showUpdateById(@RequestParam("qid") Integer qid, Model model) {
		model.addAttribute("quesadillota", service.getById(qid));
		return "form";
	}
	
	@PostMapping("/crear")
	public String createPedido(
			@RequestParam("nombre") String nombre,
			@RequestParam("tipoTortilla") int tipoTortilla,
			@RequestParam("tipoChile") int tipoChile,
			@RequestParam("tipoQueso") String tipoQueso,
			@RequestParam(name = "comentario", required = false) String comentario,
			RedirectAttributes redirectAttributes) {
		
		// Modelar o moldear
		Quesadillota quesadillota = new Quesadillota();
		quesadillota.setNombre(nombre);
		quesadillota.setTipoTortilla(tipoTortilla);
		quesadillota.setTipoChile(tipoChile);
		quesadillota.setQueso(tipoQueso);
		quesadillota.setComentario(comentario);
		
		// Procesados
		service.save(quesadillota);
		
		redirectAttributes.addFlashAttribute("mensaje", "Pedido realiza con exito");
		return "redirect:/pedidos";
	}
	
	@PostMapping("/eliminar")
	public String removePedidoById(@RequestParam("qid") Integer id, RedirectAttributes redirectAttributes) {
		service.removeById(id);
		redirectAttributes.addFlashAttribute("mensaje", String.format("Pedido %d eleminado", id));
		return "redirect:/pedidos";
	}
}
