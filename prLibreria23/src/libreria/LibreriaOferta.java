package libreria;

import java.util.Arrays;

public class LibreriaOferta extends Libreria{
	private double porcDescuento;
	private String[] autoresOferta;
		
	public LibreriaOferta(double porcDescuento, String[] autoresOferta) {
		super();
		this.setOferta(porcDescuento, autoresOferta);
	}

	
	public void setOferta(double porcDescuento, String[] autoresOferta){
		this.porcDescuento=porcDescuento;
		this.autoresOferta=autoresOferta.clone();
	}
	
	public String[] getOferta() {
		return this.autoresOferta.clone();
	}
	
	public double getDescuento() {
		return porcDescuento;
	}
	
	@Override
	/**
	 * Sobreescribe el método añadir libro añadiento un libro si el autor está entre los autores en oferta.
	 */
	public void addLibro(String autor, String titulo, double precioBase) {
		Libro nuevo;
		if (esAutorOferta(autor)) {
			nuevo=new LibroOferta(autor, titulo, precioBase, porcDescuento);
		}else {
			nuevo=new Libro(autor, titulo, precioBase);
		}
		this.anyadirLibro(nuevo);
	}

	/**
	 * Verifica que el autor se encuentra en el array de autores en oferta
	 * @param autor
	 * @return
	 */
	private boolean esAutorOferta(String autor) {
		boolean state = false;
		int i = 0;
		while (i < this.autoresOferta.length && state==false) {
			if(autoresOferta[i].equalsIgnoreCase(autor)) {
				state=true;
			}
			++i;
		}
		return state;
	}
	
	@Override
	public String toString() {
		return this.porcDescuento+"%"+Arrays.toString(this.autoresOferta)+super.toString();
	}
}