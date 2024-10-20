package hechizos;

import unidades.Personaje;

public class Expeliarmus implements Hechizo {
	
	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
		objetivo.recibirDaño(30);
		System.out.println(objetivo.getNombre() +" recibio 30 de danio");
	}

	@Override
	public String nombre() {
		return "EXPELIARMUS";
	}
	
}
