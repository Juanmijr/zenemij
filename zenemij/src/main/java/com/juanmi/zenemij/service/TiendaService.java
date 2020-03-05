package com.juanmi.zenemij.service;

	import java.util.List;

import com.juanmi.zenemij.modelo.Producto;
	
	public interface TiendaService {
	public abstract List<Producto>listarTodos ();
	public abstract Producto addCurso(Producto producto);
	public abstract int removeCurso(int id);
	public abstract Producto updateCurso(Producto producto);
	
	}

