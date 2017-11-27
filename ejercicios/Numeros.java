public class Numeros{
	public static void main(String[] args){
		imprimirPrimerosDiezNumeros();
		System.out.println("__________________");
		imprimirDel20Al80DeCincoEn5();
		System.out.println("__________________");
		imprimirDel100Al50DeDiezEn10();
		System.out.println("__________________");
		int numero = 10;
		int suma = calcularSumaDe1aN(numero);
		System.out.printf("La suma de los %d primeros numeros vale %d %n", numero, suma);
		int sumaCuadrado = calcularSumaAlCuadrado(numero);
		System.out.printf("La suma de los %d primeros numeros al cuadrado vale %d%n", numero, sumaCuadrado);
		imprimirSumaParesEImpares(numero);
		
		

	}

	public static void imprimirPrimerosDiezNumeros (){
	
		for(int i = 1; i < 11; i++){
			System.out.println(i);
		}
	}
	
	public static void imprimirDel20Al80DeCincoEn5 (){
	
		for(int i = 20; i <= 80; i += 5){
			System.out.println(i);
		}
	}
	
	public static void imprimirDel100Al50DeDiezEn10 (){
	
		for(int i = 100; i >= 50; i -= 10){
			System.out.println(i);
		}
	}
	
	public static int calcularSumaDe1aN(int numero){
		int contador = 0;
		int suma = 0;
		while (contador <= numero) {
			suma += contador;
			contador++;
		}
		return suma;
	}
	
	public static int calcularSumaAlCuadrado(int numero){
		int contador = 0;
		int suma = 0;
		while (contador <= numero) {
			suma += contador * contador;
			contador++;
		}
		return suma;
	}
	
	public static void imprimirSumaParesEImpares(int numero){

		int sumaPares   = 0;
		int sumaImpares = 0; 
		for(int i = 0; i <= numero; i++){
				if(i % 2 == 0){
					sumaPares += i;
				}
				else
				sumaImpares += i;
		}
		System.out.printf("La suma de 0 a %d, para los numneros pares vale %d, para los numeros impares vale %d%n", numero, sumaPares, sumaImpares);

	}
	
	
}
