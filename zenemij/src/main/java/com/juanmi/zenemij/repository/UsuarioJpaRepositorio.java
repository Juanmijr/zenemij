package com.juanmi.zenemij.repository;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juanmi.zenemij.modelo.Producto;
import com.juanmi.zenemij.modelo.Usuario;

@Repository("usuarioJpaRepository")
public interface UsuarioJpaRepositorio extends JpaRepository<Usuario,Serializable>{


	public abstract Usuario findById(int id);
	public abstract List<Usuario> findByUsuario(String alias);
	@Transactional
	public abstract void deleteById(int id);

}