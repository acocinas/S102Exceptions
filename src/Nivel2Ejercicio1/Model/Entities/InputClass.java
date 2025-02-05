package Nivel2Ejercicio1.Model.Entities;

import Nivel2Ejercicio1.Model.Exceptions.DifferentArgumentException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputClass {
    private static final Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduce un byte válido.");
                sc.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduce un número entero válido.");
                sc.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduce un número válido, si es decimal usa coma en lugar de punto.");
                sc.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduce un número válido " +
                        "(sin letras y si usas separador, usa coma en lugar de punto).");
                sc.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = sc.next();

                if (input.length() != 1) {
                    throw new DifferentArgumentException();
                } else {
                    return input.charAt(0);
                }
            } catch (DifferentArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        //condición por si el caracter introducido anteriormente es un número, que se limpie el buffer
        //Se pone antes del bucle, para que si la cadena introducida es vacía no de error al introducir una correcta
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
        while (true) {
            System.out.print(message + " ");
            String input = sc.nextLine().trim();//el .trim es para evitar que sea una cadena de espacios considerada vacía
            if (input.isEmpty()) {
                System.out.println("Debes introducir algo.");
            } else {
                return input;
            }
        }
    }

    public static boolean readSiNo(String message) {
        while (true) {
            System.out.print(message + " (s/n): ");
            String input = sc.next();
            if (input.equalsIgnoreCase("s")) {
                return true;
            } else if (input.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("Por favor, introduce 's' para sí o 'n' para no.");
            }
        }
    }
}
