package cl.generation.f20221025;

import java.util.HashSet;

public class HashSetArrayTest {

	public static void main(String[] args) {
		
		HashSet<String> takeFive = new HashSet<String>();
		 
	
		//Agregar elementos al arreglo
		takeFive.add("Naomi");
		takeFive.add("Naomi");//no es agregado, esta repetido
		takeFive.add("Daniel");
		takeFive.add("Cynthia");
		takeFive.add("Pablo");
		takeFive.add("Luis");
		System.out.println(takeFive);
		
		//verificar el contenido del arreglo
		boolean verificacionNombre = takeFive.contains("Daniel");
		System.out.println("existe el integrante? " +verificacionNombre);
		
		//Eliminar un elemento por el contenido
		takeFive.remove("Naomi");
		System.out.println(takeFive);
		
		//Tamaño del arreglo
		System.out.println("Tamaño del hashset: " + takeFive.size());	
	}

}
