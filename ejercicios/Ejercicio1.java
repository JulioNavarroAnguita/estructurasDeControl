public class Ejercicio1 {
	
	public static void main (String[] args) {
		
		String cadena = "puede ser una frase";
		boolean contiene = cadena.contains("na");
		System.out.printf("La cadena %s contiene %s? %b %n", cadena, "na", contiene);
		
		boolean terminaCon = cadena.endsWith("se");
		System.out.printf("La cadena %s termina en %s? %b %n", cadena, "se", terminaCon);
		
		boolean compara = cadena.equalsIgnoreCase("pUeDe Ser unA fRasE");
		System.out.printf("La cadena %s es igual a %s? %b %n", cadena, "puede ser una frase", compara);
		
		boolean vacia = cadena.isEmpty();
		System.out.printf("La cadena %s esta vacia? %b %n", cadena, vacia);
		
		boolean comienzaCon = cadena.startsWith("pu");
		System.out.printf("la cadena %s comienza con %s? %b %n", cadena, "pu", comienzaCon);
		
		System.out.printf("el caracter en la posicion 3 de la cadena es: %s %n", cadena.charAt(3));
		
	}
}

