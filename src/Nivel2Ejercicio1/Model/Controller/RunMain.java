package Nivel2Ejercicio1.Model.Controller;

import static Nivel2Ejercicio1.Model.Entities.InputClass.*;

public class RunMain {
    public static void run(){
        byte age = readByte("Introduce tu edad:");
        int number = readInt("Introduce un número entero:");
        float decimalNumber = readFloat("Introduce un número, sea decimal o no (float):");
        double bigNumber = readDouble("Introduce cualquier número, sea decimal o no(double):");
        char character = readChar("Introduce un carácter:");
        String text = readString("Introduce letras y/o números o símbolos:");
        boolean answer = readSiNo("¿Te gusta la programación?");

        System.out.println("Datos introducidos:");
        System.out.println("Edad: " + age);
        System.out.println("Número entero: " + number);
        System.out.println("Número float: " + decimalNumber);
        System.out.println("Número double: " + bigNumber);
        System.out.println("Carácter: " + character);
        System.out.println("Cadena de texto: " + text);
        System.out.println((answer ? "Me encanta programar" : "Odio programar"));

    }
}
