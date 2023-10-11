package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.FlowLayout;

import controller.GestionBoton;

import java.awt.FlowLayout;

public class JVentana extends JFrame  {
		private JLabel  jlb1;
		private JLabel  jlb2;
		private JLabel  jlb3;
		private JComboBox<String> jcb1;
		private JComboBox<String> jcb2;
		private JButton jbt;
		private JTextField jtf;
		private JTextField jtf2;
	
	public JVentana(int x, int y, int ancho, int alto) {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x,y,ancho,alto);
		
		
		//1 etiqueta
		jlb1=new JLabel();
		jlb1.setBounds(30,100,250,20);
		jlb1.setText("Seleccione una moneda");
		
		//jcombo
        jcb1 = new JComboBox<>();
        jcb1.addItem("Dólar");  // OPcion1
        jcb1.addItem("Libra");   // OPcion 2
        jcb1.addItem("Euro");   // OPcion 2
        jcb1.setBounds(30, 120, 100, 20);  // Ajusta el tamaño del JComboBox según tus necesidades
        jcb1.setToolTipText("Selecciona una moneda");
        
		//jcombo2
        jcb2 = new JComboBox<>();
        jcb2.addItem("Dólar");  // OPcion1
        jcb2.addItem("Libra");   // OPcion 2
        jcb2.addItem("Euro");   // OPcion 2
        jcb2.setBounds(30, 150, 100, 20);  // Ajusta el tamaño del JComboBox según tus necesidades
        jcb2.setToolTipText("Selecciona una moneda");
		
		//1 etiqueta
		jlb2=new JLabel();
		jlb2.setBounds(200,100,250,20);
		jlb2.setText("Introducir cantidad");
		
		//1 campo texto
		jtf=new JTextField();
		jtf.setBounds(200,120,80,20);
		
		
		//2 etiqueta
		jlb3=new JLabel();
		jlb3.setBounds(200,200,300,20);
		jlb3.setText("");
		
		
		

		//Botón login
		jbt=new JButton();
		jbt.setBounds(30,200,100,20);
		jbt.setText("Cambiar");
		
		
		
		GestionBoton gb=new GestionBoton(this);
		jbt.addActionListener(gb);
		
		this.add(jbt);
		this.add(jlb1);
		this.add(jcb1);
		this.add(jcb2);
		this.add(jtf);
		this.add(jlb2);
		this.add(jlb3);
		this.setVisible(true);
		
}

	public JLabel getJlb1() {
		return jlb1;
	}

	public void setJlb1(JLabel jlb1) {
		this.jlb1 = jlb1;
	}

	public JLabel getJlb2() {
		return jlb2;
	}

	public void setJlb2(JLabel jlb2) {
		this.jlb2 = jlb2;
	}

	public JLabel getJlb3() {
		return jlb3;
	}

	public void setJlb3(JLabel jlb3) {
		this.jlb3 = jlb3;
	}

	public JComboBox<String> getJcb1() {
		return jcb1;
	}

	public void setJcb1(JComboBox<String> jcb1) {
		this.jcb1 = jcb1;
	}

	public JComboBox<String> getJcb2() {
		return jcb2;
	}

	public void setJcb2(JComboBox<String> jcb2) {
		this.jcb2 = jcb2;
	}

	public JButton getJbt() {
		return jbt;
	}

	public void setJbt(JButton jbt) {
		this.jbt = jbt;
	}

	public JTextField getJtf() {
		return jtf;
	}

	public void setJtf(JTextField jtf) {
		this.jtf = jtf;
	}

	public JTextField getJtf2() {
		return jtf2;
	}

	public void setJtf2(JTextField jtf2) {
		this.jtf2 = jtf2;
	}


}