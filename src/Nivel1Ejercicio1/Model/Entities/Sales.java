package Nivel1Ejercicio1.Model.Entities;

import Nivel1Ejercicio1.Model.Exceptions.EmptySalesException;

import java.util.*;

public class Sales {
    private List<Product> products;
    private double totalPrice;

    public Sales() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {

        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void calculateTotal() throws EmptySalesException {
        if (products.isEmpty()){
            throw new EmptySalesException();
        } else {
            for (Product product : products){
                totalPrice += product.getPrice();
            }
        }
    }
    public void tryCalculateTotal(Sales sales) {
        try {
            calculateTotal();
        } catch (EmptySalesException e) {
            System.out.println(e.getMessage());
        }
    }
}
