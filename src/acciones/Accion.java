package acciones;

import objetos.Batallon;
import unidades.Personaje;

public interface Accion {
	void ejecutar(Personaje jugador,Batallon batallon_1,Batallon batallon_2);
}
