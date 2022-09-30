
public class Jugador {

	private String jugNombre;
	private int puntosGanadores;
	private int erroresNoFuerzados;
	private int saquesDirectos;

	public Jugador(String jugNombre) {

		this.jugNombre = jugNombre;
		this.puntosGanadores = 0;
		this.erroresNoFuerzados = 0;
		this.saquesDirectos = 0;
	}

	public String getJugNombre() {
		return jugNombre;
	}

	public void setJugNombre(String jugNombre) {
		this.jugNombre = jugNombre;
	}

	public int getPuntosGanadores() {
		return puntosGanadores;
	}

	public void setPuntosGanadores(int puntosGanadores) {
		this.puntosGanadores = puntosGanadores;
	}

	public int getErroresNoFuerzados() {
		return erroresNoFuerzados;
	}

	public void setErroresNoFuerzados(int erroresNoFuerzados) {
		this.erroresNoFuerzados = erroresNoFuerzados;
	}

	public int getSaquesDirectos() {
		return saquesDirectos;
	}

	public void setSaquesDirectos(int saquesDirectos) {
		this.saquesDirectos = saquesDirectos;
	}

	@Override
	public String toString() {
		return "\nNombre y Apellido: " + jugNombre + "\nPuntos Ganadores: " + puntosGanadores
				+ "\nErrores No Fuerzados:" + erroresNoFuerzados + "\nSaques Directos: " + saquesDirectos;
	}

	public void anadePuntos() {
		puntosGanadores++;

	}

	public void anadeErrores() {
		erroresNoFuerzados++;

	}

	public void anadeSaques() {
		saquesDirectos++;

	}

}
