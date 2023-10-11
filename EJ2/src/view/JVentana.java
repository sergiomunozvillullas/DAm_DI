package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.GestionBoton;

import java.awt.FlowLayout;

public class JVentana extends JFrame {

		private JLabel jlb1;
		private JTextField jtf1;
		private JLabel jlb2;
		private JTextField jtf2;
		private JButton jbt;
	
	public JVentana(int x, int y, int ancho, int alto) {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x,y,ancho,alto);
		
		//1 etiqueta
		jlb1=new JLabel();
		jlb1.setBounds(30,100,50,20);
		jlb1.setText("Nombre");
		//1 campo texto
		jtf1=new JTextField();
		jtf1.setBounds(150,100,80,20);
		//2 etiqueta
		jlb2=new JLabel();
		jlb2.setBounds(30,130,100,20);
		jlb2.setText("Password");
		//2 campo texto
		jtf2=new JTextField();
		jtf2.setBounds(150,130,80,20);
		//Botón login
		jbt=new JButton();
		jbt.setBounds(30,200,80,20);
		jbt.setText("Login");
		
		GestionBoton gb=new GestionBoton(this);
		jbt.addActionListener(gb);
		
		this.add(jbt);
		this.add(jlb1);
		this.add(jlb2);
		this.add(jtf1);
		this.add(jtf2);
		this.setVisible(true);
		
}

	public JLabel getJlb1() {
		return jlb1;
	}

	public void setJlb1(JLabel jlb1) {
		this.jlb1 = jlb1;
	}

	public JTextField getJtf1() {
		return jtf1;
	}

	public void setJtf1(JTextField jtf1) {
		this.jtf1 = jtf1;
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

	public JButton getJbt() {
		return jbt;
	}

	public void setJbt(JButton jbt) {
		this.jbt = jbt;
	}
}