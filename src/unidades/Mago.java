package unidades;

public class Mago extends Personaje{

	private Mago(String nombre, String tipo, double vidaMaxima, double energiaMaxima, double ataque) {
		super(nombre, tipo, vidaMaxima, energiaMaxima, ataque);
		// TODO Auto-generated constructor stub
	}
	
	public static Mago crearMagoNormal() {	///factory???
		return new Mago("mago normal","normal",100,100,20); 
	}

	public static Mago crearMagoNormalConNombre(String nombre) {	///factory???
		return new Mago(nombre,"normal",100,100,20); 
	}

	
}
