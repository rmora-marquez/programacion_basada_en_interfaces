package programacioninterfaces;

public class CreandoTrabajador {
	
	public static void main(String[] args) {
		Herramienta herramienta = new Jeringa();
		
		Trabajador trabajador = new Trabajador();
		trabajador.setHerramienta(herramienta);
		
		System.out.println("El nombre de la herramienta del trabajador es "
				+ trabajador.getHerramienta().getNombre() );
	}
}
