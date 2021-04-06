
public class IteradorWhile1 {
	
	public static void main (String[] args) {
		boolean variable = true;
		int contador = 0;
		 while ( variable ) {
			 
			 System.out.println(contador + "- Dentro del bucle while");
			 contador++;
			 if (contador == 10) {
				variable = false;
			 }
			 
		 }
		 System.out.println("Fin de programa, el contador vale: " + contador);
	}
}

