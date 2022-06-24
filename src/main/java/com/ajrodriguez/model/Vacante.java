	package com.ajrodriguez.model;
	
	import java.util.Date;
	
	//las clases de modelo tienen estructura de un java bean o sea los atributos son privados.
	//creamos set y get
	public class Vacante {
		
	     private Integer id;
	     private String nombre;
	     private String descripcion;
	     private Date fecha;
	     private Double salario;
	     private Integer destacado;
		
	    public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public Date getFecha() {
			return fecha;
		}
		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}
		public Double getSalario() {
			return salario;
		}
		public void setSalario(Double salario) {
			this.salario = salario;
		}
		
		public Integer getDestacado() {
			return destacado;
		}
		public void setDestacado(Integer destacado) {
			this.destacado = destacado;
		}
		
		@Override
		public String toString() {
			return "Vacante [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
					+ ", salario=" + salario + ", destacado=" + destacado + "]";
		}
		 
		//se imprime en la consola el valor de cada atributo del objeto
		//se pueden ver los valores que hay en la clase vacante
		
	     
		
	     
	}
