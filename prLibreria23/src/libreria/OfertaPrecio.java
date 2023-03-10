package libreria;

public class OfertaPrecio implements OfertaFlex {
	private double porcDescuento;
	private double umbralPrecio;
	
	public OfertaPrecio(double descuento, double umbral) {
		descuento = porcDescuento;
		umbral = umbralPrecio;
	}
    @Override
    public double getDescuento(Libro libro) {
        double porcentaje = 0;

        if(libro.getPrecioBase() >= umbralPrecio){

            porcentaje = porcDescuento;
        }

        return porcentaje;
    }

    @Override
    public String toString(){
        return porcDescuento+"% ("+umbralPrecio+")";
    }
}
