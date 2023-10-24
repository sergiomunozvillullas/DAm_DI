package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Libro;
import model.ListaLibros;
import view.JVentana;
import view.JVentana2;

public class GestionBoton2 implements ActionListener
{
	
	JVentana2 vent2;
	Libro libro;
	ListaLibros ListaLibro;
	
/***************************************************************************************/
	
	public GestionBoton2( JVentana2 v2)
	{

		vent2 = v2;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		
		if(source== vent2.getJbt())
		{
			vent2.dispose();
			JVentana miVentana = new JVentana(60,60,350,400);
		}
	}
}