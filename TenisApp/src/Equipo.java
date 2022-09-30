
public class Equipo {

	private String nombreEquipo;
	private Jugador primero;
	private Jugador segundo;

	public Equipo(String nombreEquipo, String nombreJugUno, String nombreJugDos) {

		this.nombreEquipo = nombreEquipo;
		this.primero = new Jugador(nombreJugUno);
		this.segundo = new Jugador(nombreJugDos);
		
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Jugador getPrimero() {
		return primero;
	}

	public void setPrimero(Jugador primero) {
		this.primero = primero;
	}

	public Jugador getSegundo() {
		return segundo;
	}

	public void setSegundo(Jugador segundo) {
		this.segundo = segundo;
	}

	public void setSecondo(Jugador secondo) {
		this.segundo = secondo;
	}

	public int addEstadisticas(int choice, String nombre) {
		int codigo = -1;

		if (choice == 1 && primero.getJugNombre().equals(nombre)) {
			primero.anadePuntos();
			codigo = 0;

		} else if (choice == 1 && segundo.getJugNombre().equals(nombre)) {
			segundo.anadePuntos();
			codigo = 0;
		}

		if (choice == 2 && primero.getJugNombre().equals(nombre)) {
			primero.anadeErrores();
			codigo = 0;

		} else if (choice == 2 && segundo.getJugNombre().equals(nombre)) {
			segundo.anadeErrores();
			codigo = 0;
		}
		if (choice == 3 && primero.getJugNombre().equals(nombre)) {
			primero.anadeSaques();
			codigo = 0;

		} else if (choice == 3 && segundo.getJugNombre().equals(nombre)) {
			segundo.anadeSaques();
			codigo = 0;
		}
		return codigo;

	}

	public String statsJug(String nombreJug) {
		String value = "";
		if (primero.getJugNombre().equals(nombreJug)) {
			value = primero.toString();
		} else if (segundo.getJugNombre().equals(nombreJug)) {
			value = segundo.toString();
		}
		return value;
	}

	public boolean jugNombreExiste(String nombreJug) {
		boolean fact = false;
		if (primero.getJugNombre().equals(nombreJug)) {
			fact = true;
		}
		if (segundo.getJugNombre().equals(nombreJug)) {
			fact = true;
		}
		return fact;
	}

	@Override
	public String toString() {
		String info = "Equipo: " + nombreEquipo + "\nPuntos Ganadores: "
				+ (primero.getPuntosGanadores() + segundo.getPuntosGanadores()) + "\nErrores No Fuerzados: "
				+ (primero.getErroresNoFuerzados() + segundo.getErroresNoFuerzados()) + "\nSaques Directos: "
				+ (primero.getSaquesDirectos() + segundo.getSaquesDirectos());
		return info;
	}

}
