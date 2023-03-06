/**
 * 
 */
package libreria;

/**
 * @author Jaime Nevado Farfán
 *
 */
public class LibroOferta extends Libro {
	private double porcDescuento;

	/**
	 * Constructor de la clase LibroOferta
	 * @param autor
	 * @param titulo
	 * @param precioBase
	 * @param porcDescuento
	 */
	public LibroOferta(String autor, String titulo, double precioBase, double porcDescuento) {
		super(autor, titulo, precioBase);
		this.porcDescuento = porcDescuento;
	}
	
	
	/**
	 * Permite consultar el descuento de este libro
	 * @return el descuento
	 */
	public double getDescuento() {
		return porcDescuento;
	}
	
	@Override
	/**
	 * Devuelve la baseImponible del libro con descuento
	 */
	protected double getBaseImponible() {
		return super.getBaseImponible()-super.getBaseImponible()*porcDescuento/100; 
	}
	
	@Override
	public String toString() {
		return "("+super.getAutor()+"; "+super.getTitulo()+"; "+super.getPrecioBase()+"; "+porcDescuento+"%; "+getBaseImponible()+"; "+super.getIVA()+"%; "+super.getPrecioFinal()+")";
	}

}
