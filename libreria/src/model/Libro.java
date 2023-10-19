package model;


public class Libro {
	private String nombre;
	private String ISBN;
	private String titulo;
	private String autor;
	private Double precio;
	
	public Libro(String nombre, String ISBN, String titulo, String autor, Double precio) {
		super();
		this.nombre = nombre;
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setValor(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", precio="
				+ precio + "]";
	}
	
	

}
