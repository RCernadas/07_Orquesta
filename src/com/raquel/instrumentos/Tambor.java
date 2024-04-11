package com.raquel.instrumentos;

/**
 * Clase Tambor que hereda los atributos de Instrumento y que posee uno propio
 * @author Raquel  
 *
 */
public class Tambor extends Instrumento {
	
	private double tamanho;
	
	public Tambor(String nombre, Tipo tipo, double tamanho) {
		super(nombre, tipo);
		this.tamanho = tamanho;
	}

	public void aporrear() {
		System.out.println("Aporreando tambor " + nombre);
	}
	
}
