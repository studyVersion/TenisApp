import java.util.Scanner;

public class Main {

	/*
	 * 
	 * 
 
1. Contabiliza punto ganador
2. Contabiliza error no forzado
3. Contabiliza saque directo
4. Muestra estadísticas jugador
5. Muestra estadísticas equipo
	 */
	public static void menu() {
		System.out.println("\n Estadisticas");
		System.out.println("---------------");
		System.out.println("1> Contabiliza punto ganador");
		System.out.println("2> Contabiliza error no forzado");
		System.out.println("3> Contabiliza saque directo");
		System.out.println("4> Muestra estadísticas jugador");
		System.out.println("5> Muestra estadísticas equipo\n");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Partido match = new Partido();
		String equipoName ="";
		String jugUno= "";
		String jugDos ="";
	    int codigo = 0;	
		 
		System.out.println("\nCUARTOS DE FINAL DE ROLAND GARROS\r\n");
		
		
		for (int i=0 ; i <2 ; i++) {
			
	   	
	    
		System.out.println("\nIntroduzca el nombre del equipo "+(i+1)+": ");
		equipoName = sc.nextLine().toLowerCase().trim();
		
		System.out.println("Jugador 1:");
		jugUno = sc.nextLine().toLowerCase().trim();
		Jugador uno = new Jugador(jugUno);
		
	    codigo =match.addJugador(uno);
	    
		if (codigo == -1) {
			System.out.println("Jugador ya existe!/n");
		}
		
		System.out.println("Jugador 2:");
		jugDos = sc.nextLine().toLowerCase().trim();
		Jugador dos = new Jugador(jugDos);
		codigo =match.addJugador(dos);
		
		if (codigo == -1) {
			System.out.println("Jugador ya existe!\n");
		}
	
		// ---para que si el jugador existe, se pregunte sólo por el jugador 2 ----
		
		while(codigo == -1) { 
			System.out.println("Jugador 2:");
			jugDos = sc.nextLine().toLowerCase().trim();
		    dos = new Jugador(jugDos);
			codigo =match.addJugador(dos);
			
			if (codigo == -1) {
				System.out.println("Jugador ya existe!\n");
			  }
	       }
		  
		 match.addEquipo(equipoName,uno , dos);
		//System.out.println(match.listaEquipos.values());
	 		//System.out.println(match.listaJugadores);
		}
		
		 
		// abrir el menú con las opciones
		while(true) {
			
		menu();
		int option = Integer.valueOf(sc.nextLine());
		String jugador="";
		switch(option) {
		
		case 1 : System.out.println("* CONTABILIZA PUNTO GANADOR *");
			     System.out.println("Nombre del jugador:");
		         jugador = sc.nextLine().toLowerCase().trim();
		    
		         codigo = match.contaPuntos(jugador);
		         
		         if (codigo == -1) {
		        	 System.out.println("El jugador no existe");
		         }break;
		         
		case 2 : System.out.println("* CONTABILIZA ERROR NO FURZADO *");
	             System.out.println("Nombre del jugador:");
                 jugador = sc.nextLine().toLowerCase().trim();
                 codigo = match.contaError(jugador);
         
                 if (codigo == -1) {
        	     System.out.println("El jugador no existe");
                 }break;
                 
		case 3 : System.out.println("* CONTABILIZA SAQUE DIRECTO *");
                 System.out.println("Nombre del jugador:");
                 jugador = sc.nextLine().toLowerCase().trim();
                 codigo = match.contaSaque(jugador);

                 if (codigo == -1) {
	             System.out.println("El jugador no existe");
                 }break;
                 
		case 4 : System.out.println("* MUESTRA ESTADISTICAS JUGADOR *");
		         System.out.println("Nombre del jugador:");
		         jugador = sc.nextLine().toLowerCase().trim();
		         String stats = match.statsJug(jugador);
		         
		         if(stats.length()>0) {
		        	    
		        	    System.out.println(stats);
		         }else {
		        	    System.out.println("Jugador no existe!");
		         }break;
		         
		case 5 : 
		}
		
     	}
	}		
		

}
