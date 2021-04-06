/*EJERCICIO 1
El ejercicio trata de calcular el volumen y el área de una esfera:

Primero definimos un radio iRadio de tipo entero, luego un radio fRadio de tipo float y
finalmente el radio de tipo double dRadio

El área y volumen lo calculamos igual, primero para iRadio como iSuperficie e iVolumen
Para float fSuperficie y fVolumen
Para double dSuperficie y dVolumen

PI como constante de tipo double y como 3.1416

La salida en consola sería:
Una circunferencia de radio XXXX tiene como superficie XXXX y volumen XXXX
 */


public class Huelga1 {
	
	public static void main (String[] args) {
		final double PI = 3.1416;
		
		//trabajando con int
		int iRadio = 63;
		int iSuperficie = 4 * (int) PI * iRadio * iRadio;
		int iVolume     = 4 / 3 * (int) PI * iRadio * iRadio * iRadio;
		System.out.println("Una circunferencia de radio " + iRadio + " tiene como superficie " + iSuperficie + " y volumen "+ iVolume);
		
		//trabajando con float
		float fRadio = 63.001f;
		float fSuperficie = 4.0f * (float) PI * fRadio * fRadio;
		float fVolume     = 4.0f / 3.0f *  (float) PI * fRadio * fRadio * fRadio;
		System.out.println("Una circunferencia de radio " + fRadio + " tiene como superficie " + fSuperficie + " y volumen "+ fVolume);
		
		//trabajando con float
		double dRadio = 63.001;
		double dSuperficie = 4.0 *  PI * dRadio * dRadio;
		double dVolume     = 4.0 / 3.0 * PI * dRadio * dRadio * dRadio;
		System.out.println("Una circunferencia de radio " + dRadio + " tiene como superficie " + dSuperficie + " y volumen "+ dVolume);
		
	}
}

