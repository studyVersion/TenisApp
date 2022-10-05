import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out.println("\n  Estadisticas");
		System.out.println("----------------");
		System.out.println("1. Contabiliza punto ganador");
		System.out.println("2. Contabiliza error no forzado");
		System.out.println("3. Contabiliza saque directo");
		System.out.println("4. Muestra estadisticas jugador");
		System.out.println("5. Muestra estadisticas equipo\n");
		System.out.println("6. Salir");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Partido match = null;
		String value = null;
		int codigo = 0;
		int option = 0;

		System.out.println("\nCUARTOS DE FINAL DE ROLAND GARROS\r\n");

		System.out.println("\nIntroduzca el nombre del equipo 1: ");
		String equipo1 = sc.nextLine().toLowerCase().trim();
		System.out.println("Jugador 1:");
		String jugUno = sc.nextLine().toLowerCase().trim();
		System.out.println("Jugador 2:");
		String jugDos = sc.nextLine().toLowerCase().trim();

		System.out.println("\nIntroduzca el nombre del equipo 2: ");
		String equipo2 = sc.nextLine().toLowerCase().trim();
		System.out.println("Jugador 1:");
		String jugTres = sc.nextLine().toLowerCase().trim();
		System.out.println("Jugador 2:");
		String jugQuatro = sc.nextLine().toLowerCase().trim();

		match = new Partido(equipo1, equipo2, jugUno, jugDos, jugTres, jugQuatro);

		// abrir el menú con las opciones

		while (option != 6) {

			menu();

			option = Integer.valueOf(sc.nextLine());

			if (option == 1) {
				System.out.println("* CONTABILIZA PUNTO GANADOR *");
				System.out.println("Nombre del jugador:");
				value = sc.nextLine().toLowerCase().trim();
				codigo = match.addEstadisticas(option, value);

				if (codigo == -1) {
					System.out.println("El jugador no existe");
				}
			}

			if (option == 2) {
				System.out.println("* CONTABILIZA ERROR NO FURZADO *");
				System.out.println("Nombre del jugador:");
				value = sc.nextLine().toLowerCase().trim();
				codigo = match.addEstadisticas(option, value);

				if (codigo == -1) {
					System.out.println("El jugador no existe");
				}
			}

			if (option == 3) {
				System.out.println("* CONTABILIZA SAQUE DIRECTO *");
				System.out.println("Nombre del jugador:");
				value = sc.nextLine().toLowerCase().trim();
				codigo = match.addEstadisticas(option, value);

				if (codigo == -1) {
					System.out.println("El jugador no existe");
				}
			}

			if (option == 4) {
				System.out.println("* MUESTRA ESTADISTICAS JUGADOR *");
				System.out.println("Nombre del Jugador:");
				value = sc.nextLine().toLowerCase().trim();
				String stats = match.statsJug(value);
				System.out.println(stats);

				if (stats.length() == 0) {
					System.out.println("Jugador no existe!");
				}
			}

			if (option == 5) {
				System.out.println("* MUESTRA ESTADISTICAS EQUIPO *");
				System.out.println("Nombre del Equipo:");
				value = sc.nextLine().toLowerCase().trim();
				String stats = match.statsEquipo(value);
				System.out.println(stats);
				
				if (stats.length() == 0) {
					System.out.println("Equipo no existe!");
				}
			}

		}
	}
}