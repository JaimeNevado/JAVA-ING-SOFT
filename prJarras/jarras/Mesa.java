package jarras;

public class Mesa {
	private Jarra jarra1;
	private Jarra jarra2;
	
	public Mesa(Jarra j1, Jarra j2) {
		if (j1 == j2)
		{
			throw new RuntimeException("Las dos Jarras son iguales");
		}
		else
		{
			this.jarra1 = j1;
			this.jarra2 = j2;
		}
	}
	
	public Mesa(int capacidad1, int capacidad2) {
		jarra1 = new Jarra(capacidad1);
		jarra2 = new Jarra(capacidad2);
	}
	
	public int capacidad(int jarra) {
		int res;
		if (jarra == 1)
		{
			res = jarra1.capacidad();
		}else if (jarra == 2)
		{
			res = jarra2.capacidad();
		}else {
			throw new RuntimeException("ERROR, no existe esa jarra");
		}
		return res;
	}
 
	public int contenido(int jarra) {
		int res;
		if (jarra == 1)
		{
			res = jarra1.capacidad();
		}else if (jarra == 2)
		{
			res = jarra2.capacidad();
		}else {
			throw new RuntimeException("ERROR, no existe esa jarra");
		}
		return res;
	}
	
	public void llena(int jarra) {
		if (jarra == 1)
		{
			jarra1.llena();
		}else if (jarra == 2)
		{
			jarra2.llena();
		}else {
			throw new RuntimeException("ERROR, no existe esa jarra");
		}
	}
	
	public void vacia(int jarra) {
		if (jarra == 1)
		{
			jarra1.vacia();
		}else if (jarra == 2)
		{
			jarra2.vacia();
		}else {
			throw new RuntimeException("ERROR, no existe esa jarra");
		}
	}
	
	public void llenaDesde(int jarra) {
		if (jarra == 1)
		{
			jarra1.llenaDesde(jarra2);
		}else if (jarra == 2)
		{
			jarra2.llenaDesde(jarra1);
		}else {
			throw new RuntimeException("ERROR, no existe esa jarra");
		}
	}
	
	@Override
	public String toString() {
        return "M(" + jarra1 + ", " + jarra2 + ")";
	}
	
}
