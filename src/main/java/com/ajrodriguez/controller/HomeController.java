package com.ajrodriguez.controller;

import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
import com.ajrodriguez.model.Vacante;

@Controller
public class HomeController {
   @GetMapping("/tabla")
	public String mostrarTabla (Model model) {
		List <Vacante> lista = getVacantes();
		model.addAttribute("vacantes", lista);
		return "tabla";
		
	}
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante = new Vacante();
		
		vacante.setNombre("Ingeniero de comunicaciones");
		vacante.setDescripcion("Se solicita ingeniero para dar soperte en intranet");
		vacante.setFecha(new Date());
		vacante.setSalario(9700.0);
		model.addAttribute("vacante",vacante);
		return "detalle";
		
	}
	
	@GetMapping("/listado")
	public String MostrarListado (Model model) {
	     List<String> lista = new LinkedList<String>();
	     lista.add("Ingeniero de sistemas");
	     lista.add("Auxiliar de contabilidad");
	     lista.add("Vendedor");
	     lista.add("Arquitecto");
	    
	     model.addAttribute("empleos", lista);
	     
	     return "listado";
	}
	@GetMapping("/")   
	public String mostrarHome(Model model) {
    	   /*model.addAttribute("mensaje", "Bienvenidos a Empleos App");//agregar datos al modelo
    	   model.addAttribute("fecha", new Date());
    	   */
    	String nombre = "Auxiliar de contabilidad";
    	Date fechaPub = new Date();
    	double salario = 9000.0;
    	boolean vigente = true;
    	
    	model.addAttribute("nombre", nombre);
    	model.addAttribute("fecha", fechaPub);
    	model.addAttribute("salario", salario);
    	model.addAttribute("vigente", vigente);
    	
    	return "home";  //como se agrego thymeleaf se busca un html llamado home
       }
	
	//se crea una lista para agregar las vacantes 
 
	private List<Vacante> getVacantes(){
		SimpleDateFormat  sdf = new SimpleDateFormat("dd-mm-yyyy");
		List<Vacante> lista = new LinkedList<Vacante>();
		try {
			//creamos la oferta de trabajo 1
			Vacante vacante1 = new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Ingeniero civil");
			vacante1.setDescripcion("Se solicita ingeniero para hacer infraestructuras de puentes");
			vacante1.setFecha(sdf.parse("08-02-2019"));
			vacante1.setSalario(8500.0);
			vacante1.setDestacado(1);

			//creamos la oferta de trabajo 2
			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Contador publico");
			vacante2.setDescripcion("Se solicita contador para hacer cuentas");
			vacante2.setFecha(sdf.parse("05-04-2020"));
			vacante2.setSalario(9000.0);
			vacante2.setDestacado(0);
			
			//creamos la oferta de trabajo 3
			Vacante vacante3 = new Vacante();
			vacante3.setId(3);
			vacante3.setNombre("Ingeniero electrico");
			vacante3.setDescripcion("Se solicita ingeniero para cableado industrial");
			vacante3.setFecha(sdf.parse("13-06-2020"));
			vacante3.setSalario(15000.0);
			vacante3.setDestacado(0);

			//creamos la oferta de trabajo 4
			Vacante vacante4 = new Vacante();
			vacante4.setId(4);
			vacante4.setNombre("Ingeniero en electrónica");
			vacante4.setDescripcion("Se solicita electrónico para diseño de procesadores");
			vacante4.setFecha(sdf.parse("15-09-2020"));
			vacante4.setSalario(20000.0);
			vacante4.setDestacado(1);
			//agregamos las vacantes a la lista de vacantes
			
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);
			
		}catch (ParseException e) {
			System.out.println("Error:" + e.getMessage());
		}
		return lista;
	}
}
