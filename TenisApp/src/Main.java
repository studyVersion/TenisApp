
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Jugador a = new Jugador("rafa", 10,1,2);
		Jugador b = new Jugador("soso", 10,1,2);
		
		Equipo ab = new Equipo("espania",a,a);
		
		
		System.out.println(ab.getPrimero().getJugNombre());
	}

}
