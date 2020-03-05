package com.juanmi.zenemij.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.juanmi.zenemij.modelo.Producto;
import com.juanmi.zenemij.service.TiendaService;
@Controller
public class mainController {
	@Autowired
	@Qualifier("miTiendaServicioImpl")
	private TiendaService miEjemploS1;
	//Paso de un LIst obtenido de un servicio con ModelandView
	@GetMapping("/")
	public ModelAndView ListaDelServicio2() {
	miEjemploS1.addCurso(new Producto(1,"Apple","Apple chetado",2500, 10, "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/mbp13touch-space-select-201807_GEO_ES?wid=904&hei=840&fmt=jpeg&qlt=80&op_usm=0.5,0.5&.v=1531167630513"));
	ModelAndView mav = new ModelAndView("index");
	mav.addObject("productos",miEjemploS1.listarTodos());
	return mav;
	}
}
