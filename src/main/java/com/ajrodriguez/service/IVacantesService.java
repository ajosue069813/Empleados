package com.ajrodriguez.service;

import java.util.List;
import com.ajrodriguez.model.Vacante;

public interface IVacantesService {
	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer idVacante);
	void guardar(Vacante vacante);

}
