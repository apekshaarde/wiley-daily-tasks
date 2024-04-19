package product.app.java.repository;

import product.app.java.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartServiceImpl implements ShoppingCartRepository{

    List<Product> productList;

    public ShoppingCartServiceImpl(){
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void displayProduct() {
        System.out.println(this.getClass().getSimpleName());
        for(Product product : productList){
            System.out.println("Product ID : "+product.getProductId());
            System.out.println("Product Name : "+product.getProductName());
            System.out.println("Product Price : "+product.getPrice());
            System.out.println("Product Quantity In Stock : "+product.getQuantityInStock());
        }
    }

    public int getTotalPrice() {
       int totalPrice = 0;
       for(Product product : productList){
           totalPrice += product.getPrice();
       }
       return totalPrice;
    }
}
