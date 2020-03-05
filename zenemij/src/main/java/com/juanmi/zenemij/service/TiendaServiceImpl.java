package com.juanmi.zenemij.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.juanmi.zenemij.modelo.Producto;
import com.juanmi.zenemij.repository.ProductoJpaRepositorio;

@Service("miTiendaServicioImpl")

public class TiendaServiceImpl implements TiendaService {
	@Autowired
	@Qualifier("productoJpaRepositorio")
	private ProductoJpaRepositorio productoJpaRepositorio;

	@Override
	public List<Producto> listarTodos() {
		return productoJpaRepositorio.findAll();
	}

	@Override
	public Producto addCurso(Producto producto) {
		return productoJpaRepositorio.save(producto);
	}

	@Override
	public int removeCurso(int id) {
		productoJpaRepositorio.deleteById(id);
		return 0;
	}

	@Override
	public Producto updateCurso(Producto producto) {
		return productoJpaRepositorio.save(producto);
	}

	public List<Producto> listarPorPrecio(String nombre) {
		return productoJpaRepositorio.findByModelo(nombre);
	}
}