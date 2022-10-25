package cl.generationf20221024;

public class ejercicio2 {

	public static void main(String[] args) {
int[] numeros= {1,4,5,6,-1,-51,2,16,-123,100};

		
		int numMax = numeros[0];


	for(int i = 0 ; i<numeros.length;i++ ){

	if(numMax<numeros[i] ){
	numMax=numeros[i];
	}
	}

	System.out.println(numMax);




	int[] numeros1= {1,4,5,6,-1,-51,2,16,-123,100};


	int numMin = numeros[0];


	for(int j = 0 ; j<numeros.length;j++ ){

	if(numMin>numeros[j] ){
	numMin=numeros[j];
	}

	}
	System.out.println(numMin);
	System.out.println(numMax);
	
}
}
	
	
	
    //Del mismo arreglo crear 2 arreglos
	//uno con solo pares e impares.
	
	
	
	



