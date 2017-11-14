/**Fichero de datos BucleConBreak.java
 * Ejemplo de funcionamiento
 * de programa capaz de 
 * calcular si es primo o no
 * @author Julio Navarro
 * @version 1.0*/

public class BucleConBreak {
    public static void main (String[] args) {

        long posibleNumeroPrimo =  997;
        boolean resultado = false;
        //for (int divisor = 2 ; divisor < posibleNumeroPrimo ; divisor++ ) {
        //de la mitad del posibleNuemeroPrimo hasta posibleNumeroPrimos 
        //NUNCA existirá un posible divisor, se mejora el algoritmo si
        // ponemos divisor < posibleNumeroPrimo / 2
        for (long divisor = 2 ; divisor <= posibleNumeroPrimo / 2 ; divisor++ ) {
            resultado = posibleNumeroPrimo % divisor == 0;
            //if (resultado == true) {
            if ( resultado ) {
                System.out.println("Primer divisor: " + divisor);
                break;
            }
           // System.out.println(posibleNumeroPrimo + "  " + divisor + "  " + resultado); 
        }
        System.out.println("Es numero primo " + posibleNumeroPrimo + " ? " + !resultado);
        System.out.println("Es numero primo " + 86743 + " ? " + esNumeroPrimo(86743));
        System.out.println("Es numero primo " + 997 + " ? " + esNumeroPrimo(997));


        // System.out.println("¿Es nº primo " + posibleNumeroPrimo + "? " + esNumeroPrimo (posibleNumeroPrimo ) );
    }
    /**Método que nos devuelve si un número
     * es primo o no, pasando este parámetro
     * @param numero el dígito que se comprobará si es primo o no
     * @return true o false dependiendo si es o no es número primo
     * */
     
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
