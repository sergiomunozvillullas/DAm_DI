package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.loading.PrivateClassLoader;

import model.Usuario;
import view.JVentana;

public class GestionBoton implements ActionListener{


		JVentana vent;
		Usuario usr;
		public GestionBoton(JVentana v) {
			vent=v;
			usr=new Usuario();
		}
	
		
	public void actionPerformed(ActionEvent e) {
		String nombre=vent.getJtf1().getText();
		String psw=vent.getJtf2().getText();
		ComprobarUser(nombre,psw);
	
	}
	
	private void ComprobarUser(String nombre, String psw) {
		if(nombre.equals(usr.getNombre())&&(psw.equals(usr.getPsw()))) {
			vent.setTitle("Usuario encontrado");
		}else {
			vent.setTitle("Usuario no encontrado");
		}
		
		
	}
	

}
