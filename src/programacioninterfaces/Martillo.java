package programacioninterfaces;

public class Martillo implements Herramienta {

	@Override
	public String getNombre() {		
		return "Martillo";
	}

	@Override
	public String getHabilidad() {
		return "Golpear clavos";
	}

}
