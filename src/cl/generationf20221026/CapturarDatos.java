package cl.generationf20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
       Float IMC =calculoIMC(); //llamamaos al metodo
       System.out.println("Su IMC es: "+ IMC); //Imprimir el metodo del return abajo
	   nivelIMC(IMC);
       
       /*
	 * Por debajo de 18.5 Bajo peso 
		 * 18.5 - 24.9 Normal 
		 * 25.0 - 29.9 Sobrepeso 
		 * 30.0 o más Obeso
		 *  */
	
	}

	public static Float calculoIMC() {

		// Capturar datos ingresados por el usuario //ctrl shit o encima de scanner para
		// import la libreria

		Scanner scanner = new Scanner(System.in); // variable scanner d tipo scanner
		// Calculo del IMC; imc=(estatura*estatura);
		// imc=kilos/(estatura*estatura);

		System.out.println("Ingrese su peso en kilogramos");// imprimimos lo que vamos a solicitar
		Float peso = scanner.nextFloat(); // para pedir un dato al usuario(nos pide numerico o float)
		System.out.println("El peso del paciente es:" + peso); // imprimimos sumando el dato numerico que ingresamos

		System.out.println("Ingrese la estatura del paciente es"); // Imprimimos lo que queremos pedir
		Float estatura = scanner.nextFloat(); // Con esto le pedimos un numero float al usuario
		System.out.println("La estatura del paciente es " + estatura); // Imprimimos lo primero mas lo que ingreso el
																		// usuario

		Float IMC = peso / (estatura * estatura); // IMC variable de indice de masa corporal
		System.out.println("El indice de masa corporal es " + IMC);

		
		scanner.close(); // nombre de la variable creada arriba
  
	    return IMC;
	}
	
	public static void nivelIMC(Float IMC) { //(3era parte)Creamo el metodo para saber en que nivel estamos
		 /* Por debajo de 18.5 Bajo peso 
		 * 18.5 - 24.9 Normal 
		 * 25.0 - 29.9 Sobrepeso 
		 * 30.0 o más Obeso
		 *  */
		if(IMC<18.5){
			System.out.println("EL paciente tiene bajo nivel de peso");
			
		}else if(IMC >= 18.5F && IMC < 25){
			 System.out.println("El paciente esta en rango Normal");
		
		}else if(IMC >= 25 && IMC <30) {
			System.out.println("EL paciente esta en SOBREPESO");
			
		}else if (IMC <= 30) {
			System.out.println("EL paciente esta obeso");
			}
	}
}
