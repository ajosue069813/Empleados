package com.ajrodriguez.service;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ajrodriguez.model.Categoria;


@Service
public class CategoriasServiceImpl implements ICategoriasService{

	private List<Categoria> lista=null;
	public CategoriasServiceImpl(){
			lista= new LinkedList<Categoria>();
			//categorias creadas 
			Categoria cat1 = new Categoria();
			cat1.setId(1);
			cat1.setNombre("Contabilidad");
			cat1.setDescripcion("Descripcion de contabilidad");
	
			Categoria cat2 = new Categoria();
			cat2.setId(2);
			cat2.setNombre("Ventas");
			cat2.setDescripcion("Descripcion de ventas");
				
			Categoria cat3 = new Categoria();
			cat3.setId(3);
			cat3.setNombre("Arquitectura");
			cat3.setDescripcion("Descripcion de Arquitectura");
				
			Categoria cat4 = new Categoria();
			cat4.setId(4);
			cat4.setNombre("Electronica");
			cat4.setDescripcion("Descripcion de electronica");
			
			Categoria cat5 = new Categoria();
			cat5.setId(5);
			cat5.setNombre("Sistemas");
			cat5.setDescripcion("Descripcion de sistemas");
			
			Categoria cat6 = new Categoria();
			cat6.setId(6);
			cat6.setNombre("Desarrollo de software");
			cat6.setDescripcion("Descripcion de software");
			// TODO Auto-generated method stub
			
			lista.add(cat1);
			lista.add(cat2);
			lista.add(cat3);
			lista.add(cat4);
			lista.add(cat5);
			lista.add(cat6);
			
		}
	public void guardar(Categoria categoria) {
	     lista.add(categoria);	
	}
	
	public List<Categoria> buscarTodas() {
		return lista;
	}

	
	public Categoria buscarPorId(Integer idCategoria) {
		for (Categoria cat : lista){
			if(cat.getId() == idCategoria) {
				return cat;
			}
		}
		return null;
	}

}
