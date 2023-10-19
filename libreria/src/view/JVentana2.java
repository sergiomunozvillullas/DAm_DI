package view;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.GestionBoton;
import model.Libro;

public class JVentana2 extends JFrame  {
	
	private JLabel jlb2;
	private JTextField jtf2;
	private JLabel jlb3;
	private JTextField jtf3;
	private JLabel jlb4;
	private JTextField jtf4;
	private JLabel jlb5;
	private JTextField jtf5;
	//private JLista lista_1;



	public JVentana2(int x,int y,int ancho, int alto) {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, ancho, alto);

		//Primera etiqueta
		jlb2=new JLabel();
		jlb2.setBounds(200,100, 150,25);
		jlb2.setText("ISBN");

		//primer campo de texto
		jtf2=new JTextField();
		jtf2.setBounds(200,130, 150, 25);
		
		//Primera etiqueta
		jlb3=new JLabel();
		jlb3.setBounds(200,150, 150,25);
		jlb3.setText("Titulo");

		//primer campo de texto
		jtf3=new JTextField();
		jtf3.setBounds(200,170, 150, 25);
		
		//Primera etiqueta
		jlb4=new JLabel();
		jlb4.setBounds(200,190, 150,25);
		jlb4.setText("Autor");

		//primer campo de texto
		jtf4=new JTextField();
		jtf4.setBounds(200,210, 150, 25);
		
		//Primera etiqueta
		jlb5=new JLabel();
		jlb5.setBounds(200,230, 150,25);
		jlb5.setText("Precio");

		//primer campo de texto
		jtf5=new JTextField();
		jtf5.setBounds(200,250, 150, 25);
		
		
		//Se añaden todos los elementos a la ventana
		this.add(jlb2);
		this.add(jtf2);
		this.add(jlb3);
		this.add(jtf3);
		this.add(jlb4);
		this.add(jtf4);
		this.add(jlb5);
		this.add(jtf5);
		this.setVisible(true);
	}






	public JLabel getJlb2() {
		return jlb2;
	}



	public void setJlb2(JLabel jlb2) {
		this.jlb2 = jlb2;
	}



	public JTextField getJtf2() {
		return jtf2;
	}



	public void setJtf2(JTextField jtf2) {
		this.jtf2 = jtf2;
	}



	public JLabel getJlb3() {
		return jlb3;
	}



	public void setJlb3(JLabel jlb3) {
		this.jlb3 = jlb3;
	}



	public JTextField getJtf3() {
		return jtf3;
	}



	public void setJtf3(JTextField jtf3) {
		this.jtf3 = jtf3;
	}



	public JLabel getJlb4() {
		return jlb4;
	}



	public void setJlb4(JLabel jlb4) {
		this.jlb4 = jlb4;
	}



	public JTextField getJtf4() {
		return jtf4;
	}



	public void setJtf4(JTextField jtf4) {
		this.jtf4 = jtf4;
	}



	public JLabel getJlb5() {
		return jlb5;
	}



	public void setJlb5(JLabel jlb5) {
		this.jlb5 = jlb5;
	}



	public JTextField getJtf5() {
		return jtf5;
	}



	public void setJtf5(JTextField jtf5) {
		this.jtf5 = jtf5;
	}




	
	
}
