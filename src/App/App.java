package App;

import objetos.Juego;

public class App {
	public static void main(String[] args) {
		Juego juego= new Juego();
		juego.cargarDatos();
		juego.jugar();
		
	}
}
