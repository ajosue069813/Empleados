package com.ajrodriguez.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ajrodriguez.model.Vacante;

@Service 
public class VacantesServiceImpl implements IVacantesService{
	
	private List<Vacante> lista = null;
	
	public VacantesServiceImpl() {
		
		SimpleDateFormat  sdf = new SimpleDateFormat("dd-mm-yyyy");
		lista = new LinkedList<Vacante>();
		try {
			//creamos la oferta de trabajo 1
			Vacante vacante1 = new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Ingeniero civil");
			vacante1.setDescripcion("Se solicita ingeniero para hacer infraestructuras de puentes");
			vacante1.setFecha(sdf.parse("08-02-2019"));
			vacante1.setSalario(9000.0);
			vacante1.setDestacado(1);
			vacante1.setEstatus("Aprobado");
			vacante1.setImagen("empresa1.png");

			//creamos la oferta de trabajo 2
			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Contador publico");
			vacante2.setDescripcion("Se solicita contador para hacer cuentas");
			vacante2.setFecha(sdf.parse("05-04-2020"));
			vacante2.setSalario(9000.0);
			vacante2.setDestacado(0);
			vacante2.setEstatus("Eliminado");
			vacante2.setImagen("empresa2.png");
			
			//creamos la oferta de trabajo 3
			Vacante vacante3 = new Vacante();
			vacante3.setId(3);
			vacante3.setNombre("Ingeniero electrico");
			vacante3.setDescripcion("Se solicita ingeniero para cableado industrial");
			vacante3.setFecha(sdf.parse("13-06-2020"));
			vacante3.setSalario(15000.0);
			vacante3.setDestacado(0);
			vacante3.setEstatus("Aprobado");

			//creamos la oferta de trabajo 4
			Vacante vacante4 = new Vacante();
			vacante4.setId(4);
			vacante4.setNombre("Ingeniero en electrónica");
			vacante4.setDescripcion("Se solicita electrónico para diseño de procesadores");
			vacante4.setFecha(sdf.parse("15-09-2020"));
			vacante4.setSalario(20000.0);
			vacante4.setDestacado(1);
			vacante4.setEstatus("Creado");
			vacante4.setImagen("empresa3.png");
			//agregamos las vacantes a la lista de vacantes
			
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);
			
		}catch (ParseException e) {
			System.out.println("Error:" + e.getMessage());
		}

	}

	public List<Vacante> buscarTodas() {
		// TODO Auto-generated method stub
		return lista;
	}

	public Vacante buscarPorId(Integer idVacante) {
		for (Vacante v : lista) {
			if(v.getId() == idVacante) {
				return v;
			}
		}
		return null;
	}

	@Override
	public void guardar(Vacante vacante) {
		lista.add(vacante);
		// TODO Auto-generated method stub
		
	}
	
	

}
