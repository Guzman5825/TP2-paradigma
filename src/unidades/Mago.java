package unidades;

import acciones.*;

public abstract class Mago extends Personaje{
	
	protected Mago(String nombre, String tipo, double vidaMaxima, double energiaMaxima) {
		super(nombre, tipo, vidaMaxima, energiaMaxima);
	}
	
	@Override
	public void pensarAccion(Personaje objetivo) {
		///en guardia cuando tiene 20 de hp o no tiene mas de energia 

		if(tienePocaVida())
			this.accion= new AccionEnGuardia(this);
		else
			this.accion=new AccionLanzarHechizo(this,objetivo);
	}
	
}
