package Nivel2Ejercicio1.Main;

import static Nivel2Ejercicio1.Model.InputClass.*;

public class Main {
    public static void main(String[] args) {
        byte age = readByte("Introduce tu edad:");
        int number = readInt("Introduce un número entero:");
        float decimalNumber = readFloat("Introduce un número decimal:");
        double bigNumber = readDouble("Introduce un número grande:");
        char character = readChar("Introduce un carácter:");
        String text = readString("Introduce letras y/o números o símbolos:");
        boolean answer = readSiNo("¿Te gusta la programación?");

        System.out.println("Datos introducidos:");
        System.out.println("Edad: " + age);
        System.out.println("Número entero: " + number);
        System.out.println("Número decimal: " + decimalNumber);
        System.out.println("Número grande: " + bigNumber);
        System.out.println("Carácter: " + character);
        System.out.println("Texto: " + text);
        System.out.println("¿Te gusta la programación?: " + (answer ? "Sí" : "No"));
       
    }
}