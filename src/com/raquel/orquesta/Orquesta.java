package com.raquel.orquesta;

import java.util.ArrayList;
import com.raquel.instrumentos.*;
import com.raquel.instrumentos.Instrumento.Tipo;

/**
 * Clase orguesta donde tenemos el método main donde creamos instancias de
 * nuestros instrumentos y las añadimos a una lista que llamaremos desde un
 * método para poner a aporrear los instrumentos que sean tambores y a tocar al
 * resto de instrumentos
 * 
 * @author Raquel
 *
 */
public class Orquesta {

	/**
	 * Metodo al que le pasamos por parámetro una lista de instrumentos para
	 * ponerlos a tocar o a aporrear según el instrumento que sea
	 * @param instrumentos
	 */
	public static void tocarInstrumentos(ArrayList<Instrumento> instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			if (instrumento instanceof Tambor) {
				((Tambor) instrumento).aporrear();
			} else {
				instrumento.tocar();
			}
		}
	}

	/**
	 * Método main donde creamos las instancias del objeto Instrumento
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Instrumento> instrumentos = new ArrayList<>();

		Instrumento flauta = new Flauta("Flauta travesera", Tipo.VIENTO, "AF-204");
		Instrumento guitarra = new Guitarra("Guitarra clásica", Tipo.CUERDA, 6);
		Instrumento guitarraElectrica = new GuitarraElectrica("Guitarra Stratocaster", Tipo.CUERDA, 6, 200.5);
		Instrumento tambor = new Tambor("Africano", Tipo.PERCUSIÓN, 20.5);

		instrumentos.add(flauta);
		instrumentos.add(guitarra);
		instrumentos.add(guitarraElectrica);
		instrumentos.add(tambor);

		tocarInstrumentos(instrumentos);

	}

}
