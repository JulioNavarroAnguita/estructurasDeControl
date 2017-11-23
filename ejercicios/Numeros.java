public class Numeros{
	public static void main(String[] args){
		imprimirPrimerosDiezNumeros();
		System.out.println("__________________");
		imprimirDel20Al80DeCincoEn5();
		System.out.println("__________________");
		imprimirDel100Al50DeDiezEn10();
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
	
		for(int i = 100; i <= 50; i -= 10){
			System.out.println(i);
		}
	}
}
