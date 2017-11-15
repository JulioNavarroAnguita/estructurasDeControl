public class NumeroPrimo {
	public static void main (String[] args) {
	
		long posibleNumeroPrimo = 9;
		//84979;
		boolean verificacionDivisible235 = verificarDivisibilidad2o3o5 (posibleNumeroPrimo);
		int calcularEnteroRaizCuadrada = valorEnteroRaizCuadrada (posibleNumeroPrimo);
		boolean verificacionRaizCuadrada = calcularEnteroRaizCuadrada * calcularEnteroRaizCuadrada == posibleNumeroPrimo;
		
		System.out.println("Raiz cuadrada de " + posibleNumeroPrimo + ": " + calcularEnteroRaizCuadrada);
		System.out.println("Es " + posibleNumeroPrimo + " divisible por 2 o 3 o 5? " + verificacionDivisible235);

		System.out.println("Es numero primo " + posibleNumeroPrimo + "? " +  verificacionRaizCuadrada);
	}
	public static boolean verificarDivisibilidad2o3o5 (long numero) {
		boolean resultado = numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0;
		return resultado;
	}
	public static int valorEnteroRaizCuadrada (long numero) {
		return (int) Math.sqrt(numero);
	}


}
