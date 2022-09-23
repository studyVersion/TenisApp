
public class Jugador {
       
	
	  private String jugNombre;
	  private int puntosGanadores;
	  private int erroresNoFuerzados;
	  private int saquesDirectos;
	  
	  
   public Jugador() {
	   
   }
     
	  
	public Jugador(String jugNombre, int puntosGanadores, int erroresNoFuerzados, int saquesDirectos) {
	
	this.jugNombre = jugNombre;
	this.puntosGanadores = puntosGanadores;
	this.erroresNoFuerzados = erroresNoFuerzados;
	this.saquesDirectos = saquesDirectos;
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
		return "Jugador [jugNombre=" + jugNombre + ", puntosGanadores=" + puntosGanadores + ", erroresNoFuerzados="
				+ erroresNoFuerzados + ", saquesDirectos=" + saquesDirectos + "]";
	}
	
	
}
