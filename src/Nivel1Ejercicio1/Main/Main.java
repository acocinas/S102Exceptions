package Nivel1Ejercicio1.Main;

import Nivel1Ejercicio1.Model.*;

public class Main {
    public static void main(String[] args) {
        Sales sales = new Sales();
       // sales.addProduct(new Product("phone", 286.75));
        //sales.addProduct(new Product("headphones", 39.25));
       // sales.addProduct(new Product("phoneCase", 9.75));
        try {
            sales.calculateTotal();
        }catch(EmptySalesException e){
            System.out.println(e.getMessage());
        }
        sales.addProduct(new Product("phone", 286.75));
        sales.addProduct(new Product("headphones", 39.25));
        sales.addProduct(new Product("phoneCase", 9.75));
        try{
            sales.calculateTotal();
            System.out.println("El precio total es: " + sales.getTotalPrice()+ " €");
        } catch (EmptySalesException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Ahora dará el error Out of Bound Exception por" +
                    " intentar acceder a una posición que no existe del Array");
            Product outOfBoundsProduct = sales.getProducts().get(5);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}