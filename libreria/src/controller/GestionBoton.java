package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Libro;
import view.JVentana;

public class GestionBoton implements ActionListener {
	//Atributos de la clase
	JVentana vent;
	Libro monedaOrigen;
	Libro monedaDestino;

	// El constructor recibe una ventana para gestionar sus eventos
	public GestionBoton(JVentana v) {
		vent = v;
	}
	//Se implementa el método de la interfaz
	@Override
	public void actionPerformed(ActionEvent e) {
		String origen = this.vent.getLista_1().getSeleccion();
		String destino = this.vent.getLista_2().getSeleccion();
		monedaOrigen = new Libro(origen);
		monedaDestino = new Libro(destino);
		Integer cantidad = vent.getCantidad();
		Double aux = (monedaDestino.getValor() / monedaOrigen.getValor()) * cantidad;
		//Se pasa el valor a String para mostrar en pantalla con una longitud máxima de 5
		String conv = aux.toString();
		if (conv.length() > 5) {
			vent.setResultado(conv.substring(0, 5));
		} else {
			vent.setResultado(conv);
		}
	}
}



				
