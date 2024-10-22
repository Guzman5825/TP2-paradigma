package objetos;

import java.util.ArrayList;
import java.util.List;

import unidades.Personaje;

public class Batallon {
	List<Personaje> unidades;
	int turnoActual;
	
	public Batallon() {
		this.unidades = new ArrayList<Personaje>();
		this.turnoActual = 0;
	}

	public void agregarUnidad(Personaje unidad) {
		unidades.add(unidad);
	}

	public boolean estaVacio() {
		return unidades.isEmpty();
	}

	private Personaje obtenerJugadorActual() {
		if (turnoActual >= unidades.size())
			turnoActual = 0;
		return unidades.get(turnoActual);
	}

	private void siguienteTurno() {
		turnoActual++;
	}

	public void accion(Batallon batallon_2) {
		Personaje lanzador = obtenerJugadorActual();
		System.out.println("Turno: " + lanzador);
		System.out.println("Estado: " + lanzador.obtenerEstado());
		
		if (lanzador.puedeJugar()) {
			
			///en el objetivo hay que ver si llamo a liado o enemigo
			///si es hechizo curacion , ayudar aliado
			///si es hechizo de ataque, lanzarlo a enemigo
			///el objetivo varia segun el tipo de hechizo que voy a mandar
			//Personaje objetivo = lanzador.pensarObjetivo(batallon_1,batallon_2);
			
			Personaje objetivo= batallon_2.obtenerJugadorActual(); /*  OBTENER DE FORMA RANDOM*/
			
			lanzador.pensarAccion(objetivo);
			
			lanzador.pensarHechizo(objetivo);	///prolog , batallon 1 y 2 mandar por parametros
			
			//System.out.println(lanzador.getNombre()+ " ejecuto "+ lanzador.getNombreHechizo() 
			//				+ " a "+objetivo.getNombre());
			
			
			//lanzador.ejecutarHechizo();	//

			lanzador.ejecutarAccion();
			
			if(objetivo.estaMuerto()) {
				System.out.println("!!!"+objetivo.getNombre()+" ha muerto !!!");
				batallon_2.eliminar(objetivo);
			}
				
		} else
			System.out.println("no puede jugar"); /// imprimir jugador Atacante
		System.out.println("\n");
		siguienteTurno();
	}
	
	void eliminar(Personaje p){
		unidades.remove(p);
	}
	
}
