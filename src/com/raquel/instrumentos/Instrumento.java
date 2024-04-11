package com.raquel.instrumentos;

/**
 * Clase Instrumento que incluye los atributos nombre y tipo
 * 
 * @author Raquel
 */
public class Instrumento {

	protected String nombre;

	public enum Tipo {
		VIENTO, CUERDA, PERCUSIÓN
	}

	protected Tipo tipo;

	public Instrumento(String nombre, Tipo tipo) {
		super();
		this.nombre = nombre;
		this.setTipo(tipo);
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void tocar() {
		System.out.println("Tocando el instrumento " + nombre);
	}

	public void afinar() {
		System.out.println("Afinando el instrumento " + nombre);
	}

}
