/**
 * 
 */
package libreria;

/**
 * @author Jaime Nevado Farfán
 *
 */
public class Libro {
	private String autor;
	private String titulo;
	private double precioBase;
	private static double porcIva=10.0;
	
	
	/**
	 * TIP = Ctrl + 7 comenta y descomenta
	 * Este es el constructor de la clase libro
	 * @param autor			Es el autor que escribió el libro
	 * @param titulo		Es el título del libro
	 * @param precioBase	Es el precio sin IVA del libro
	 */
	public Libro(String autor, String titulo, double precioBase) {
		this.autor=autor;
		this.titulo=titulo;
		this.precioBase=precioBase;
	}

	
	/**
	 * Nos da el autor del libro
	 * @return	Me devuelve el autor del libro
	 */
	public String getAutor() {
		return this.autor;
	}


	/**
	 * @return Devuelve el título
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @return  Devuelve el precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return  Devuelve el porcentaje de IVA
	 */
	public static double getPorcIva() {
		return porcIva;
	}


	/**
	 * @param Permite actualizar el porcenataje del IVA
	 */
	public static void setPorcIva(double porcIva) {
		Libro.porcIva = porcIva;
	}
	
	/**
	 * Retorna el Importe del libro sin IVA
	 * @return	Devuelve el precio Base
	 */
	protected double getBaseImponible() {
		return precioBase;
	}
	
	/**
	 * Devuelve el precio final del libro con IVA
	 * @return	El precio final con IVA
	 */
	public double getPrecioFinal() {
		return this.getBaseImponible() + this.getBaseImponible()*Libro.getPorcIva()/100;
	}
	
	@Override
	public String toString() {
		//(Isaac Asimov; La Fundación; 7.3; 10.0%; 8.03)
		return "("+autor+"; "+titulo+"; "+precioBase+"; "+porcIva+"%; "+this.getPrecioFinal()+")";
	}
	
	
	
	
	
	
}
