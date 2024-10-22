package acciones;

import objetos.Batallon;
import unidades.Personaje;

public class AccionLanzarHechizo extends Accion{	
	///esta accion ya contiene toda la informacion 
	Personaje lanzador,objetivo;	///cambiar a luego multiples objetivos 
	
	public AccionLanzarHechizo(Personaje lanzador, Personaje objetivo) {
		super();
		this.lanzador = lanzador;
		this.objetivo = objetivo;
	}

	@Override
	public void ejecutar() {	///aca se ejecuta la accion
		lanzador.pensarHechizo(objetivo);
		
		System.out.println(lanzador+" ejecuto "+ lanzador.getNombreHechizo() +" a "+objetivo);
		
		lanzador.ejecutarHechizo();
	}

}
