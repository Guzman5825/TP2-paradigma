package hechizos;

import unidades.Personaje;

public class Expeliarmus extends HechizoAtaque {
	
	public Expeliarmus(Personaje lanzador, Personaje objetivo) {
		super(lanzador, objetivo);
	}

	public String getNombre() {
		return "EXPELIARMUS";
	}

	public void ejecutar() {
		super.objetivo.recibirDaño(30);	///esto es por la clase padre
		System.out.println(super.objetivo.getNombre() +" recibio 30 de danio");
	}

	@Override
	public double getCosto() {
		return 30.0;
	}
	
}
