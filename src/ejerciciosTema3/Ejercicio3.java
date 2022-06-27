package ejerciciosTema3;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = {"Joaquin", "Juan", "Martin", "Augusto", "Carlos", "Maria" };
        String unSoloTexto = "";
        for (String nombre : nombres) {
            unSoloTexto += nombre + " ";
        }
        System.out.println("Los integrantes de mi familia son: " + unSoloTexto);
    }
}
