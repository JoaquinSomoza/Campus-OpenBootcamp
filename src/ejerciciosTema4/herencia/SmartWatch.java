package ejerciciosTema4.herencia;

import ejerciciosTema4.SmartDevice;


public class SmartWatch extends SmartDevice {
    boolean mallaMetalicas;
    boolean frecuenciaCardiaca;


    public SmartWatch(){

    }

    public SmartWatch(String modeloSmarth, String fabricante, String color, int year, double pulgadasPantalla, boolean sumergible, boolean mallaMetalicas, boolean frecuenciaCardiaca) {
        super(modeloSmarth, fabricante, color, year, pulgadasPantalla, sumergible);
        this.mallaMetalicas = mallaMetalicas;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }
}
