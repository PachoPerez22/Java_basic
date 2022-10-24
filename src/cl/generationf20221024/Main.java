package cl.generationf20221024;

public class Main {

	public static void main(String[] args) {
		// las variables

		// variables primitivas: Caracter estatico (escritas con minus)

		int numero1 = 2; // variable numerica -2^31 y +2^31-1
		// -2,147,483,648 y el máximo 2,147,483,647
		long numero2 = 2147483648l;// -2^63 y 2^63-1 (doble de grande de un int)

		float decimal = 2.5f; // F= tipo flotante, se anota.(forma 1)
		float decimal2 = (float) 2.5; // castear (forma 2)]=
		double decimal3 = 9.8d;

		char caracter = 'a'; // un solo caracter con comilla simple(letra o numero)

		boolean respuesta = true; // true o false

		// investigar sobre variables short y byte INVESTIGAR

		System.out.println(decimal + " " + decimal2 + " " + decimal3 + " " + caracter + " " + respuesta);
		System.out.println(decimal3 + " " + caracter + " " + respuesta);

		// variable de tipo objeto o no primitivo
		String palabra = "washituring"; // siempre con comilla doble(no es var primitiva)(cadenas de caracteres)
		// palabra

		// variable objeto:
		Integer numero3 = 2; // /variable numerica -2^31 y +2^31-1
		// numero2.

		Long numero4 = 2345656780L; // le agregamos al final la inicial del tipo de dato (long = 12345L;)
		Float numero5 = 765383838F; // igual que arriba
		Double numero6 = 7474747474D;

		// Conversion a otro tipos de datos numericos
		// De Double a String (abajo)

		Double num1 = Double.parseDouble(123 + " ");

	}

}
