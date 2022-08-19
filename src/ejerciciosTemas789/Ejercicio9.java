package ejerciciosTemas789;

import java.util.*;



public class Ejercicio9 {
    // Crea un programa que utilice InputStream,
    // PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
    public static void main(String[] args) {


        HashMap<String,Integer> historial = new HashMap<>();

        ArrayList<Integer> ultimosConvertidos = new ArrayList<Integer>();


        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Introduce tu numero a convertir: ");
            int numero1 = scanner.nextInt();
            historial.put("primer valor :",numero1);
            System.out.println("Introduce el valor de la moneda en la cual quiere convertir: ");
            int numero2 = scanner.nextInt();
            historial.put("segundo valor :",numero2);
            int conversor = numero1 * numero2;
            historial.put("conversion :",conversor);
            ultimosConvertidos.add(conversor);
            System.out.println(conversor);
        } catch(InputMismatchException e){
            System.out.println("Vuelve a intentarlo utilizando numeros.");
        }

        //System.out.println(historial);

        for(Map.Entry elemento : historial.entrySet()){
            System.out.println(elemento.getKey());
            System.out.println(elemento.getValue());
        }

        for(Integer ultimos: ultimosConvertidos){
            System.out.println( "Ultimo valor convertido: "+ ultimos);
        }

    }
}
