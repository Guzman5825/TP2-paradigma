package unidades;

import hechizos.Expeliarmus;

public class Profesor extends Mago{

	protected Profesor(String nombre, String tipo, double vidaMaxima, double energiaMaxima) {
		super(nombre, tipo, vidaMaxima, energiaMaxima);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pensarHechizo(Personaje objetivo) {
		super.hechizo = new Expeliarmus(this,objetivo);
		///o obtener habra cadabra
	}

	

}
