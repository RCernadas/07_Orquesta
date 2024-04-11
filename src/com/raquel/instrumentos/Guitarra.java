package com.raquel.instrumentos;

/**
 * hereda los atributos de Instrumento y que posee uno propio
 * 
 * @author Raquel
 *
 */
public class Guitarra extends Instrumento {

	protected int numCuerdas;

	public Guitarra(String nombre, Tipo tipo, int numCuerdas) {
		super(nombre, tipo);
		this.numCuerdas = numCuerdas;
	}

}
