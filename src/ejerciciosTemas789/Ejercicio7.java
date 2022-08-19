package ejerciciosTemas789;

public class Ejercicio7 {
    //Crea una función DividePorCero que genere una excepción ("throws") del tipo ArithmeticException
    // que será capturada por su llamante (desde "main", por ejemplo).
    // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
    // Finalmente, mostraremos en cualquier caso: "Demo de código".

    public static void main(String[] args) {
        try{
            dividePorCero(1,0);

        }catch (Exception e){
            System.out.println("Esto no puede hacerse");
        }
    }

    public static int dividePorCero(int A, int B) throws ArithmeticException{
        int resultado = 0;
        try{
             resultado = A / B;
            System.out.println("Resultado es: "+ resultado);
        }catch(ArithmeticException e){
            throw new ArithmeticException();
        }
        return resultado;

    }
}
