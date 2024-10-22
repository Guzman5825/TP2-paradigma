package unidades;

import java.util.ArrayList;
import java.util.List;

import acciones.Accion;
import hechizos.*;
import objetos.Batallon;

abstract public class Personaje { // clase padre
	final private double vidaMaxima, energiaMaxima;
	private String nombre;
	private String tipo;
	private double vida, energia;// ataque sera reenplazado

	Accion accion; /// lo mismo patron de diseño a la hora de pensar la accion
	
	Hechizo hechizo; /// aca se aplica el patron de diseño estrategia

	List<String> hechizosDisponibles; // son los hechizos que pueden usar durante la batalla
	/// List<Estados> //estos se ejecutaran durante su turno
	/// List<Consumibles> ///pertenencias
	/// todas las unidades una lista de estados

	protected Personaje(String nombre, String tipo, double vidaMaxima, double energiaMaxima) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.vidaMaxima = vidaMaxima;
		this.vida = vidaMaxima;
		this.energiaMaxima = energiaMaxima;
		this.energia = energiaMaxima;
		hechizosDisponibles = new ArrayList<String>();
	}

	public abstract void pensarAccion(Personaje objetivo);

	public void ejecutarAccion() {
		accion.ejecutar();
	}

	abstract public void pensarHechizo(Personaje objetivo);

	public void ejecutarHechizo() {
		hechizo.ejecutar();
	}

	public boolean tienePocaVida() {
		return vidaMaxima*0.3>=vida;
	}
	
	public boolean puedeJugar() {
		return vida > 0;
	}

	public boolean estaVivo() {
		return this.vida > 0;
	}

	public boolean estaMuerto() {
		return this.vida <= 0;
	}

	public void recibirDaño(double daño) {
		this.vida -= daño;
	}

	public void quitarEnergia(double energia) {
		this.energia-=energia;
	}
	
///////////////////////

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

	public double getVidaMaxima() {
		return vidaMaxima;
	}

	public double getEnergiaMaxima() {
		return energiaMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreHechizo() {
		return hechizo.getNombre();
	}

	public String obtenerEstado() {
		return "HP: " + vida + "/" + vidaMaxima + " Energia: " + energia + "/" + energiaMaxima;
	}

	@Override
	public String toString() {
		return nombre;// +" Energia: "+energia+"/"+energiaMaxima ;
	}

}
