package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Libro;
import model.ListaLibros;
import view.JVentana;
import view.JVentana2;

public class GestionBoton implements ActionListener
{
	
	JVentana vent;
	JVentana2 vent2;
	Libro libro;
	ListaLibros ListaLibro;
	
/***************************************************************************************/
	
	public GestionBoton(JVentana v)
	{
		vent = v;
	}
	
/***************************************************************************************/
	
	@Override	
	public void actionPerformed(ActionEvent e) 
	{
		String buscarISBN = vent.getJtf1().getText();
		ListaLibro  = new ListaLibros();
		comprobarLibro(buscarISBN);
	
	}//a
	
	
/***************************************************************************************/	
	
	private void comprobarLibro(String buscarISBN)
	{
		for (Libro libro : ListaLibro.getLibros()) 
		{
	        if (buscarISBN.equals(libro.getISBN())) 
	        {
	        	vent.setVisible(false);
	        	JVentana2 miVentana2 = new JVentana2(60,60,350,400);
	        	
	        	miVentana2.getJtf1().setText(libro.getISBN());
	        	miVentana2.getJtf2().setText(libro.getTitulo());
	        	miVentana2.getJtf3().setText(libro.getAutor());
	        	String precio = String.valueOf(libro.getPrecio());
	        	miVentana2.getJtf4().setText(precio);
	        	
	        }
	        else
	        {
	        	vent.setTitle("Libro no encontrado");
	        }
	    }		
		
	}//comprobar
	
}//clase
