package Nivel2Ejercicio1.Model;
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
                sc.next();
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
                sc.next();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduce un número decimal válido (usa coma en lugar de punto).");
                sc.next();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduce un número decimal válido (usa coma en lugar de punto).");
                sc.next();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = sc.next();
                if (input.length() == 1) {
                    return input.charAt(0);
                } else {
                    throw new Exception("Debes introducir un solo carácter.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.print(message + " ");
            String input = sc.nextLine().trim();//el .trim es para evitar que sea una cadena de espacios considerada vacía
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println("Error: No puedes dar solo enter, introduce algo.");
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
                System.out.println("Entrada inválida. Por favor, introduce 's' para sí o 'n' para no.");
            }
        }
    }
}
