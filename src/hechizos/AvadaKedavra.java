package hechizos;

import unidades.Personaje;

public class AvadaKedavra extends HechizoAtaque {

	public AvadaKedavra(Personaje lanzador, Personaje objetivo) {
		super(lanzador, objetivo);
	}

	@Override
	public void ejecutar() {
		double daño=super.objetivo.getVida();
		super.objetivo.recibirDaño(daño);	///esto es por la clase padre
		System.out.println(super.objetivo.getNombre() +" recibio !!!!"+daño+" de danio");
	}

	@Override
	public String getNombre() {
		return "AvadaKedavra";
	}

	
}
