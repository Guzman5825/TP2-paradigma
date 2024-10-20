package objetos;

import unidades.Mago;

public class Juego {
	private Batallon batallon_1,batallon_2;
	private boolean turno;	
	
	public Juego() {	///agrego las variable
		super();
		turno=true; 	///rand();		
		this.batallon_1 = new Batallon();
		this.batallon_2 = new Batallon();
	}
	
	public void cargarDatos(){	///aca se da todos los datos que necesitamos 
		///leer batallon 2 y agregar jugadores
		///aca se cargar a los magos 
		batallon_1.agregarUnidad(Mago.crearMagoNormalConNombre("mago brincas"));
		batallon_1.agregarUnidad(Mago.crearMagoNormalConNombre("mago dormun"));
		///leer batallon 2 y agregar jugadores
		batallon_2.agregarUnidad(Mago.crearMagoNormalConNombre("mago npc1"));
		batallon_2.agregarUnidad(Mago.crearMagoNormalConNombre("mago npc2"));
		batallon_2.agregarUnidad(Mago.crearMagoNormalConNombre("mago npc3"));
	}

	public void jugar() {
		while(!this.estaTerminado())
			this.continuar();
	}
	
	private void continuar(){
		if(turno==true) {
			System.out.println("*****turno del batallon 1*****");
			batallon_1.accion(batallon_2);
		}
		else {
			System.out.println("*****turno del batallon 2*****");
			batallon_2.accion(batallon_1);
		}
			
		cambiarTurno();
	}
	
	private void cambiarTurno(){
		turno=!turno;
	}
	
	private boolean estaTerminado() {
		return batallon_1.estaVacio() || batallon_2.estaVacio();
	}
}
