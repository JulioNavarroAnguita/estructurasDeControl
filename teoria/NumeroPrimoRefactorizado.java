
public class NumeroPrimoRefactorizado {
	public static void main (String[] args) {
	
		long posibleNumeroPrimo = 7;
		//84979;
		boolean verificacionDivisible235 = verificarDivisibilidad2o3o5 (posibleNumeroPrimo);
			System.out.println("Es divisible entre 2, 3 o 5? " + verificacionDivisible235);
		int calcularEnteroRaizCuadrada = valorEnteroRaizCuadrada (posibleNumeroPrimo);
			System.out.println("Raiz cuadrada de " + posibleNumeroPrimo + " es: " + calcularEnteroRaizCuadrada);
		boolean verificacionRaizCuadrada = calcularEnteroRaizCuadrada * calcularEnteroRaizCuadrada == posibleNumeroPrimo;
			System.out.println("La raiz cuadrada de " + posibleNumeroPrimo + ": " + calcularEnteroRaizCuadrada + 
			" al ser multiplicado por si mismo, es igual que " + posibleNumeroPrimo + " ? " + verificacionRaizCuadrada);
		boolean verificacionNumeroPrimo = esNumeroPrimo(posibleNumeroPrimo);
			System.out.println("Es entonces " + posibleNumeroPrimo + " un numero primo? " + verificacionNumeroPrimo);
		boolean compuesto = verificacionDivisible235 || verificacionNumeroPrimo || verificacionRaizCuadrada;
			System.out.println(posibleNumeroPrimo + " es compuesto? " + compuesto);	

	}

	public static boolean verificarDivisibilidad2o3o5 (long numero) {
		return numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0;
	}

	public static int valorEnteroRaizCuadrada (long numero) {
		return (int) Math.sqrt(numero);
	}

	public static boolean esNumeroPrimo (long numero) {
		boolean resultado = false;
		for (long divisor = 7 ; divisor < numero / 2 ; divisor++ ) {
            resultado = numero % divisor == 0;
            if (resultado) {
				System.out.println("divisor" + divisor);
                break;
            } 
        }
        return resultado;
	} 

}
