package libreria;

public class LibreriaOfertaFlex extends Libreria {
	private OfertaFlex oferta;
	
	public LibreriaOfertaFlex(OfertaFlex oferta){
        this.oferta = oferta;
    }

    public void setOferta(OfertaFlex oferta){
        this.oferta = oferta; 
    }

    public OfertaFlex getOferta(){
        return oferta;
    }

    @Override
    public void addLibro(String autor, String titulo, double precio){
        Libro libro = new Libro(autor, titulo, precio);

        if(oferta.getDescuento(libro) != 0){

            libro = new LibroOferta(autor, titulo, precio, oferta.getDescuento(libro));
        }

        anyadirLibro(libro);
    }

    @Override
    public String toString() {

        System.out.println(oferta.toString());

        return super.toString();
    }
}
