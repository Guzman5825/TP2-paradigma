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
		System.out.println("turno de :" + lanzador);
		if (lanzador.puedeJugar()) {
				///en el objetivo hay que ver si llamo a liado o enemigo
			lanzador.pensarMejorEstrategia();	///prolog , batallon 1 y 2 mandar por parametros
			
			
			///si es hechizo curacion , ayudar aliado
			///si es hechizo de ataque, lanzarlo a enemigo
			///el objetivo varia segun el tipo de hechizo que voy a mandar
			//Personaje objetivo = lanzador.pensarObjetivo(batallon_1,batallon_2);
			Personaje objetivo= batallon_2.obtenerJugadorActual(); /*  OBTENER DE FORMA RANDOM*/
			
			System.out.println(lanzador.getNombre()+ " ejecuto "+ lanzador.getNombreHechizo() 
							+ " a "+objetivo.getNombre());
			
			
			lanzador.accionarEstrategia(objetivo);	///	

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
