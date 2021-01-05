package es.unileon.prg.tema6;

/**
 * Clase que representa un numero entero
 * 
 * @author PRG
 * @version 1.0
 */

public class NumeroEntero {

	/**
	 * Valor del numero
	 * 
	 */
	private int valor;

	/**
	 * Constructor de la clase. Crea un numero con el valor recibido
	 * 
	 * @param valor
	 *            valor del numero
	 * 
	 */
	public NumeroEntero(int valor) {
		this.valor = valor;
	}

	/**
	 * Constructor de la clase. Crea un numero con el valor 0
	 * 
	 */
	public NumeroEntero() {
		this.valor = 0;
	}

	/**
	 * Modifica el valor del numero
	 * 
	 * @return Valor del numero
	 */
	void setValor(int nuevoValor) {
		this.valor = nuevoValor;
	}

	/**
	 * Retorna el valor del numero
	 * 
	 * @return Valor del numero
	 */
	int getValor() {
		return this.valor;
	}

	/**
	 * Incrementa en 1 el valor del numero
	 * 
	 */
	void incrementar() {
		if (this.valor < Integer.MAX_VALUE)
			this.valor = this.valor + 1;
	}

	/**
	 * Decrementa en 1 el valor del numero
	 * 
	 */
	void decrementar() {
		if (this.valor > Integer.MIN_VALUE)
			this.valor = this.valor - 1;
	}

	/**
	 * Pone a 0 el valor del numero
	 * 
	 */
	void poneraCero() {
		this.valor = 0;
	}

	/**
	 * Suma el numero entero con otro
	 * 
	 * @parame n Numero con el que se suma
	 * @return Objeto de tipo NumeroEntero cuyo valor es la suma
	 */
	NumeroEntero suma(NumeroEntero n) {

		NumeroEntero suma = new NumeroEntero(this.valor + n.getValor());
		return suma;
	}

	public String toString() {
		StringBuffer salida = new StringBuffer();

		salida.append(this.valor);

		return salida.toString();

	}

	
	 // -- Inicio modificacion del ejercicio10 Apartado030101. 
	 public boolean equals(NumeroEntero n){
		if(this.valor == n.getValor()){
			return true;
		} 
			return false;
		}
	 
	 // -- Fin modificacion del ejercicio10 Apartado030101
	 

	
	 // -- Inicio modificacion del ejercicio03 Apartado030102. 
	   	public int compareTo(NumeroEntero n){
	 	if(this.valor< n.getValor()){
			 return -1;
		 } else if(this.valor == n.getValor()){
			 return 0;
		 } else{
			 return 1;
		 }
	 }
	  
	  // -- Fin modificacion del ejercicio02 Apartado030102.
	 

		// Inicio modificacion del ejercicio05 Apartado030202. 
	 int numeroDigitos(){
		 int numero=getValor();
		 int contador=0;
		 while(numero>0){
			 numero =numero/10;
			 contador = contador+1;
		 }
		return contador;
	 }

	int inverso(){ //52+
		int numero=getValor();
		int resto;
		int invertido=0;
		while(numero>0){  //52	5
			resto = numero%10; // resto=2	resto=5
			invertido = invertido*10 + resto; // 2	25
			numero = numero/10; // 5	0
		}
		return invertido;
	}	

	boolean esCapicua(){
		if(getValor()==inverso()){
			return true;
		}
		return false;
	}
	  
	 //Fin modificacion del ejercicio05 Apartado030202.
	 

}