package com.raquel.instrumentos;

/**
 * Clase Flauta que hereda los atributos de Instrumento y que posee uno propio
 * @author Raquel
 *
 */
public class Flauta extends Instrumento {
	private String modelo;

	public Flauta(String nombre, Tipo tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void tocar() {
		super.tocar();
		System.out.println( "Soplando el instrumento " + nombre);
		
	}	
}
