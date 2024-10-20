package hechizos;

import unidades.Personaje;

public interface Hechizo {
	void ejecutar(Personaje lanzador, Personaje objetivo);
	String nombre();
	///tipoHechizo : tipo positivo , negativo
}
