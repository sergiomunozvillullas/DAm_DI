package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import model.Libro;
import model.ListaLibros;
import view.JVentana;
import view.JVentana2;

public class GestionBoton implements ActionListener {
	//Atributos de la clase
	JVentana vent;
	JVentana2 vent2;
	Libro Libro;
	ListaLibros ListaLibros;
	ListaLibros Lista;

	// El constructor recibe una ventana para gestionar sus eventos
	public GestionBoton(JVentana v, JVentana2 v2) {
	    vent = v;
	    vent2 = v2;
	}
	//Se implementa el método de la interfaz
	@Override
	public void actionPerformed(ActionEvent e) {
		String ISBNBuscar = vent.getJtf1().getText();
		Lista = new ListaLibros();
		ComprobarLibro(ISBNBuscar);
	}
	
	private void ComprobarLibro(String ISBNBuscar) {
	    for (Libro libro : Lista.getListaLibros()) {
	        if (ISBNBuscar.equals(libro.getISBN())) {
	        	vent.setVisible(false); // Oculta la ventana actual
	            vent2.setTitle("Libro encontrado");
	            vent2.getJtf2().setText(libro.getISBN());
	            vent2.getJtf3().setText(libro.getTitulo());
	            vent2.getJtf4().setText(libro.getAutor());
	            vent2.getJtf5().setText(Double.toString(libro.getPrecio()));
	            vent2.setVisible(true); // Muestra la ventana 2
	            return;
	        }
	    }
	    // Si llegas a este punto, significa que no se encontró el libro y los escribe vacios
	    vent.setTitle("Libro no encontrado");

	}
}



				
