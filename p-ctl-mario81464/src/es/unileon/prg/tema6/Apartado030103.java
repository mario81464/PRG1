package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instrucciin "switch".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion switch";
	}

	/**
	 * Instruccion switch - Ejercicio1.
	 *
	 * Modificar el metodo  para que al introducir un calificacion numerica  por teclado(1-10) se muestre 
	 * la calificacion de forma textual (1-4 -> Insuficiente , 5 -> Suficiente, 6 -> Bien, 
	 * 7-8 -> Notable, 9 -> Sobresaliente, 10 -> Matricula)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int nota =Teclado.readInteger();
		String textoNota;
		switch(nota){
			case 1: textoNota ="Insuficiente";break;
			case 2: textoNota ="Insuficiente";break;
			case 3: textoNota ="Insuficiente";break;
			case 4: textoNota ="Insuficiente";break;
			case 5: textoNota ="Suficiente";break;
			case 6: textoNota ="Bien";break;
			case 7: textoNota ="Notable";break;
			case 8: textoNota ="Notable";break;
			case 9: textoNota ="Sobresaliente";break;
			case 10: textoNota ="Matricula";break;
			default : textoNota ="Nota introducida no válida";
		}
		System.out.println(textoNota);
        // Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio2.
	 *
	 * Modificar el metodo  para que retorne el numero de anillos que tiene un digito entero 
	 * introducido por el teclado. Se definen los anillos de un digito como el numero de circulos
	 * que tiene un digito. Ej.: 0 -> 1 anillo, 2 -> 0 anillos, 8 -> 2 anillos, etc.).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		System.out.println("Introduce un número entero: ");
		int numero = Teclado.readInteger();
		String numeroString = String.valueOf(numero);
		char ultimoDigito = numeroString.charAt(numeroString.length()-1);
		int numeroDeAnillos;
		switch(ultimoDigito){
			case '0': numeroDeAnillos= 1;break;
			case '6': numeroDeAnillos= 1;break;
			case '8': numeroDeAnillos= 2;break;
			case '9': numeroDeAnillos= 1;break; 
			default: numeroDeAnillos= 0;
		}
		System.out.println("El último dígito tiene "+numeroDeAnillos+" anillo(s)");
		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio3.
	 *
	 * Modificar el metodo ejercicio3() del Apartado030103, utilizando una sentencia switch, 
	 * para que realice la misma funcionalidad que el metodo ejercicio4() del Apartado030102.
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		System.out.println("Introduzca 2 números enteros : ");
		int n1 = Teclado.readInteger();
		int n2 = Teclado.readInteger();


		System.out.println("Seleccione una opción: 1-Sumar 2-Multiplicar 3-Divisores");
		int valorEntrada = Teclado.readInteger();

		switch(valorEntrada){
			case 1: System.out.println(n1+n2);break;
			case 2: System.out.println(n1*n2);break;
			case 3: 
				if(n1%n2 == 0){
				System.out.println(n2+" es divisor de "+n1);
				} else if(n2%n1 == 0){
				System.out.println(n1+" es divisor de "+n2);
				} else{
				System.out.println("Ninguno es divisor del otro");
				}break;
			default: System.out.println("Opción incorrecta");
		}

		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio4.
	 *
	 * Modificar el metodo ejercicio4() del Apartado030103  para que al introducir una cadena de caracteres 
	 * por teclado  se indique si el primer caracter de la cadena es una vocal escrita en minusculas, 
	 * si es una vocal escrita en mayusculas o si es otro tipo de caracter.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		System.out.println("Introduce una cadena de caracteres: ");
		String cadena = Teclado.readString();
		switch(cadena.charAt(0)){
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
					System.out.println("Empieza por vocal mayúscula");break;

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
					System.out.println("Empieza por vocal minúscula");break;

			default: System.out.println("No empieza por vocal");
		}
			// Fin modificacion
		}
		
	}