package product.app.java.repository;

import product.app.java.model.Product;

public interface ShoppingCartRepository {

    public void addProduct(Product product);

    public void displayProduct();

    public int getTotalPrice();
}
