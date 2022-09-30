import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Partido {

	// Map<String,Equipo> listaEquipos = new HashMap<>();
	private Equipo equipoUno;
	private Equipo equipoDos;

	public Partido(String nombreEqUno, String nombreEqDos, String j1, String j2, String j3, String j4) {
		
		this.equipoUno = new Equipo(nombreEqUno, j1, j2);
		this.equipoDos = new Equipo(nombreEqDos, j3, j4);
	}

	public String statsJug(String nombreJug) {
		String stats = "";

		if (equipoUno.jugNombreExiste(nombreJug)) {
			stats = equipoUno.statsJug(nombreJug);
		} else if (equipoDos.jugNombreExiste(nombreJug)) {
			stats = equipoDos.statsJug(nombreJug);
		}

		return stats;

	}// statsJug

	public String statsEquipo(String nombreEquipo) {
		String stats = "";

		if (equipoUno.getNombreEquipo().equals(nombreEquipo)) {
			stats = equipoUno.toString();

		} else if (equipoDos.getNombreEquipo().equals(nombreEquipo)) {
			stats = equipoDos.toString();
		}

		return stats;

	}// statsEqipo
	
	public int addEstadisticas(int option, String nombreJug) {
		int codigo = -1;
		if (equipoUno.jugNombreExiste(nombreJug)) {
			equipoUno.addEstadisticas(option, nombreJug);
			codigo = 0;
		}else if (equipoDos.jugNombreExiste(nombreJug)) {
			equipoDos.addEstadisticas(codigo, nombreJug);
			codigo = 0;
		}
		
		return codigo;
		
	}//addEstadisticas
}
