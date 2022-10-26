package cl.generationf20221025;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		// funciones o metodo
		
	  //Llamar a un metodo
		nombreMetodo(); //llamar a funcion 1
		metodo2("pacho"); //llamar a funcion 2
		metodo2("perez"); //otro llamado, aparece lo mismo con el metodo2
		metodo3(3);
		metodo4(77,9.9F);
		String[] arreglito = {"a","e","i","o","u"};
		metodo5(arreglito);


	}
	//Definicion o estructura de un metodo
	// void->el metodo no retorna ningun valor
	public static void nombreMetodo() {
		
		System.out.println("Estoy dentro del metodo inicial");
	}
	
     public static void metodo2(String nombre) {
		
		System.out.println("Estoy soy "+ nombre);
	}
     
     public static void metodo3(Integer numero) {
 		
 		System.out.println("Estoy soy "+ numero);
 	}
     public static void metodo4( int numero1,Float numero2) {
 		System.out.println("Soy el numero " +numero1);
 		System.out.println("Soy el numero2 " +numero2);
 	}
     
     public static void metodo5(String[] arreglito) {
 		System.out.println("Soy el arreglo "+Arrays.toString(arreglito));


   }
     //Funciones con retorno
     
     

}
