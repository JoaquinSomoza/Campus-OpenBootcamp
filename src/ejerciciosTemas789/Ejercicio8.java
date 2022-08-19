package ejerciciosTemas789;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Ejercicio8 {
    //Utilizando InputStream y PrintStream, crea una función con dos parámetros: "fileIn" y "fileOut".
    //Que realice la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
    public static void main(String[] args) {
        try{
            InputStream fileIn = new FileInputStream("C:\\Users\\Joaquin\\Desktop\\fileIn.txt");
            byte[] datos = fileIn.readAllBytes();
            fileIn.close();

            PrintStream fileOut = new PrintStream("fileOut.txt");
            fileOut.write(datos);
            fileOut.close();
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
