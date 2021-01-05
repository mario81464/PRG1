package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "for".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030201 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion for";
	}

	/**
	 * Instruccion for - Ejercicio1.
	 *
	 * Programar el codigo que muestre la suma de los numeros comprendidos del 1 al 100
	 * 
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int suma=0;
		for(int i=1; i<100;i++){
			suma = suma +i;	
		}
		System.out.println(suma);
        // Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio2.
	 *
	 * Programar el codigo  que calcule la media de los numeros impares menores que 1000.
	 * 
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int suma=0;
		for(int i=1;i<1000;i+=2){
			suma = suma +i;
		}
		System.out.println(suma);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio3.
	 *
	 * Programar el codigo que calcule la suma de todos los numeros comprendidos entre 
	 * dos numeros n1 y n2 que introduzca el usuario.
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		int n1 = Teclado.readInteger(); 
		int n2 = Teclado.readInteger(); // Considerar n2>n1

		int suma = 0;
		for(int i=n1;i<n2;i++){
			suma = suma + i;
		}
		System.out.println(suma);
		//Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio4.
	 *
	 * Programar el codigo  para que se lean 10 numeros enteros  del teclado y  se indique cuantas 
	 * veces aparece el 3, cuantas el 5 y cuantas el 7.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int suma3=0;
		int suma5=0;
		int suma7=0;
		for(int i=0;i<10;i++){
			System.out.println("Introduce un numero: ");
			int numero = Teclado.readInteger();
			if(numero== 3){
				suma3 = suma3 +1;
			}

			if(numero==5){
				suma5 = suma5 +1;
			}

			if(numero==7){
				suma7 = suma7 + 1;
			}
		}
		System.out.println("Se han introducido "+suma3+" tres(es) "+suma5+" cinco(s) "+suma7+" siete(s)");
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio5.
	 *
	 * Programar el codigo que lea 10 numeros enteros por teclado y diga cual es el mayor y
	 * el menor de todos ellos.
	 * 
	 */
	public void ejercicio05() {
		cabecera("05","");

		// Inicio modificacion
		long maximoValor= Integer.MAX_VALUE;
		long minimoValor= Integer.MIN_VALUE; //defino estas variables porque si indico directamente Integer Max y Min value no me funcionaba bien para numeros negativos
		long numeroMayor= minimoValor; 
		long numeroMenor= maximoValor;
		
		for(int i=0;i<10;i++){
			System.out.println("Introduzca un numero: ");
			int numero = Teclado.readInteger();
			if(numero>numeroMayor){
				numeroMayor = numero;
			}
			if(numero<numeroMenor){
				numeroMenor = numero;
			}
		}
		System.out.println("Numero mayor: "+numeroMayor+ "\nNumero menor: "+numeroMenor);
        // Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio6.
	 *
	 * Programar el codigo  que sume los numeros pares por un lado y los impares por otro  entre dos numeros enteros 
	 * introducidos por el usuario. Suponer que el primer numero es siempre par. 
	 * <ul>
	 * <li>Nota 1: Solo se debe utilizar un unico  bucle for.
	 * </ul>
	 *
	 * [Falta enunciado]
	 */
	public void ejercicio06() {
		cabecera("06", "");

		// Inicio modificacion
		System.out.println("Introduce 2 numeros: ");
		int n1= Teclado.readInteger();
		int n2= Teclado.readInteger();
		int numeroMayor=0;
		int numeroMenor=0;
		int sumaPares=0;
		int sumaImpares= 0;

		if(n2>n1){
			numeroMayor = n2;
			numeroMenor = n1;
		}
		 if(n1>n2){
			numeroMayor = n1;
			numeroMenor = n2;
		}else{
			numeroMayor = n2;
			numeroMenor = n1;
		}

		for(int i=numeroMenor;i<numeroMayor;i++){
			if(i%2==0){
				sumaPares = sumaPares + i;
			}else{
				sumaImpares = sumaImpares + i;
			}
		}
		System.out.println("Suma de numeros pares: "+sumaPares+"\nSuma de numeros impares: "+sumaImpares);
		// Fin modificacion
	}
	/**
	 * Instruccion for - Ejercicio7.
	 *
	 * Consultar las clases String, StringBuffer y Character del API de java y escribir un codigo 
	 * que pida una cadena en minusculas y obtenga dos a partir de ella, una solo con vocales y 
	 * la otra el resto de caracteres. Posteriormente deberan convertir todos los caracteres de las 
	 * dos cadenas de minusculas a mayusculas. 
	 *
	 */
	public void ejercicio07() {
		cabecera("07", "");

		// Inicio modificacion
		String cadenaMinusculas;
		StringBuffer vocales = new StringBuffer();
		StringBuffer otros = new StringBuffer();

		System.out.println("Introduce una cadena en minusculas: ");
		cadenaMinusculas= Teclado.readString();

		for(int i=0;i<cadenaMinusculas.length();i++){
			if(cadenaMinusculas.charAt(i)=='a' || cadenaMinusculas.charAt(i)=='e' || cadenaMinusculas.charAt(i)=='i' || cadenaMinusculas.charAt(i)=='o' || cadenaMinusculas.charAt(i)=='u'){
				vocales.append(cadenaMinusculas.charAt(i));
			} else{
				otros.append(cadenaMinusculas.charAt(i));
			}
		}
		System.out.println(vocales.toString());
		System.out.println(otros.toString());

		System.out.println(vocales.toString().toUpperCase());
		System.out.println(otros.toString().toUpperCase());
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio8.
	 *
	 * Programar el codigo que  muestre la cadena con mayor numero de caracteres de un conjunto de 
	 * cadenas introducidas por el usuario (Si hay dos cadenas de igual tamanio se mostrara la primera 
	 * que se ha introducido). Previamente se le pedira al usuario el numero de cadenas que 
	 * desea introducir
	 * 
	 * <pre>Ejemplo de ejecucion
	 *  Introduce el numero de cadenas a leer: 4
	 *  
	 *  Cadena 1: hola que tal
	 *  Cadena 2: ayer fui
	 *  Cadena 3: en un lugar de la mancha
	 *  Cadena 4: la casa esta vacia
	 *  
	 *  Cadena mas larga: en un lugar de la mancha
	 *  </pre>
	 *
	 */
	public void ejercicio08() {
		cabecera("08", "");

		// Inicio modificacion
		System.out.println("Introduce el numero de cadenas que desea introducir: ");
		int numeroCadenas = Teclado.readInteger();
		int longitudCadenaMayor=0;
		String cadenaMayor="";
		for(int i=0;i<numeroCadenas;i++){
			System.out.println("Introduce la cadena: ");
			String cadena = Teclado.readString();
			if(cadena.length()>longitudCadenaMayor){
				longitudCadenaMayor = cadena.length();
				cadenaMayor = cadena;
			}
		} 
		System.out.println("Cadena mas larga: "+cadenaMayor);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio9.
	 *
	 * Se pide
	 * <ul>
	 * <li>Quitar los comentarios indicados y compilar  el metodo ejercicio03() de la clase Apartado030102.
	 * <li>Modificar la clase Rectangulo
	 * <ul>
	 * <li>	Implementar el metodo: int compareTo(Rectangulo rectangulo) para que
	 * <ul>
	 * <li>	retorne -1 si el area del Rectangulo sobre el que se ejecuta el metodo  es menor que  
	 * 		el area del Rectangulo que se recibe como parametro del metodo.
	 * <li> retorne 0 si el area de los dos rectangulos es igual.
	 * <li> retorne 1 si el area del Rectangulo sobre el que se ejecuta el metodo  es mayor que 
	 * 		el area del Rectangulo que se recibe como parametro del metodo.
	 * </ul>
	 * </ul>
	 * <li>Modificar el metodo ejercicio09() de la clase Apartado030201 para que al ejecutarlo se muestre la 
	 *     informacion del rectangulo con mayor area.
	 * </ul>
	 *     
	 */
	public void ejercicio09() {
		cabecera("09", "");

		// Inicio modificacion
		

	    int n=4; //Numero de rectangulos a leer
		int base;
		int altura;
		Rectangulo rectanguloMaximo,rectangulo;
		rectanguloMaximo = new Rectangulo(0,0);
		
		for (int i=0;i<n;i++){
			System.out.println("Introduce la base del rectangulo "+i+" :");
			base=Teclado.readInteger();
			System.out.println("Introduce la altura del rectangulo "+i+" :");
			altura=Teclado.readInteger();
			rectangulo=new Rectangulo(base,altura);

			if(rectangulo.compareTo(rectanguloMaximo)==1){
				rectanguloMaximo=rectangulo;
			}
			
		}
		
		System.out.println("El rectangulo con mayor area es "+ rectanguloMaximo);
		
		
		// Fin modificacion
	}
			
	

	/**
	 * Instruccion for - Ejercicio10.
	 *
	 * Modificar los metodos de la clase TablaConversion para que al ejecutar el metodo ejercicio010()
	 * de la clase Apartado030201 se muestre una tabla de conversion con el siguiente formato.
	 *
	 * Ejemplo
	 * 
	 * <pre>C	F	C	F	C	F	C	F	C	F	
	 * 0	32	1	33	2	35	3	37	4	39
	 * 5	41	6	42	7	44	8	46	9	48
	 * 10	50	11	51	12	53	13	55	14	57
	 * 15	59	16	60	17	62	18	64	19	66
	 * 20	68	21	69	22	71	23	73	24	75
	 * 25	77	26	78	27	80	28	82	29	84
	 * 30	86	31	87	32	89	33	91	34	93
	 * 35	95	36	96	37	98	38	100	39	102
	 * 40	104	41	105	42	107	43	109	44	111
	 * 45	113	46	114	47	116	48	118	49	120</pre>	
	 */
	public void ejercicio10() {
		cabecera("10", "");

		TablaConversion tabla=new TablaConversion(5,10);
		tabla.imprimir();
	}
}
