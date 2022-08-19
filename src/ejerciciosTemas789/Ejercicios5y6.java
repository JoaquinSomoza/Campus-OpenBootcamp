package ejerciciosTemas789;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicios5y6 {
    // Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.

    // Recorre ambos mostrando únicamente el valor de cada elemento.
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("elementoUno");
        lista.add("elementoDos");
        lista.add("elementoTres");
        lista.add("elementoCuatro");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);
        for (int i = 0; i < listaEnlazada.size(); i++) {
            System.out.println("Elementos de LinkedList: " + listaEnlazada.get(i));
        }

        // Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        ArrayList<Integer> elementosNum = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            elementosNum.add(i);
        }
        System.out.println(elementosNum);

        // Con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y
        // muestra el ArrayList final.
        for (int i = 1; i <= 10; i++) {
            elementosNum.removeIf(n -> (n % 2 == 0));
        }

        for (int i = 0; i < elementosNum.size(); i++) {
            System.out.println("Elementos del ArrayList: " + elementosNum.get(i));
        }
    }
}



