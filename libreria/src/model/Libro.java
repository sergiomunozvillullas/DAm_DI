package model;


public class Libro {
	private String nombre;
	private float valor;
	
	public Libro(String nombre, float d) {
		super();
		this.nombre = nombre;
		this.valor = d;
	}
	//Este constructor recibe un nombre de moneda y le pone su valor
	public Libro(String moneda) {
		switch (moneda) {
		case "Yuan": this.setNombre(moneda);this.setValor(7.71F);break;
		case "Dolar":this.setNombre(moneda);this.setValor(1.05F);break;
		case "Euro":this.setNombre(moneda);this.setValor(1.0F);break;
		default: break;
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	

}
