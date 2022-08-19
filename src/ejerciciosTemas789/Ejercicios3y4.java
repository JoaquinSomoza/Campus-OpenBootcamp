package ejerciciosTemas789;

import java.util.Vector;

public class Ejercicios3y4 {
    //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
    //Elimina el 2o y 3er elemento y muestra el resultado final.
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector(5);
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        vector.remove(1);
        vector.remove(2);
        System.out.println(vector);
    }
    //Indica cuál es el problema de utilizar un Vector con la capacidad
    // por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

    /* El problema se va a ver que por defecto la capacidad va a ser de 10 elementos, duplicando su
    capacidad cada vez que se vea completa. Al necesitar duplicar tantas veces puede que nuestra aplicacion
    se vea afectada en tiempo y en el consumo que esto requiere.
      */
}
