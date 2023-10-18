package model;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JLista implements ListSelectionListener{
	
	private DefaultListModel monedas;//modelo de lista que se le pasa a JList
	private JList list;
	private String seleccion="Euro";
	
	public JLista(int x,int y,int ancho,int alto) {
		
		monedas=new DefaultListModel();
		monedas.addElement("Euro");
		monedas.addElement("Yuan");
		monedas.addElement("Dolar");
		
		list=new JList(monedas);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);//Selección única
		list.setSelectedIndex(0);
		list.setBounds(x, y, ancho, alto);
		list.setVisible(true);
		list.addListSelectionListener(this);
						
	}

	public JList getList() {
		return list;
	}

	//Este método se debe crear cuando se implementa la interfaz
	@Override
	public void valueChanged(ListSelectionEvent e) {
		seleccion=(String) this.list.getSelectedValue();
		
	}

	public String getSeleccion() {
		
		return this.seleccion;
	}

	public void setSeleccion(String seleccion) {
		this.seleccion =(String) this.list.getSelectedValue();
	}

	
}
