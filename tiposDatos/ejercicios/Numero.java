/**
* Esta clase define objetos que contienen
* un atributo denominado número
* y posee un método para devolver
* el valor doble
* @author Manuel Molino
* @version 1.0
*/
public class Numero{

	private int numero; //propiedad de los objetos.
	
	/**
	* Constructor: es un método que tiene
	* el mismo nombre que la clase y se
	* usa para crear objetos
	* * se usa para inicializar los objetos
	* de tipo número
	* @param n parámetro para inicializar el objeto	
	*/
	public Numero(int n){
		this.numero=n;
	}
	
	/**
	* método que devuelve el valor doble
	* @return int que representa el valor doble del atributo
	*/
	public int calcularDoble(){
		return this.numero * 2;
	}
	
	/**
	* método que devuelve el valor triple
	* @return int que representa el valor triple del atributo
	*/
	public int calcularTriple(){
		return this.numero * 3;
	}
	
	/**
	* método que devuelve el valor mitad
	* @return double que representa el valor mitad del atributo
	*/
	public double calcularMitad(){
		return this.numero / 2.0;
	}
}

//clase para comprobar el funcionamiento de la clase anterior
class TestNumeros {
	
	public static void main(String[] arg){
		
		//Creo uno objeto de tipo Número
		Numero n1 = new Numero(7);
		//Imprimo su valor doble
		System.out.println("Valor doble: " + n1.calcularDoble());
		System.out.println("Valor triple: " + n1.calcularTriple());
		System.out.println("Valor mitad: " + n1.calcularMitad());

	}
}
