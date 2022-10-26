package cl.generationf20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {

		// Do While
		// Al menos una vez se ejecuta
		Scanner scanner = new Scanner(System.in);
		int edad = 0; // Variable desde donde empieza la edad
		float peso = 0; // Para la variable de peso, abajo
		int estatura=0; //Para la var de estatura

		do {

			System.out.println("Ingresa tu edad");
			edad = scanner.nextInt();

		} while (edad < 18 || edad > 120); // Mientras se cumpla esta condciion se sigue haciendo el bucle

		System.out.println("Edad ingresada " + edad);

		// Ahora probar con peso

		do {

			System.out.println("Ingresa tu peso");
			peso = scanner.nextFloat();

		} while (peso < 45 || peso > 120); // Mientras se cumpla esta condciion se sigue haciendo el bucle

		System.out.println("El peso ingresada " + peso);
		
		//Ahora con estatura
		
		do {

			System.out.println("Ingresa tu altura");
			estatura = scanner.nextInt();

		} while (estatura < 45 || estatura > 120); // Mientras se cumpla esta condciion se sigue haciendo el bucle

		System.out.println("El peso ingresada " + estatura);

		

		scanner.close();
	}

}
