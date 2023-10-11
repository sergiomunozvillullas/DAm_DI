package controller;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.loading.PrivateClassLoader;

import model.Moneda;
import view.JVentana;

public class GestionBoton implements ActionListener{


		JVentana vent;
		Moneda objmoneda;
		public GestionBoton(JVentana v) {
			vent=v;
			objmoneda=new Moneda();
		}
	
		
	public void actionPerformed(ActionEvent e) {
		String cantidad=vent.getJtf().getText();
		String opcionSeleccionada = (String) vent.getJcb1().getSelectedItem();
		String opcionSeleccionada2 = (String) vent.getJcb2().getSelectedItem();
		CambioMoneda(cantidad,opcionSeleccionada,opcionSeleccionada2);
	
	}
	
	private void CambioMoneda(String cantidad, String opcionSeleccionada, String opcionSeleccionada2) {
			double cantidaddouble = Double.parseDouble(cantidad);
		
	    if (opcionSeleccionada.equals("Euro")&&opcionSeleccionada2.equals("Dólar")) {
	        
	    	Double Cambio = cantidaddouble * 1.2;
	    	objmoneda.setDinero(Cambio);
	    	objmoneda.setNombre("Dólar");
	    	String cambiototal = ("El cambio es: " +objmoneda.getDinero());
	    	vent.getJlb3().setText(cambiototal);

	    	
	    }
	    
	    if (opcionSeleccionada.equals("Euro")&&opcionSeleccionada2.equals("Libra")) {
	        
	    	Double Cambio = cantidaddouble * 0.85;
	    	String cambiototal = ("El cambio es: " + Cambio);
	    	vent.getJlb3().setText(cambiototal);
	    	
	    }
	    
	    if (opcionSeleccionada.equals("Euro")&&opcionSeleccionada2.equals("Euro")) {
	        
	    	Double Cambio = cantidaddouble * 1;
	    	String cambiototal = ("El cambio es: " + Cambio);
	    	vent.getJlb3().setText(cambiototal);
	    	
	    }
	    
	    if (opcionSeleccionada.equals("Dólar")&&opcionSeleccionada2.equals("Euro")) {
	        
	    	Double Cambio = cantidaddouble * 0.85;
	    	String cambiototal = ("El cambio es: " + Cambio);
	    	vent.getJlb3().setText(cambiototal);
	    	
	    }
	    
	    if (opcionSeleccionada.equals("Dólar")&&opcionSeleccionada2.equals("Libra")) {
	        
	    	Double Cambio = cantidaddouble * 0.75;
	    	String cambiototal = ("El cambio es: " + Cambio);
	    	vent.getJlb3().setText(cambiototal);
	    	
	    }
	    
	    if (opcionSeleccionada.equals("Dólar")&&opcionSeleccionada2.equals("Dólar")) {
	        
	    	Double Cambio = cantidaddouble * 1;
	    	String cambiototal = ("El cambio es: " + Cambio);
	    	vent.getJlb3().setText(cambiototal);
	    	
	    }
	    
	    if (opcionSeleccionada.equals("Libra")&&opcionSeleccionada2.equals("Euro")) {
	        
	    	Double Cambio = cantidaddouble * 1.15;
	    	String cambiototal = ("El cambio es: " + Cambio);
	    	vent.getJlb3().setText(cambiototal);
	    	
	    }
	    
	    if (opcionSeleccionada.equals("Libra")&&opcionSeleccionada2.equals("Dólar")) {
	        
	    	Double Cambio = cantidaddouble * 1.35;
	    	String cambiototal = ("El cambio es: " + Cambio);
	    	vent.getJlb3().setText(cambiototal);
	    	
	    }
	    
	    if (opcionSeleccionada.equals("Libra")&&opcionSeleccionada2.equals("Libra")) {
	        
	    	Double Cambio = cantidaddouble * 1;
	    	String cambiototal = ("El cambio es: " + Cambio);
	    	vent.getJlb3().setText(cambiototal);
	    	
	    }
		
	    
		
	}
	

}
