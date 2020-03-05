package com.juanmi.zenemij.repository;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juanmi.zenemij.modelo.Producto;
@Repository("productoJpaRepositorio")
public interface ProductoJpaRepositorio extends JpaRepository<Producto,Serializable>{
public abstract List<Producto> findByModelo(String modelo);
public abstract List<Producto> findByModeloAndPrecio(String modelo, int precio);
public abstract List<Producto> findByModeloOrPrecio(String nombre, int precio);
public abstract List<Producto> findByPrecio(int precio);
@Transactional
public abstract void deleteById(int id);
}