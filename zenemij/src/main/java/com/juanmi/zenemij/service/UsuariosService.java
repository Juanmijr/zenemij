package com.juanmi.zenemij.service;

import java.util.List;

import com.juanmi.zenemij.modelo.Usuario;

public interface UsuariosService {

	public abstract List<Usuario>getAll();
	public abstract Usuario addUsuario(Usuario c);
	public abstract int removeUsuario(int id);
	public abstract Usuario updateUsuario(Usuario c);
}
