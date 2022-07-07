package ejerciciosTema4;

public class SmartDevice {

    // 1. atributos

    protected String modeloSmarth;
    protected String fabricante;
    protected String color;
    protected int year;
    protected double pulgadasPantalla;
    protected boolean sumergible;

    // 2. Constructor
    public SmartDevice(){}

    public SmartDevice(String modeloSmarth, String fabricante, String color, int year, double pulgadasPantalla, boolean sumergible) {
        this.modeloSmarth = modeloSmarth;
        this.fabricante = fabricante;
        this.color = color;
        this.year = year;
        this.pulgadasPantalla = pulgadasPantalla;
        this.sumergible = sumergible;
    }



}
