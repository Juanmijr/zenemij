package com.juanmi.zenemij.repository;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juanmi.zenemij.modelo.Producto;
@Repository("productoJpaRepository")
public interface ProductoJpaRepositorio extends JpaRepository<Producto,Serializable>{
	public abstract Producto findById(int id);
	public abstract List<Producto> findByModelo(String name);
	@Transactional
	public abstract void deleteById(int id);
}