
public class Equipo {

	
	private String nombreEquipo;
	private Jugador primero;
	private Jugador secondo;
	
	
	public Equipo() {
		
	}
	
	public Equipo(String nombreEquipo, Jugador primero, Jugador secondo) {
        
		this.nombreEquipo = nombreEquipo;
		this.primero = primero;
		this.secondo = secondo;
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
		return secondo;
	}

	public void setSecondo(Jugador secondo) {
		this.secondo = secondo;
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", primero=" + primero + ", secondo=" + secondo + "]";
	}
	
	
}
	
	
