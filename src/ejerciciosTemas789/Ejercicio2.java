package ejerciciosTemas789;

public class Ejercicio2 {
    //Crea un array bidimensional de enteros y recórrelo,
    // mostrando la posición y el valor de cada elemento en ambas dimensiones.
    public static void main(String[] args) {
        int arrayBidimensional [][] = new int [2][3];
        arrayBidimensional [0][0] = 1;
        arrayBidimensional [0][1] = 2;
        arrayBidimensional [0][2] = 3;

        arrayBidimensional [1][0] = 11;
        arrayBidimensional [1][1] = 22;
        arrayBidimensional [1][2] = 33;

        for(int i = 0; i < arrayBidimensional.length; i++){
            System.out.println("Valor de i: "+i);
            for(int j = 0; j < arrayBidimensional[i].length; j++){
                System.out.println("Mi posicion en i = "+i+" ,en j= "+j);
                System.out.println(arrayBidimensional[i][j]);
            }

        }
    }

}
