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
import model.JLista;

public class JVentana extends JFrame  {
	
	private JLabel jlb1;
	private JLabel jlb2;
	private JButton jbt;
	private JTextField resultado;
	private JLista lista_1;
	private JTextField cantidad;
	private JLista lista_2;

	public JVentana(int x,int y,int ancho, int alto) {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, ancho, alto);
	
		//Primera etiqueta
		jlb1=new JLabel();
		jlb1.setBounds(30,100, 55,25);
		jlb1.setText("Monedas");
		
		//Primera lista
		lista_1= new JLista(85, 100, 40, 80);
	
		
		//Segunda lista
		lista_2= new JLista(250, 100,40, 80);
		
		//primer campo de texto
		cantidad=new JTextField();
		cantidad.setBounds(125,100, 30, 30);
				
		//Segunda etiqueta
		jlb2=new JLabel();
		jlb2.setBounds(30, 230,60, 20);
		jlb2.setText("Resultado");
		//Segundo campo de texto
		resultado=new JTextField();
		resultado.setBounds(30,250, 80, 20);
				
		//Botón de convertir
		jbt=new JButton();
		jbt.setBounds(30, 200, 90,20);
		jbt.setText("Convertir");
		//Se invoca la gestión del botón para esta ventana
		GestionBoton gb=new GestionBoton(this);
		jbt.addActionListener(gb);
		//Se añaden todos los elementos a la ventana
		this.add(jbt);
		this.add(jlb1);
		this.add(jlb2);
		this.add(lista_1.getList());
		this.add(lista_2.getList());
		this.add(resultado);
		this.add(cantidad);
		this.setVisible(true);
	}


	public Integer getCantidad() {
		String stg=this.cantidad.getText();
		Integer cnt = null;
		try {
			cnt=Integer.parseInt(stg);
		} catch (NumberFormatException e) {
			System.err.println("No se pudo convertir a numero la cantidad.Asegurese que se trata de un numero válido");
		}
		return cnt;
	}

	public void setCantidad(JTextField cantidad) {
		this.cantidad = cantidad;
	}

	public JLista getLista_1() {
		return lista_1;
	}

	public void setLista_1(JLista lista_1) {
		this.lista_1 = lista_1;
	}

	public JTextField getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado.setText(resultado);
	}

	public JLista getLista_2() {
		return lista_2;
	}

	public void setLista_2(JLista lista_2) {
		this.lista_2 = lista_2;
	}

	
}
