import java.util.Scanner;

public class Tiempo {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una hora valida");
		int hora = in.nextInt();
		if(hora < 0 || hora > 23){
			System.out.println("Hora no valida");
			return;
		}
		System.out.println("Introduce los minutos");
		int minutos = in.nextInt();
		if(minutos < 0 || minutos > 59){
			System.out.println("Minutos no validos");
			return;
		}
		System.out.println("Introduce los segundos");
		int segundos = in.nextInt();
		in.close();
		if(segundos < 0 || segundos > 59){
			System.out.println("segundos no validos");
			return;
		}
		System.out.printf("Hora valida %d:%d:%d%n", hora, minutos, segundos);

	}
}

