package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.GestionBoton;
import model.Libro;

public class JVentana extends JFrame
{
	
	private JLabel jlb1;
	private JTextField jtf1;
	private JButton jbt;
	
	
	
	public JVentana(int x,int y,int ancho,int alto)
	{
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x,y,ancho,alto);
		
		//e1
		jlb1 =new JLabel();
		jlb1.setBounds(45,130,100,20);
		jlb1.setText("ISBN");
		//etiqueta2
		jtf1 = new JTextField();
		jtf1.setBounds(130,130,80,20);
		//b
		jbt = new JButton();
		jbt.setBounds(70, 170, 100, 20);
		jbt.setText("Buscar");
		
		
		GestionBoton gb = new GestionBoton(this);
		jbt.addActionListener(gb);
		
		this.add(jtf1);
		this.add(jlb1);
		this.add(jbt);
		
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

	public JButton getJbt() {
		return jbt;
	}

	public void setJbt(JButton jbt) {
		this.jbt = jbt;
	}//cons

	
}//clase
