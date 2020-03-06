package com.juanmi.zenemij.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.juanmi.zenemij.modelo.Producto;
import com.juanmi.zenemij.modelo.Usuario;
import com.juanmi.zenemij.service.ProductosService;
import com.juanmi.zenemij.service.impl.ProductoServiceImpl;
import com.juanmi.zenemij.service.impl.UsuariosServiceImpl;
@Controller
@RequestMapping("/catalog")
public class BasicController {
	@Autowired
	@Qualifier("productosServicioImpl")
	ProductoServiceImpl fjr;
	
	
	@Autowired
	@Qualifier("usuariosServicioImpl")
	UsuariosServiceImpl ajr;
	
	@GetMapping("")
	public String allProductos(Model model) {
		List<Producto> productosList;
		productosList = fjr.getAll();
		model.addAttribute("productosLists", productosList);
		return "index";
	}
	
	@GetMapping("usuarios")
	public String allUsuarios(Model model) {
		List<Usuario> usuariosList;
		usuariosList = ajr.getAll();
		model.addAttribute("usuarios", usuariosList);
		return "usuarios";
	}
	
	@GetMapping("addUsuario")
	public String addProducto(Model model) {
		List<Usuario> usuariosList;
		usuariosList = ajr.getAll();
		model.addAttribute("usuarios", usuariosList);
		return "addUsuario";
	}
	
	@GetMapping("addProducto")
	public String addProducto() {
		return "addProducto";
	}
	
	@GetMapping("updateUsuario")
	public String updateUsuario() {
		return "redirect:/catalog";
	}
	
	@GetMapping("details")
	public String details(Model model, @RequestParam("id") int id) {
		Producto producto = fjr.findById(id);
		model.addAttribute("producto", producto);
		return "details";
	}
	
}
