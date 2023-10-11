package Vista;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Ventana {

	public Ventana() {
		    
	JFrame miVentana = new JFrame();
	miVentana.setLayout(null);
	miVentana.setBounds(200,200,300,200);

	
	
	JButton boton= new JButton("Enviar");
	boton.setBounds(100, 100, 100, 30);
	miVentana.add(boton);
	
    JLabel etiqueta = new JLabel("Nombre");
    etiqueta.setBounds(30, 10, 100, 30);
	miVentana.add(etiqueta);
	
	
	JTextField cajaTexto = new JTextField();
	cajaTexto.setBounds(100, 10, 100, 30);
	miVentana.add(cajaTexto);
	

	
    JLabel etiqueta2 = new JLabel("Password");
    etiqueta2.setBounds(30, 50, 100, 30);
	miVentana.add(etiqueta2);
	
	
	JPasswordField  cajaTexto2 = new JPasswordField ();
	cajaTexto2.setBounds(100, 50, 100, 30);
	miVentana.add(cajaTexto2);
	
	
	miVentana.setVisible(true);
	miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}

public static void main(String[] args ) {
	Ventana ventana=new Ventana();
}
}
