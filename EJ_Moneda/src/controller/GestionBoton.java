package controller;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.loading.PrivateClassLoader;

import model.Moneda;
import view.JVentana;

public class GestionBoton implements ActionListener{


		JVentana vent;
		Moneda usr;
		public GestionBoton(JVentana v) {
			vent=v;
			usr=new Moneda();
		}
	
		
	public void actionPerformed(ActionEvent e) {
		String cantidad=vent.getJtf().getText();
		String opcionSeleccionada = (String) vent.getJcb1().getSelectedItem();
		CambioMoneda(cantidad,opcionSeleccionada);
	
	}
	
	private void CambioMoneda(String cantidad, String opcionSeleccionada) {
			double cantidaddouble = Double.parseDouble(cantidad);
		
	    if (opcionSeleccionada.equals("Dólar")) {
	        
	    	Double Cambio = cantidaddouble * 1.2;
	    	String cambiototal = ("El cambio es: " + Cambio);
	    	vent.getJlb3().setText(cambiototal);
	    	
	    }
	    
	    if (opcionSeleccionada.equals("Libra")) {
	        
	    	Double Cambio = cantidaddouble * 0.85;
	    	String cambiototal = ("El cambio es: " + Cambio);
	    	vent.getJlb3().setText(cambiototal);
	    	
	    }
	    
		
		
	}
	

}
