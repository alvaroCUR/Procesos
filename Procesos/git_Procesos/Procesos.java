package git_Procesos;

import java.util.Scanner;

public class Procesos {

	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int opcion;

			do {
				printMainMenu();
				System.out.print("> ");
				opcion = sc.nextInt();
				switch (opcion) {
				case 0:
					System.out.println("Has salido del menu");
					break;
				case 1:
					fcfs();
					break;
				case 2:
					SFJ();
					break;
				case 3:

					break;
				default:
					System.err.print("ERROR: Opcion fuera de rango, prueba con otro número...\n");
					break;
				}
			} while (opcion != 0);
		}

		private static void printMainMenu() {
			System.out.println("******************");
			System.out.println("******* Bienvenido *******");
			System.out.println("Elige la opcion que desee implementar: -----------");
			System.out.println("1. First Come, First Served (FCFS) ---------------");
			System.out.println("2. Shortest job First (SJF) ----------------------");
			System.out.println("3. Round Robin -----------------------------------");
			System.out.println("0. Salir -----------------------------------------");
			System.out.println("******** MENU ********");
		}

		private static void fcfs() {
			int[] TiempoDuracion = new int[100];
			int[] InstanteLlegada = new int[100];
			int[] TiempoRespuesta = new int[100];
			int[] TiempoEspera = new int[100];
			int[] TiempoFinalizacion = new int[100];
			int n, sum = 0;
			Scanner sc = new Scanner(System.in);

			System.out.println("Teclee el número de procesos");
			System.out.print("> ");
			n = sc.nextInt();

			System.out.println("Ingrese el instante de llegada y el tiempo de duración \n");

			for (int i = 0; i < n; i++) {
				System.out.print("Instante de llegada[" + (i + 1) + "]");
				System.out.print("> ");
				InstanteLlegada[i] = sc.nextInt();

				System.out.print("Tiempo de duración[" + (i + 1) + "]");
				System.out.print("> ");
				TiempoDuracion[i] = sc.nextInt();

				System.out.println();
			}

			for (int j = 0; j < n; j++) {
				sum += TiempoDuracion[j];
				TiempoFinalizacion[j] = TiempoFinalizacion[j] + sum;
			}

			for (int k = 0; k < n; k++) {
				TiempoRespuesta[k] = TiempoFinalizacion[k] - InstanteLlegada[k];
			}

			for (int k = 0; k < n; k++) {
				TiempoEspera[k] = TiempoRespuesta[k] - TiempoDuracion[k];
			}

			System.out.println("Resultado: \n");
			System.out.println("P\t I.Ll\t t\t FIN\t T\t E\t\n");

			for (int i = 0; i < n; i++) {
				System.out.println("P" + (i + 1) + "\t " + InstanteLlegada[i] + "\t " + TiempoDuracion[i] + "\t "
						+ TiempoFinalizacion[i] + "\t " + TiempoRespuesta[i] + "\t " + TiempoEspera[i]);
			}
			System.exit(0);
		}

		private static void SFJ() {
			int[] TiempoDuracion = new int[100];
			int[] InstanteLlegada = new int[100]; 
			int[] TiempoRespuesta = new int[100];
			int[] TiempoEspera = new int[100];
			int[] TiempoFinalizacion = new int[100];
			int n, sum = 0;
			Scanner sc = new Scanner (System.in);

			System.out.println("Teclee el número de procesos");
			System.out.print("> ");
			n = sc.nextInt();
			
			System.out.println("Ingrese el instante de llegada y el tiempo de duración \n");
			
			for (int i = 0; i < n; i++) {
				System.out.print("Instante de llegada[" + (i + 1) + "]");
				System.out.print("> ");
				InstanteLlegada[i] = sc.nextInt();

				System.out.print("Tiempo de duración[" + (i + 1) + "]");
				System.out.print("> ");
				TiempoDuracion[i] = sc.nextInt();

				System.out.println();
			}
		}
	}
	

