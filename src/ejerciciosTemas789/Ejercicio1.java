package ejerciciosTemas789;

public class Ejercicio1 {
    public static void main(String[] args) {
        // debe recibir "hola mundo" y devolverlo al reves.
        String texto = "hola mundo";
        String reverse = " ";
        for (int i = texto.length() - 1; i >= 0; i--) {
            reverse += texto.charAt(i);
        }
        System.out.println(reverse);
    }

   /* public static String reverse(String texto) {
        texto = "hola mundo";
        String reverse = "";
        for( int i = texto.length() - 1; i >= 0; i--){
            reverse += texto.charAt(i);
        }
        return reverse;
    }*/

}