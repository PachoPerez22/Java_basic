package cl.generationf20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// Instancia de clase Auto (Referencia a un objeto)
		
		Auto auto1 = new Auto(); //Auto esta en el mismo package y no se debe importar
             
		//Asignar valores a los atributos privados(Atraves de los metodo  setter)
		
		auto1.setColor("rojo");
		auto1.setMarca("Peugeot");
		
		//COnsultar los atributos
		
		System.out.println(auto1.getColor()); //IMprimimos el color
		System.out.println(auto1.getModelo()); //Imprimimos el modelo
		
		//Para saber el contenido de los atributos
		System.out.println(auto1.toString());
		
		//NUEVA INSTANCIA DE AUTO (Agregamos caracteristicas en orden y se nombran en el orden)
		Auto car = new Auto("Nissan", "Negro","Qashqai", 1.6f, 10.0f,140f);
		System.out.println(car.getModelo());
		System.out.println(car.getColor());
		System.out.println(car.getMarca());
		System.out.println(car.getVelocidad());
		
		auto1.getRendimiento();
		
		System.out.println(car.toString());
	}

}
