package anonimo;
import libreria.Libreria;


public class PruebaLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libreria dumas=new Libreria();
		
		
		//Añadimos todos los libros a la libreria dumas
		dumas.addLibro("george orwell", "1984", 8.2);
		dumas.addLibro("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?", 3.50);
		dumas.addLibro("Isaac Asimov", "Fundación e Imperio", 9.40);
		dumas.addLibro("Ray Bradbury", "Fahrenheit 451", 7.40);
		dumas.addLibro("Aldous Huxley", "Un Mundo Feliz", 6.50);
		dumas.addLibro("Isaac Asimov", "La Fundación", 7.30);
		dumas.addLibro("William Gibson", "Neuromante", 8.30);
		dumas.addLibro("Isaac Asimov", "Segunda Fundación", 8.10);
		dumas.addLibro("Isaac Newton", "arithmetica universalis", 7.50);
		dumas.addLibro("George Orwell", "1984", 6.20);
		dumas.addLibro("Isaac Newton", "Arithmetica Universalis", 10.50);
		
		
		//Imprimimos por pantalla la librería dumas después de añadir los libros
		System.out.println(dumas);
		System.out.println();
		
	
		
		//Borrar los libros de la librería dumas
		dumas.remLibro("George Orwell", "1984");
        dumas.remLibro("Aldous Huxley", "Un Mundo Feliz");
        dumas.remLibro("Isaac Newton", "Arithmetica Universalis");

        //Imprimimos por pantalla la librería dumas después de haber borrado los libros
        System.out.println(dumas);
        System.out.println();

        
        //Precio Final
        System.out.print("PrecioFinal(Philip K. Dick, ¿Sueñan los androides con ovejas eléctricas?): ");
        System.out.println(dumas.getPrecioFinal("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?"));
        
        System.out.print("PrecioFinal(isaac asimov, fundación e imperio):  ");
        System.out.println(dumas.getPrecioFinal("isaac asimov", "fundación e imperio"));
        
        System.out.print("PrecioFinal(Ray Bradbury, Fahrenheit 451):  ");
        System.out.println(dumas.getPrecioFinal("Ray Bradbury", "Fahrenheit 451"));
        
        System.out.print("PrecioFinal(Isaac Asimov, La Fundación):  ");
        System.out.println(dumas.getPrecioFinal("Isaac Asimov", "La Fundación"));
        
        System.out.print("PrecioFinal(william gibson, neuromante):   ");
        System.out.println(dumas.getPrecioFinal("william gibson", "neuromante"));
        
        System.out.print("PrecioFinal(Isaac Asimov, Segunda Fundación):   ");
        System.out.println(dumas.getPrecioFinal("Isaac Asimov", "Segunda Fundación"));
        
        System.out.print("PrecioFinal(Isaac Newton, Arithmetica Universalis):   ");
        System.out.println(dumas.getPrecioFinal("Isaac Newton", "Arithmetica Universalis"));
        
        
        
        //" + dumas.getPrecioFinal("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?"));
        
        /*		
        System.out.println(getPrecioFinal(isaac asimov, fundación e imperio):  " + dumas.getPrecioFinal("isaac asimov", "fundación e imperio"));
        System.out.println(getPrecioFinal(Ray Bradbury, Fahrenheit 451):   " + dumas.getPrecioFinal("Ray Bradbury", "Fahrenheit 451"));
        System.out.println(getPrecioFinal(Alex Huxley, Un Mundo Feliz):    " + dumas.getPrecioFinal("Alex Huxley", "Un Mundo Feliz"));
        System.out.println(getPrecioFinal(Isaac Asimov, La Fundación): " + dumas.getPrecioFinal("Isaac Asimov", "La Fundación"));
        System.out.println(getPrecioFinal(william gibson, neuromante): " + dumas.getPrecioFinal("william gibson", "neuromante"));
        System.out.println(getPrecioFinal(Isaac Asimov, Segunda Fundación):    " + dumas.getPrecioFinal("Isaac Asimov", "Segunda Fundación"));
        System.out.println(getPrecioFinal(Isaac Newton, Arithmetica Universalis):  " + dumas.getPrecioFinal("Isaac Newton", "Arithmetica Universalis"));
	*/
	}

}
