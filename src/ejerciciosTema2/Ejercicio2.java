package ejerciciosTema2;

public class Ejercicio2 {
    public static void main(String[] args) {

        double iva = 3.2d;
        double priceIva = getPriceIva(110,iva);
        System.out.println(priceIva);
    }

    private static double getPriceIva(double numero1, double iva) {
        return numero1 + iva;
    }
}
