package com.ajrodriguez.service;

import java.util.List;
import com.ajrodriguez.model.Categoria;

public interface ICategoriasService {
	void guardar(Categoria categoria);
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);	
}

