
public class ContarVocales {
    public static void main(String[] args) {
        String palabraLeida = args[0].toLowerCase();
        int contador = 0;
        for (int i = 0; i < palabraLeida.length(); i++) {
            if (palabraLeida.charAt(i) == 'a' ||
                palabraLeida.charAt(i) == 'e' || 
                palabraLeida.charAt(i) == 'i' || 
                palabraLeida.charAt(i) == 'o' || 
                palabraLeida.charAt(i) == 'u') {

                contador++;
            }
        }
        System.out.println("Numero de vocales encontradas: " + contador);
    }
}
