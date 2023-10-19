package model;

import java.util.ArrayList;
import java.util.List;

import model.Libro;

public class ListaLibros {
    private ArrayList<Libro> listaLibros = new ArrayList<>();

    public ListaLibros() {
        // Agregar objetos Libro al ArrayList
        listaLibros.add(new Libro("Libro 1", "123", "Hola", "Sergio", 12.3));
        listaLibros.add(new Libro("Libro 2", "1234", "Adios", "Juan", 2.4));
    }

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}


}