package com.cesar.spring.modelo;

import java.util.Date;

public class Proyecto {
	private final static double IVA=0.21;
	
	
	private int id;
	private String nombre;
	private String propiedad;
	private String titulo;
	private String descripcion;
	private String pem;
	private String iva;
	private String fechaIni;
	private String observaciones;

	
	
	public Proyecto() {}
	
	
	
	
	
	public Proyecto(int id, String nombre, String propiedad, String titulo, String descripcion, String pem,
			 String fechaIni, String observaciones) {
		this.id = id;
		this.nombre = nombre;
		this.propiedad = propiedad;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.pem=pem;
		this.iva=String.valueOf((Proyecto.pasarDoublePem(pem)*IVA));
		this.fechaIni = fechaIni;
		this.observaciones = observaciones;
	}
	static public double pasarDoublePem(String pem) {
		return Double.parseDouble(pem);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPropiedad() {
		return propiedad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPropiedad(String propiedad) {
		this.propiedad = propiedad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPem() {
		return pem;
	}
	public void setPem(String pem) {
		this.pem=pem;
	}
	
	public String getIva() {
		return iva;
	}

	public String getFechaIni() {
		return fechaIni;
	}
	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}

