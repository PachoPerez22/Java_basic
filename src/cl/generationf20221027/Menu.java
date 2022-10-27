package cl.generationf20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// Menu de opciones
		// terminar la ejecución
		// ofrecer opciones de repeticion (bucles)
		menu();

		// Calculadora con 4 operaciones basicas
		// solicitar y capturar 2 numeros float
		// imprimir resultados y guardar en una variable

		// definir los metodos
		// validaciones

		// limpiar las variables

	}

	public static void menu() {
		System.out.println("********************");
		System.out.println("*       MENU       *");
		System.out.println("********************");
		System.out.println("*1.-   SUMAR       *");
		System.out.println("*2.-   RESTAR      *");
		System.out.println("*3.-   MULTIPLICAR *");
		System.out.println("*4.-   DIVIDIR     *");
		System.out.println("*0.-   SALIR       *");
		System.out.println("********************");

		Scanner sc = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores = 4;

		do {
			System.out.println("* Seleccione una opción *");
			opciones = sc.nextInt();

			// si la opcion es cero, salir del do-while
			if (opciones == 0) {
				System.out.println("Usted a salido del programa");
				break;
			}

			if (opciones < 0 || opciones > 4) {// condicion de error
				contadorErrores--;
				System.out.println("Te quedan " + contadorErrores + " intentos");
			}
			if (contadorErrores == 0) {
				System.out.println("Agoto la cantidad de intentos, chaolin!!");
				break;
			}

		} while (opciones < 0 || opciones > 4);

		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("Adios!!");
		} else {// solo ingresará para opciones 1,2,3,4
			// solicitar 2 numeros
			System.out.println("Ingresa el primer numero");
			float numero1 = sc.nextFloat();
			System.out.println("Ingresa el segundo numero");
			float numero2 = sc.nextFloat();

			float resultado = 0;

			switch (opciones) {
			case 1:// SUMAR
				resultado = numero1 + numero2;
				System.out.println("El resultado es " + resultado);
				break;
			case 2:
				resultado = numero1 - numero2;
				System.out.println("El resultado es " + resultado);
				break;
			case 3:
				resultado = numero1 * numero2;
				System.out.println("El resultado es " + resultado);
				break;
			case 4:
				if (numero2 == 0) {
					System.out.println("NO SE PUEDE DIVIDIR POR CERO");
				} else {
					resultado = numero1 / numero2;
					System.out.println("El resultado es " + resultado);
				}
				break;

			default:
				System.out.println("Opción no valida");
				break;
			}

		}

	}
}