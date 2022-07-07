package ejerciciosTema4.herencia;

import ejerciciosTema4.SmartDevice;


public class SmartPhone extends SmartDevice {
    String empresaTelefonica;
    double pixelesCam;

    public SmartPhone(){

    }

    public SmartPhone(String modeloSmarth, String fabricante, String color, int year, double pulgadasPantalla, boolean sumergible, String empresaTelefonica, double pixelesCam) {
        super(modeloSmarth, fabricante, color, year, pulgadasPantalla, sumergible);
        this.empresaTelefonica = empresaTelefonica;
        this.pixelesCam = pixelesCam;
    }
}
