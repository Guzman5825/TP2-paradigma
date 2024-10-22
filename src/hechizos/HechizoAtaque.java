package hechizos;

import unidades.Personaje;

abstract public class HechizoAtaque extends Hechizo {	//hechizo podria ser interfaces
	protected Personaje lanzador, objetivo;
	
	public HechizoAtaque(Personaje lanzador, Personaje objetivo) {
		this.lanzador = lanzador;
		this.objetivo = objetivo;
	}

	public double getCosto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
