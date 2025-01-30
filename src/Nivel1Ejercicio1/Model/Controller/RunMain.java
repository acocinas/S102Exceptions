package Nivel1Ejercicio1.Model.Controller;

import Nivel1Ejercicio1.Model.Entities.Product;
import Nivel1Ejercicio1.Model.Entities.Sales;
import Nivel1Ejercicio1.Model.Exceptions.EmptySalesException;

public class RunMain {
    public static void run() {
        Sales sales = new Sales();

        //Metodo para evitar duplicar codigo
        sales.tryCalculateTotal(sales);

        sales.addProduct(new Product("phone", 286.75));
        sales.addProduct(new Product("headphones", 39.25));
        sales.addProduct(new Product("phoneCase", 9.75));


        sales.tryCalculateTotal(sales);

        System.out.println("El precio total es: " + sales.getTotalPrice() + " €");

        try {
            System.out.println("Ahora dará el error Out of Bound Exception por" +
                    " intentar acceder a una posición que no existe del Array");
            Product outOfBoundsProduct = sales.getProducts().get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
