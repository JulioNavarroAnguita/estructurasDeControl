import java.util.Scanner;

public class Cifras {
	public static void main (String[] args) {
		
		System.out.println("Introduce un numero de tres cifras");
		Scanner in = new Scanner(System.in);
		int nTresCifras = in.nextInt();
		in.close();
		if( nTresCifras < 0){
			nTresCifras *= -1;
		}
		//comprobamos que tiene tres cifras
		if(nTresCifras < 100 || nTresCifras > 999) {
		//no hacemos nada, y salimos del programa
		System.out.println("no es un numero de tres cifras");
		}else{
		//codigo para el caso de tres cifras
		System.out.println("Es un numero de tres cifras");
		//convertir a cadena, para poder recorrer las tres cifras
		//concatenar el int a cadena vacia
		String nCadena = nTresCifras + ""; //Casting a cadena
		for(int i = 0; i < 3; i++){
			System.out.println("Cifra: " + nCadena.charAt(i));
		}
		}

	}
}
