package com.juanmi.zenemij.service;

	import java.util.List;

import com.juanmi.zenemij.modelo.Producto;
import com.juanmi.zenemij.modelo.Usuario;
	
	public interface ProductosService {
		public abstract List<Producto>getAll();
		public abstract Producto addProducto(Producto c);
		public abstract int removeProducto(int id);
		public abstract Producto updateProducto(Producto c);
	
	}

