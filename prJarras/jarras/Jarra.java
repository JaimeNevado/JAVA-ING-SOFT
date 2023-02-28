package jarras;

public class Jarra {
	private final int capacidad;
	private int contenido;

	public Jarra(int capacidad) {
		contenido = 0;
		if (capacidad <= 0) {
			throw new RuntimeException("La capacidad debe ser mayor que 0L");
		} else {
			this.capacidad = capacidad;
		}
	}

	public int capacidad() {
		return (this.capacidad);
	}

	public int contenido() {
		return (contenido);
	}

	public void llena() {
		contenido = capacidad;
	}

	public void vacia() {
		contenido = 0;
	}

	@Override
	public String toString() {

		return "J(" + capacidad + ", " + contenido + ")";
	}

	public void llenaDesde(Jarra j2) {
		if (j2 == this) {
			throw new RuntimeException("No se puede llegan la jarra consigo misma");
		}
		int espacioLibre = this.capacidad - this.contenido;
		if (espacioLibre >= j2.contenido) {
			contenido += j2.contenido;
			j2.contenido=0;
		} else {
			contenido = capacidad;
			j2.contenido -= espacioLibre;
		}
	}

}
