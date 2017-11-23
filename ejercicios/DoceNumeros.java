import java.util.Scanner;

public class DoceNumeros {
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Numero uno");
		double numero1 = in.nextDouble();
		System.out.println("Numero dos");
		double numero2 = in.nextDouble();
		System.out.println("Numero tres");
		double numero3 = in.nextDouble();
		System.out.println("Numero cuatro");
		double numero4 = in.nextDouble();
		System.out.println("Numero cinco");
		double numero5 = in.nextDouble();
		System.out.println("Numero seis");
		double numero6 = in.nextDouble();
		System.out.println("Numero siete");
		double numero7 = in.nextDouble();
		System.out.println("Numero ocho");
		double numero8 = in.nextDouble();
		System.out.println("Numero nueve");
		double numero9 = in.nextDouble();
		System.out.println("Numero diez");
		double numero10 = in.nextDouble();
		System.out.println("Numero once");
		double numero11 = in.nextDouble();
		System.out.println("Numero doce");
		double numero12 = in.nextDouble();
		in.close();
		System.out.printf("%10.2f %10.2f %10.2f%n", numero1, numero2, numero3);
		System.out.printf("%10.2f %10.2f %10.2f%n", numero4, numero5, numero6);
		System.out.printf("%10.2f %10.2f %10.2f%n", numero7, numero8, numero9);
		System.out.printf("%10.2f %10.2f %10.2f%n", numero10, numero11, numero12);

	}
}
