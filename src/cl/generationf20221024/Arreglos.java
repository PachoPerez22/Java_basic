package cl.generationf20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		
		
		//Arreglos(Array) en java (estaticos, con cambia de tamaño)
		int[] arreglo= new int [3];
		//arreglo.length; tamaño del arreglo
		
		//arreglar datos
		arreglo[0]=4;
		arreglo[1]=8;
		arreglo[2]=12;
		//arreglo[3]=24; (Error porque tiene 4  elementos y arriba dice que [3]
		System.out.println(arreglo.toString());
		//imprimir arreglo
		System.out.println(Arrays.toString(arreglo));//Me muestra el contenido del Arreglo(funcion padre que convierte cualquier arreglo en String
	    // imprimir elemento segun indice	
		System.out.println(arreglo[0]); // Manera correcta de imprmir la posicion de la posicion 0 en el array
		
        //{}
		int[] sinNumeros = {}; //cero es el resultado
		System.out.println(sinNumeros.length);
		
        String[]vocales = {"a","e","i","o","u"};
        System.out.println("cantidad de elementos "+vocales.length);
        vocales[1]="o";
        vocales[3]="e";
        vocales[3]="y";
        vocales[0]=1+"";
        
        
        //ejercicio: crear un array de numeros flotantes de tamaño 6
        
        float[] numeros= new float[6]; //[1,2,3,4,5,6]
        //Agregar 6 elementos al arreglo anterior hecho
        numeros[0]= 33; //respuesta es 33.0(entero)
        numeros[0]=-0.6f; //numero flotantes
        
        int[]numeroInt= new int[2];
        numeroInt[0]= (int)0.2;//casteo
        System.out.println(numeroInt[0]);
        
        /*Crear un arreglo de tamaño 100 y agregar valores 
         * dinamicamente desde el 1 hasta el 100*/
        
        int[] arreglo4 = new int[100]; //arreglo4 nombre del arreglo (new int = tamaño[])
		for (int i = 0; i < arreglo4.length; i = i + 1) { //bucle
			arreglo4[i] = i+1;    //[0] = 1+1 (hasta 100)
		}
		
		System.out.println(Arrays.toString(arreglo4));
		
		/*crear un arreglo de tamaño 100 y agregar valores
		 * dinamicamente desde 100 hasta el 1
		 */
		int[] arreglo100a1 = new int[100];
		//{100,99,98,97...0}
		for(int i =arreglo100a1.length; i>0  ;i-- ) {
			arreglo100a1[arreglo100a1.length - i]= i;
		}
		System.out.println(arreglo100a1);
		
	} 
        
}
