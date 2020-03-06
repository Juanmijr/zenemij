package com.juanmi.zenemij.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.juanmi.zenemij.modelo.Producto;
import com.juanmi.zenemij.modelo.Usuario;
import com.juanmi.zenemij.repository.ProductoJpaRepositorio;
import com.juanmi.zenemij.service.ProductosService;

@Service("productosServicioImpl")

public class ProductoServiceImpl implements ProductosService {
	@Autowired
	@Qualifier("productoJpaRepository")
	private ProductoJpaRepositorio ujr;
	
	@Override
	public List<Producto> getAll() {
		return ujr.findAll();

	}

	@Override
	public Producto addProducto(Producto c) {
		return ujr.save(c);

	}

	@Override
	public int removeProducto(int id) {
		ujr.deleteById(id);
		return 0;
	}

	@Override
	public Producto updateProducto(Producto c) {
		return ujr.save(c);
	}
	
	
	public Producto findById(int id) {
		return ujr.findById(id);
	}

}