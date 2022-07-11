package ejerciciosTema5;

public class Coche {
    String marca;
    String modelo;
    int year;
    double cc;

    public Coche() {}

    public Coche(String marca, String modelo, int year, double cc) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", cc=" + cc +
                '}';
    }
}
