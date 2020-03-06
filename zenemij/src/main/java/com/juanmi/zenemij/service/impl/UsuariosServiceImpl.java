package com.juanmi.zenemij.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.juanmi.zenemij.modelo.Usuario;
import com.juanmi.zenemij.repository.ProductoJpaRepositorio;
import com.juanmi.zenemij.repository.UsuarioJpaRepositorio;
import com.juanmi.zenemij.service.UsuariosService;


@Service("usuariosServicioImpl")

public class UsuariosServiceImpl implements UsuariosService{

	@Autowired
	@Qualifier("usuarioJpaRepository")
	private UsuarioJpaRepositorio ujr;
	@Override
	public List<Usuario> getAll() {
		return ujr.findAll();
	}

	@Override
	public Usuario addUsuario(Usuario c) {
		return ujr.save(c);
	}

	@Override
	public int removeUsuario(int id) {
		ujr.deleteById(id);
		return 0;
	}

	@Override
	public Usuario updateUsuario(Usuario c) {
		return ujr.save(c);
	}
	
	public Usuario findById(int id) {
		return ujr.findById(id);
	}

}
