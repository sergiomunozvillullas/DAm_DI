package model;

import java.util.ArrayList;
import java.util.List;

public class ListaLibros 
{
	public List<Libro> libros = new ArrayList<Libro>();
	
	public ListaLibros ()
	{
		
		Libro Libro1 = new Libro("1111","Harry potter","Sara",29.99);
		Libro Libro2 = new Libro("2222","Los Increibles","Pedro",19.99);
		Libro Libro3 = new Libro("3333","Los pitufos","Juan",20);
		Libro Libro4 = new Libro("4444","Mickey Mouse","Luis",24.99);
		
		this.libros.add(Libro1);
		this.libros.add(Libro2);
		this.libros.add(Libro3);
		this.libros.add(Libro4);
		
	}//cons
	
	public boolean Buscarisbn (String isbn)
	{
		for (Libro libro : libros) 
		{
	        if (libro.getISBN().equals(isbn)) 
	        {
	            return true; 
	        }
	    }
	    return false;	
	}
	
	
	public List<Libro> getLibros() {
		return libros;
	}



	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}



	public ListaLibros(List<Libro> libros) {
		super();
		this.libros = libros;
	}
	
	
}//clase
