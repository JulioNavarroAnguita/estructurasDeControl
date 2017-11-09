public class MostrarNumeros {
    public static void main(String[] args){
        mostrarNumeros(10);
        System.out.println("=================================");
        mostrarRangoNumeros(111,120);
        System.out.println("=================================");
        mostrarRangoNumeros(110,120,'p'); //imprimir pares
        System.out.println("=================================");
        mostrarRangoNumeros(110,120,'i'); //imprimir impares



    }

    public static void mostrarNumeros( int numero ) {
        int contador = 0;
        while ( contador <= numero ) {
            System.out.println(contador);
            contador++;
        }
        //Fuera del bucle
        System.out.println(contador);

    }

    public static void mostrarRangoNumeros( int numeroChico, int numeroGrande ) {
        if ( numeroChico < numeroGrande ) {

            int contador = numeroChico;
                while ( contador <= numeroGrande ) {
                    System.out.println(contador);
                    contador++;
                }

        } else {
            System.out.println(numeroChico + " es mas grande o igual que " + numeroGrande);
        }
    }
    
    public static void mostrarRangoNumeros( int numeroChico, int numeroGrande, char parOImpar ) {
        
        if ( numeroChico < numeroGrande ) {

            int contador = numeroChico;
                while ( contador <= numeroGrande ) {
					
					if ((parOImpar == 'p' || parOImpar == 'P') && contador % 2 == 0) {
						System.out.println(contador);//imprime pares
					}
					else if ((parOImpar == 'i' || parOImpar == 'I') && contador % 2 != 0) {
						System.out.println(contador);//imprime impares
					}
					else if ((parOImpar != 'i' && parOImpar != 'I' && parOImpar != 'p' && parOImpar != 'P')) {
						System.out.println(contador);//muestra todos porque no le pasamos i,I,p,P
					} 
                    contador++;
                }

        } else {
            System.out.println(numeroChico + " es mas grande o igual que " + numeroGrande);
        }

}
}
