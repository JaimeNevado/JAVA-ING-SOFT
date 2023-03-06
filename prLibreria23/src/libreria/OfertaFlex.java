package libreria;

/**
 * Calcula y devuelve el porcentaje de descuento que se debe aplicar a un determinado libro recibido
 * como parámetro. En caso de que no se deba aplicar ningún descuento, devolverá el valor cero.
 * 
 * @author Jaime Nevado Farfán
 * @param libro
 * @return descuento
 *
 */

public interface OfertaFlex {
	double getDescuento(Libro libro);
}
