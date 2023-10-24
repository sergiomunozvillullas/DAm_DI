package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.GestionBoton;
import model.Libro;

import controller.GestionBoton2;

public class JVentana2 extends JFrame
{
	private JLabel jlb1;
	private JLabel jlb2;
	private JLabel jlb3;
	private JLabel jlb4;
	
	private JTextField jtf1;
	private JTextField jtf2;
	private JTextField jtf3;
	private JTextField jtf4;
	
	private JButton jbt;
	
	private JVentana ventana1;
	
	public JVentana2(int x,int y,int ancho,int alto)
	{
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x,y,ancho,alto);
		
		this.ventana1 = ventana1;
		
		//etiqueta1
		jlb1 =new JLabel();
		jlb1.setBounds(45,100,100,20);
		jlb1.setText("ISBN");
		jtf1 = new JTextField();
		jtf1.setBounds(130,100,80,20);
		//etiqueta2
		jlb2 =new JLabel();
		jlb2.setBounds(45,130,100,20);
		jlb2.setText("Título");
		jtf2 = new JTextField();
		jtf2.setBounds(130,130,80,20);
		//etiqueta3
		jlb3 =new JLabel();
		jlb3.setBounds(45,160,100,20);
		jlb3.setText("Autor");
		jtf3 = new JTextField();
		jtf3.setBounds(130,160,80,20);
		//etiqueta4
		jlb4 =new JLabel();
		jlb4.setBounds(45,190,100,20);
		jlb4.setText("Precio");
		jtf4 = new JTextField();
		jtf4.setBounds(130,190,80,20);
		//b
		jbt = new JButton();
		jbt.setBounds(90, 270, 100, 20);
		jbt.setText("Cerrar");
		
		
		GestionBoton2 gb2 = new GestionBoton2(this);
		jbt.addActionListener(gb2);
		
		
		
		this.add(jtf1);
		this.add(jlb1);
		this.add(jtf2);
		this.add(jlb2);
		this.add(jtf3);
		this.add(jlb3);
		this.add(jtf4);
		this.add(jlb4);
		this.add(jbt);
		
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

	public JLabel getJlb4() {
		return jlb4;
	}

	public void setJlb4(JLabel jlb4) {
		this.jlb4 = jlb4;
	}

	public JTextField getJtf1() {
		return jtf1;
	}

	public void setJtf1(JTextField jtf1) {
		this.jtf1 = jtf1;
	}

	public JTextField getJtf2() {
		return jtf2;
	}

	public void setJtf2(JTextField jtf2) {
		this.jtf2 = jtf2;
	}

	public JTextField getJtf3() {
		return jtf3;
	}

	public void setJtf3(JTextField jtf3) {
		this.jtf3 = jtf3;
	}

	public JTextField getJtf4() {
		return jtf4;
	}

	public void setJtf4(JTextField jtf4) {
		this.jtf4 = jtf4;
	}

	public JButton getJbt() {
		return jbt;
	}

	public void setJbt(JButton jbt) {
		this.jbt = jbt;
	}

	
}
