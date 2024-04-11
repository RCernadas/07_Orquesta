package com.raquel.instrumentos;

/**
 * Clase GuitarraElectrica que hereda los atributos de Instrumento y que posee uno propio
 * @author Raquel
 *
 */
public class GuitarraElectrica extends Guitarra {
	
	private double potencia;
	
	public GuitarraElectrica(String nombre, Tipo tipo, int numCuerdas, double potencia) {
		super(nombre, tipo, numCuerdas);
		this.potencia = potencia;
	}

	@Override
	public void tocar() {
		System.out.println("Tocando la guitarra electrica");
	}
	
	

	
	
	

}
