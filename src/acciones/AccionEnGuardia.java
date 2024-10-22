package acciones;

import unidades.Personaje;

public class AccionEnGuardia extends Accion{

	Personaje usuario;
	
	public AccionEnGuardia(Personaje usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public void ejecutar() {
		System.out.println("se puso en guardia recuperando parte de la estamina");
	}
	
}
