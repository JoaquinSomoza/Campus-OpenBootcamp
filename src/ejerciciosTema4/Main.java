package ejerciciosTema4;

import ejerciciosTema4.herencia.SmartPhone;
import ejerciciosTema4.herencia.SmartWatch;


public class Main {
    public static void main(String[] args) {


        SmartPhone iPhone10 = new SmartPhone("Iphone 10","Apple","Blanco",2021,5.8,true,"Movistar",12.0);
        System.out.println(iPhone10.fabricante);
        System.out.println(iPhone10.modeloSmarth);

        SmartWatch galaxyWatch = new SmartWatch("Galaxy Watch","Samsung","Negro",2022,1.2,true,false,true);
        System.out.println(galaxyWatch.fabricante);
        System.out.println(galaxyWatch.pulgadasPantalla);

    }

}
