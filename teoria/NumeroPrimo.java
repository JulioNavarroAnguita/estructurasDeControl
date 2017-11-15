
public class NumeroPrimo {
	public static void main (String[] args) {
	
		long posibleNumeroPrimo = 62;
		//84979;
		boolean verificacionDivisible235 = verificarDivisibilidad2o3o5 (posibleNumeroPrimo);
		int calcularEnteroRaizCuadrada = valorEnteroRaizCuadrada (posibleNumeroPrimo);
		boolean verificacionRaizCuadrada = calcularEnteroRaizCuadrada * calcularEnteroRaizCuadrada == posibleNumeroPrimo;
		boolean verificacionNumeroPrimo = esNumeroPrimo(posibleNumeroPrimo);
		
		System.out.println("Raiz cuadrada de " + posibleNumeroPrimo + " es: " + calcularEnteroRaizCuadrada);
		System.out.println("Es divisible entre 2, 3 o 5? " + verificacionDivisible235);
		System.out.println("La raiz cuadrada de " + posibleNumeroPrimo + ": " + calcularEnteroRaizCuadrada + 
			" al ser multiplicado por si mismo, es igual que " + posibleNumeroPrimo + " ? " + verificacionRaizCuadrada);
		System.out.println("Es entonces " + posibleNumeroPrimo + " un numero primo? " + verificacionNumeroPrimo);

	}
	public static boolean verificarDivisibilidad2o3o5 (long numero) {
		boolean resultado = numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0;
		return resultado;
	}
	public static int valorEnteroRaizCuadrada (long numero) {
		return (int) Math.sqrt(numero);
	}
	public static boolean esNumeroPrimo (long numero) {
		
		boolean resultado = false;
		
		for (long divisor = 2 ; divisor <= numero / 2 ; divisor++ ) {
            resultado = numero % divisor == 0;
            if ( resultado ) {
                break;
            } 
        }
        return !resultado;
	} 

}
