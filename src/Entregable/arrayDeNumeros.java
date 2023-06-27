package Entregable;

public class arrayDeNumeros {
	/**

	* Clase para gestionar el punto uno de

	* la segunda parte de la entrega.

	* Crear array con 1.000 numeros aleatorios

	* y posteriormeten buscar el numero mayor

	* qeu hay en el array

	*/

	public static void main(String[] args) {

	int[] numeros = new int[1000];

	int j;


	numeros = SetArray();

	/**

	* Imprime numeros del array

	*/

	for(j = 0; j <= 999; j++) {

	System.out.println(numeros[j]);

	}

	/**

	* Se busca numero mayor

	*/

	getNumMayor(numeros);



	}

	/**

	* Se crea el array con los 1000

	* numeros aleatorios

	*/

	public static int[] SetArray() {

	int[] numeros = new int[1000];

	int i;

	for(i = 0; i <= 999; i++) {

	numeros[i] = (int)(Math.random() * 9999 + 1);

	}

	return numeros;

	}

	/**

	* Se recorre el array creado y se busca

	* el numero mayor

	*/

	public static void getNumMayor(int[] numeros) {

	int mayor = numeros[0];

	for(int x = 1; x < numeros.length; x++) {

	if(numeros[x] > mayor) {

	mayor = numeros[x];

	}

	}


	System.out.println("El tiempo de ejecucion/nanosegundos = " + 

	System.nanoTime());

	System.out.println("El tiempo de ejecucion/milisegungos = " + 

	System.currentTimeMillis());

	System.out.println("El mayor es = " + mayor);

	}
}
