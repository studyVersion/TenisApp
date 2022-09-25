
public class Equipo {

	
	private String nombreEquipo;
	private Jugador primero;
	private Jugador segundo;
	
	
	public Equipo() {
		
	}
	
	public Equipo(String nombreEquipo, Jugador primero, Jugador secondo) {
        
		this.nombreEquipo = nombreEquipo;
		this.primero = primero;
		this.segundo = secondo;
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

	public Jugador getSecondo() {
		return segundo;
	}

	public void setSecondo(Jugador secondo) {
		this.segundo = secondo;
	}

	@Override
	public String toString() {
		String info = "Equipo: " + nombreEquipo 
				   + "\nPuntos Ganadores: " + (primero.getPuntosGanadores()+segundo.getPuntosGanadores()) 
		           + "\nErrores No Fuerzados: "+(primero.getErroresNoFuerzados()+segundo.getErroresNoFuerzados())
		           + "\nSaques Directos: "+ (primero.getSaquesDirectos()+segundo.getSaquesDirectos());
		return info;
	}
	
	
}
	
	
