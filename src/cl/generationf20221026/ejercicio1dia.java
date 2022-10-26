package cl.generationf20221026;

import java.util.Scanner;

public class ejercicio1dia {

	public static void main(String[] args) {
		// llamando a los metodos

		String nombreYApellido = nombreCompleto();
		Float IMC = calculoIMC();

		// System.out.println("Su IMC es : "+ IMC);
		// System.out.println("nombre es : "+ nombreYApellido);

		System.out.println("*******************------------------*********************");
		System.out.println("El Nombre del paciente es : " + nombreYApellido);
		System.out.println("El Indice Corporal del Paciente es : " + IMC);
		System.out.println("*******************------------------*********************");
		nivelDeObesidad(IMC);
		System.out.println("*******************------------------*********************");

	}

	public static String nombreCompleto() {
		Scanner scanner = new Scanner(System.in);
		// pidiendo nombre
		System.out.println("Ingrese su Nombre");
		String nombre = scanner.next();
		// System.out.println("el nombre es : "+ nombre);
		//
		System.out.println("Ingrese su Apellido");
		String apellido = scanner.next();
		// System.out.println("el apellido es : "+ apellido);

		String nombreCompleto = nombre + " " + apellido;

		// scanner.close();
		return nombreCompleto;

	}

	public static Float calculoIMC() {
		Scanner scanner = new Scanner(System.in);
		// imc=kilos/(estatura*estatura)
		System.out.println("Ingrese su peso en kilogramos");
		Float peso = scanner.nextFloat();

		System.out.println("Ingrese su estatura en metros");
		Float estatura = scanner.nextFloat();
		// System.out.println("la estura del paciente es : "+ estatura);

		Float IMC = peso / (estatura * estatura);

		// scanner.close();
		return IMC;
	}

	public static void nivelDeObesidad(Float IMC) {
		if (IMC < 18.5F) {
			System.out.println("El paciente esta bajo peso ");
		} else if (IMC >= 18.5F && IMC < 25) {
			System.out.println("El paciente esta en el rango 'NORMAL' de peso ");
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("El paciente se encuentra en estado de 'SOBRE PESO' .");
		} else {
			System.out.println("El paciente se encuentra en estado de 'OBESIDAD'");
		}
	}

}
