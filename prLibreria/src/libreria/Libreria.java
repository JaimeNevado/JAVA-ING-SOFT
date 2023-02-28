package libreria;

import java.util.ArrayList;

public class Libreria {
	private ArrayList<Libro> libs;

	public Libreria() {
		libs = new ArrayList<>();
	}

	public void addLibro(String autor, String titulo, double precioBase) {
		Libro libro = new Libro(autor, titulo, precioBase);
		anyadirLibro(libro);
	}

	public void remLibro(String autor, String titulo) {
	    int pos = buscarLibro(autor, titulo);
	    if (pos == -1){
	        throw new RuntimeException("Libro no encontrado");
	    } else {
	        // Si lo encuentra, eliminamos el libro
	        libs.remove(pos);
	    }
	}
	

	public double getPrecioFinal(String autor, String titulo) {
		if (buscarLibro(autor, titulo) == -1) {
			throw new RuntimeException("Libro no encontrado");
		} else {
			int pos = buscarLibro(autor, titulo);
			return (libs.get(pos)).getPrecioFinal();
		}
	}

	@Override
	public String toString() {
		return libs.toString();
	}

	private void anyadirLibro(Libro libro) {
		int pos = buscarLibro(libro.getAutor(), libro.getTitulo());
		if (pos == -1) {
			// El libro no está por lo que lo añado al final
			libs.add(libro);
		} else {
			// Exista el libro y hay que reemplazarlo
			libs.set(pos, libro);
		}
	}

	 private int buscarLibro(String autor, String titulo){
	        int i = 0, encontrado = -1;     // «encontrado» cambiara solo cuando se encuentre el libro.

	        while(i < libs.size() && encontrado == -1){     // Debe detenerse si encuentra el libro o ya no hay mas que evaluar.
	            if(autor.equalsIgnoreCase((libs.get(i)).getAutor()) && titulo.equalsIgnoreCase((libs.get(i)).getTitulo())){
	                encontrado = i;
	            }else{
	                i++;
	            }
	        }

	        return encontrado;
	    }
}
