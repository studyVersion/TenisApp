import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Partido {
	
	
	
	Map<String,Equipo> listaEquipos = new HashMap<>();
	
	Map<String,Jugador> listaJugadores = new HashMap<>();
	
	
	public Partido()
	{
		listaEquipos = new HashMap<>();
		listaJugadores = new HashMap<>();
	}
	/*
	
	 * 
	 * Metodo para muestrar stats jugador
	 * 
	 * Medodo para muestrar stats Equipo
	 * */
	public int addJugador (Jugador u) {
		//Jugador u = new Jugador(name);
	    int codigo = 0;
	    String nombre = u.getJugNombre();
	    if (!listaJugadores.containsKey(nombre)) {
	    	listaJugadores.put(nombre, u);
	    }else {
	    	codigo = -1;
	    }
		
	 return codigo;
		
	}
	
	public int addEquipo(String name, Jugador uno, Jugador dos) {
		Equipo e = new Equipo(name,uno,dos);
		int codigo = 0;
		
		if (!listaEquipos.containsKey(name)) {
			listaEquipos.put(name, e);
		}else {
			codigo = -1;
		}
		
		return codigo;
		
	}
	
	
	public int contaPuntos(String nombreJug) {
		int codigo = 0 ;
		
		for(Entry<String, Jugador> jug : listaJugadores.entrySet()) {
	     codigo = 0;
	     if (jug.getKey().equals(nombreJug)) {
			
			int puntos = jug.getValue().getPuntosGanadores();
			puntos = puntos + 1;
			jug.getValue().setPuntosGanadores(puntos);
			break;
			
		 }else {codigo = -1;}
	  }
		   return codigo;
		
	}//contaPuntos
	
	public int contaError(String nombreJug) {
      int codigo = 0 ;
		
		for(Entry<String, Jugador> jug : listaJugadores.entrySet()) {
			codigo = 0;
			if (jug.getKey().contains(nombreJug)) {
			
			int puntos = jug.getValue().getErroresNoFuerzados();
			puntos = puntos + 1;
			
			jug.getValue().setErroresNoFuerzados(puntos);
			break;
			
		 }else {codigo = -1;}
	  }
		return codigo;

	}//contaError
	
	public int contaSaque(String nombreJug) {
		int codigo = 0 ;
		
		for(Entry<String, Jugador> jug : listaJugadores.entrySet()) {
			codigo = 0;
			if (jug.getKey().contains(nombreJug)) {
			
			int puntos = jug.getValue().getSaquesDirectos();
			puntos = puntos + 1;
			
			jug.getValue().setSaquesDirectos(puntos);
			break;
			
		 }else {codigo = -1;}
	  }
		return codigo;

		
	}
	
	public String statsJug(String nombreJug) {
	    String stats ="";
		 
		for(Entry<String, Jugador> jug : listaJugadores.entrySet()) {
			
			if (jug.getKey().equals(nombreJug)) {
				stats = jug.getValue().toString();
				break;
			
	   	   }else { stats =""; }
       }
		return stats;
		
   }//statsJug
	
	public String statsEquipo(String nombreEquipo) {
		String stats ="";
		
		for (Entry<String, Equipo> equipo : listaEquipos.entrySet() ) {
			if (equipo.getKey().equals(nombreEquipo)) {
				stats = equipo.getValue().toString();
				break;
				
			}else {stats ="";}
		}
		
		
		return stats;
		
	}//statsEqipo
}
