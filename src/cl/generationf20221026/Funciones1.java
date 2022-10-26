package cl.generationf20221026;

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
		Integer valorRetornado= retorno1(); //resultado de la 1era var de valor retornado(ver)
        String nombreCompleto = getNombreCompleto("Francisco","badillo","perez"); //Para obtener usamos el orden de las variables, apeMat, nombre, apePat
        System.out.println("El nombre completo es: "+ nombreCompleto);
        llamadaAOtroMetodo();
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
     public static Integer retorno1() {
    	 Integer totalAlumnos =35;
    	 return totalAlumnos;
    	 
     }
     // se pone (/ ** + enter) para que aparezcan los parametros de abjo
     /** Metodo que une todos los datos
      * @param  
      * @param apeMaterno
      * @param apePaterno
      * @param nombre
      * @param nombreCompleto
      * */
     
     public static String getNombreCompleto(String nombre, String apeMaterno, String apePaterno) {
    	 String nombreCompleto = nombre+" "+apePaterno+" "+apeMaterno; //creamos las variables
    	 return nombreCompleto; //Aqui usamos la variable que creamos arriba en la siguiente linea
     }
     
     //Metodo para llamar a otro metodo
     
     public static void llamadaAOtroMetodo() { 
    	 System.out.println("llamada a otro metodo desde un metodo");// en el main hacemos llamado al metodo
    	 metodo4(77, 9.5f);
     }
     
     

}
