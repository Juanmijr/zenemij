package com.juanmi.zenemij.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.juanmi.zenemij.modelo.Producto;
import com.juanmi.zenemij.modelo.Usuario;
import com.juanmi.zenemij.service.impl.ProductoServiceImpl;
import com.juanmi.zenemij.service.impl.UsuariosServiceImpl;

@Controller
@RequestMapping("/catalog")
public class PostController {

	
	@Autowired
	@Qualifier("productosServicioImpl")
	ProductoServiceImpl fjr;
	
	
	@Autowired
	@Qualifier("usuariosServicioImpl")
	UsuariosServiceImpl ajr;
	
	@PostMapping("addProducto")
	public String addProducto(@RequestParam("descripcion") String descripcion, @RequestParam("imagen") String imagen, @RequestParam("modelo") String modelo, @RequestParam("num_existencias") int num_existencias, @RequestParam("precio") int precio) {
		Producto p = new Producto(modelo,descripcion,precio,num_existencias,imagen);
		fjr.addProducto(p);
		return "redirect:/catalog";
	}
	
	@PostMapping("addUsuario")
	public String addArtist(@RequestParam("usuario") String usuario, @RequestParam("apellidos") String apellidos, @RequestParam("nombre") String nombre, @RequestParam("contrasena") String contrasena) {
		Usuario u = new Usuario(usuario,apellidos,nombre,contrasena);
		ajr.addUsuario(u);
		return "redirect:/catalog/usuarios";
	}
	
	@PostMapping("")
	public String removeProducto(@RequestParam("idOculto") int id) {
		fjr.removeProducto(id);
		return "redirect:/catalog";
	}
	
	@PostMapping("usuarios")
	public String removeUsuario(@RequestParam("idOculto") int id) {
		ajr.removeUsuario(id);
		return "redirect:/catalog/usuarios";
	}
	
	@PostMapping("updateProducto")
	public String updateFestival(Model model, @RequestParam("idOculto") int id) {
		Producto p = fjr.findById(id);
		model.addAttribute("producto", p);
		return "updateProducto";
	}
	
	@PostMapping("updateUsuario")
	public String updateUsuario(Model model, @RequestParam("idOculto") int id) {
		Usuario p = ajr.findById(id);
		model.addAttribute("usuario",p);
		return "updateUsuario";
	}
	
	@PostMapping("updateProducto/confirm")
	public String updateFestival(@RequestParam("idOculto") int id, @RequestParam("descripcion") String descripcion, @RequestParam("imagen") String imagen, @RequestParam("modelo") String modelo, @RequestParam("num_existencias") int num_existencias, @RequestParam("precio") int precio) {
		Producto p = new Producto(id, modelo,descripcion,precio,num_existencias,imagen);
		fjr.updateProducto(p);
		return "redirect:/catalog";
	}
	
	@PostMapping("updateUsuario/confirm")
	public String updateArtist(@RequestParam("idOculto") int id, @RequestParam("usuario") String usuario, @RequestParam("apellidos") String apellidos, @RequestParam("nombre") String nombre, @RequestParam("contrasena") String contrasena) {
		Usuario u = new Usuario(id, usuario,apellidos,nombre,contrasena);
		ajr.updateUsuario(u);
		return "redirect:/catalog/usuarios";
	}
	
}
