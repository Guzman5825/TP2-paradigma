package unidades;


import hechizos.*;
import objetos.Batallon;

public class Personaje {	//clase padre
	final private double vidaMaxima,energiaMaxima;
	private String nombre;
	private String tipo;
	private double vida,energia;//ataque sera reenplazado
	Hechizo estrategiaHechizo;
	///List<Hechizos>   //son los hechizos que pueden usar durante la batalla
	///List<Estados>	//estos se ejecutaran durante su turno
	///List<Consumibles>	///
	///todas las unidades una lista de estados 
	
	protected Personaje (String nombre,String tipo,double vidaMaxima,double energiaMaxima,double ataque) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.vidaMaxima=vidaMaxima;
		this.vida=vidaMaxima;
		this.energiaMaxima=energiaMaxima;
		this.energia=energiaMaxima;
	}
	
	public boolean puedeJugar() {
		return vida>0;	// si tiene mayor mas vida o si no esta petrificado
	}
	
	@Override
	public String toString() {
		return nombre+" HP: "+vida+"/"+vidaMaxima;//+" Energia: "+energia+"/"+energiaMaxima ;
	}

	public void pensarMejorEstrategia() {	///antes habia batallos
		///prolog funcionar 
		///ok aca hay que hacer una seria de pasos
		
		///tengo suficiente mana para lanzar un hechizo?
		
		///en caso contrario me pongo en guardia
		///si tiene poca vida usar este
		estrategiaHechizo=new Expeliarmus();
	}

	public boolean estaVivo() {
		return this.vida>0;
	}
	
	public boolean estaMuerto() {
		return this.vida<=0;
	}
	
	public void recibirDaño(double daño) {
		this.vida-=daño;
	}
	
	public void accionarEstrategia(Personaje objetivo) {
		// TODO Auto-generated method stub
		estrategiaHechizo.ejecutar(this,objetivo);
	}

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
		return estrategiaHechizo.nombre();
	}

	
}
