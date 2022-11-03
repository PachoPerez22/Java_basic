package cl.generationf20221103;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Objeto de colaboracion
		
		Usuario usuario = new Usuario();
		
		
		//Agregar numeros de telefono mediante un arraylist (1)
		/*ArrayList<String> telefono = new ArrayList<String>();
		String telefono2 ="1222222";
		telefono.add(telefono2);
		telefono.add("543452342");
		
		usuario.setTelefonos(telefono);
		System.out.println(telefono);*/
		
		//Agregar numeros de telefono mediante este otro metodo(2)
		//En el constructor inicializamos esta variable (Usuario, debajo de constructor vacio)
		/*usuario.getTelefonos().add("12345");
		usuario.getTelefonos().add("60789");
		System.out.println(usuario.getTelefonos());*/
		
		//Para agregar una direccion
		usuario.setDireccion("Lo pablos 1234, temuco, la araucania");
		
		Usuario usuario2 = new Usuario();
		usuario2.setDireccion("Los pablos 123, temuco, la raucania");
		System.out.println(usuario2.getDireccion());
		
		
		
		
		
		

	}

}
