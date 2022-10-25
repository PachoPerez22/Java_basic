package cl.generationf20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		//arraylist
		//Definicion
		
		// ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>();
        
		ArrayList<String> relatores = new ArrayList<String>();
        //2)agregar valores del arreglo
		
		relatores.add("Nathalie");
		relatores.add("Valentina");
		relatores.add("Ariel");
		relatores.add("Diego");
		relatores.add("Francisco");
		System.out.println(relatores);
		
		//como saber el tamaño del arraylist
		//relatores.size()
		System.out.println(relatores.size());
		//Length = arreglo estatico****
		//Size = Arreglos dinamicos****
		
		//4)Como obtener un elemnto del arraylist
		//grupo2.get();
		System.out.println(relatores.get(3));
		//System.out.println(relatores.get(6)); Error, fuera de indice
		
		//5)eliminar un elemento dentro del array
		//relatores.remove();
		relatores.remove(4);
		relatores.remove(3);
		System.out.println(relatores);
		
		//6.- recorrer el ArrayList
		for(int i = 0; i<relatores.size();i++){
			System.out.println("los relatores : "+relatores.get(i));
				
		}
		
		System.out.println("*********************");
				
		//for iterador	o de objeto.
		//Para recorrer
		//Se puede usar para arreglos dinamicos y estaticos(maa facil par dinamicos)
		for(String relator: relatores) { //este bucle termina aqui abajo (relator es la variable nueva)
			System.out.println(relator); //dentro del corchete { (EL largo del arreglo
			                             //termina con (relatores) como largo
		}
		
		//ejemplo con numero(el anterior era con los miembros del equipo)
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		for(Integer numero :numeros) {
			System.out.println(numero);
		}


		
	
	}

}
