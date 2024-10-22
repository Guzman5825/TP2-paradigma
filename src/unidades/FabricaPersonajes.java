package unidades;

public class FabricaPersonajes {
	
	static public Personaje crearProfesorPromedio(String nombre){
		return new Profesor(nombre,"humano",120,120);
	}
}
