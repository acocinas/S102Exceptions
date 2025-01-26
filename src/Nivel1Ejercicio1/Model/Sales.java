package Nivel1Ejercicio1.Model;

import java.util.*;

public class Sales {
    private List<Product> products;
    private double totalPrice;

    public Sales(){
        this.products = new ArrayList<>();
        this.totalPrice =0;
    }
    public double getTotalPrice(){
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void calculateTotal() throws EmptySalesException{
        if (products.isEmpty()){
            throw new EmptySalesException();
        } else {
            totalPrice = 0;
            for (Product product : products){
                totalPrice += product.getPrice();
            }
        }
    }
}
