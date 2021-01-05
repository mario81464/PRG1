package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales
 * y de repeticion anidadas.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030204 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Sentencias anidadas";
	}

	/**
	 * Sentencias anidadas - Ejercicio1.
	 *
	 * Programar el codigo que muestre todos los numeros perfectos comprendidos 
	 * entre dos numeros n1 y n2 introducidos por teclado
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		System.out.println("Introduce 2 numeros enteros: ");
		int n1= Teclado.readInteger();
		int n2= Teclado.readInteger();
		int numeroMayor;
		int numeroMenor;


		if(n1>n2){
			numeroMayor=n1;
			numeroMenor=n2;
		}else if(n2>n1){
			numeroMayor=n2;
			numeroMenor=n1;
		}else{
			numeroMayor=n2;
			numeroMenor=n1;
		}

		StringBuilder numerosPerfectos= new StringBuilder();
		numerosPerfectos.append("Numeros perfectos entre "+numeroMenor+" y "+numeroMayor+": ");
		for(int n=numeroMenor;n<numeroMayor;n++){
			int sumaDivisores=0;
			for(int i=1;i<n;i++){
				if(n%i==0){
					sumaDivisores= sumaDivisores + i;
				}
				}
				if(sumaDivisores==n && n!=0){
					numerosPerfectos.append(n+"  ");
			}

		}
		System.out.println(numerosPerfectos.toString());
        // Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio2.
	 *
	 * Un banco quiere implementar una aplicacion para detectar cheques falsificados. 
	 * Un cheque es falso si en su numero (compuesto por 10 digitos) hay: 3 o mas ceros seguidos 
	 * y/o cuatro o mas numeros distintos de cero seguidos.
	 * 
	 * Completar la clase Cheque para que detecte los cheques falsos.
	 * 
	 * Probar la clase Cheque  sobre el metodo ejercicio02() de la clase Apartado030204.
	 * 
	 */
	public void ejercicio02() {
		cabecera("02", "");

		Cheque cheque = new Cheque("1000988887");		
		//Modificar el numero de cheque para probar
		//cheque=new Cheque("1000988887");    
        //cheque=new Cheque("1010098888");
        //cheque=new Cheque("1009808880");   

         if (cheque.esFalso()== true)
        	 System.out.println("El cheque es falso");
         else
             System.out.println("El cheque no es falso");
	}

	/**
	 * Sentencias anidadas  - Ejercicio3.
	 *
	 * Programar el codigo que genere dado un tamanio (entero) introducido por teclado los siguientes dibujos:
	 * 
	 * Ejemplo de ejecucion  
	 * 
	 * Introduce el tamanio: 4
	 * 	Triangulo
	 * 	*
	 * 	**
	 * 	***
	 * 	****
	 * 	Cuadrado Relleno
	 * 	****
	 * 	****
	 * 	****
	 *  ****
	 *  
	 *  Cuadrado vacio
	 *  ****
	 *  *  *
	 *  *  *
	 *  ****
	 * 
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		System.out.println("Introduce el tamaño: ");
		int tamaño= Teclado.readInteger();

		System.out.println("Triangulo\n");
		for(int i=1;i<=tamaño;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\nCuadrado Relleno\n");
		for(int i=0;i<tamaño;i++){
			for(int j=0;j<tamaño;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\nCuadrado vacio\n");
		for(int i=1;i<=tamaño;i++){
			for(int j=1;j<=tamaño;j++){
				if(i==1 || i==tamaño || j==1 || j==tamaño){
					System.out.print("*");
				} else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio4.
	 *
	 * 
	 * Programar el codigo que plantee un pequenio juego al usuario.
	 * <ul>
	 * <li>	El ordenador pensara un numero entre 1 y 100 (generar un numero aleatorio)
	 * <li>	El usuario dispondra de 5 intentos para acertar el numero.
	 * <li>	Por cada intento el ordenador indicara si el numero buscado es menor o mayor 
	 * 		 al introducido y se el usuario ha acertado.
	 * <li> Cuando se acierte el numero correcto debera mostrarse cuantos ensayos han sido 
	 * 		necesarios hasta llegar a la solucion.
	 * <li>	Una vez hecho esto debera preguntar si se desea empezar de nuevo con otro numero o 
	 * 		si desea terminar el juego.
	 *</ul>
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int numero=0;
		int i=1;
		int opcion;
		while(i>0){
			int numeroRandom= (int) (Math.random()*100)+1;
			System.out.println(numeroRandom);
		for(int intentos=5;intentos>0;intentos--){
			System.out.println("Introduce un número entre 1 y 100, tienes "+intentos+" intentos: ");
			numero=Teclado.readInteger();
			if(numero==numeroRandom){
				int intentosNecesarios = 6-intentos;
				System.out.println("Has acertado el numero\nNumero de intentos necesarios: "+intentosNecesarios);
				intentos=0;

			}else if(numero>numeroRandom){
				System.out.println("El numero buscado es menor que el introducido\n");
			}else{
				System.out.println("El numero buscado es mayor que el introducido\n");
			}
		}
			

			System.out.println("\nSelecciona una opción:\n1-Jugar de nuevo\n2-Salir\n");
			opcion =Teclado.readInteger();
			if(opcion==2){
				i=0;
			} else if(opcion==1){
				i=1;
			} else{
				System.out.println("Opción seleccionada incorrecta");
			}
		}
		// Fin modificacion
	}
}
