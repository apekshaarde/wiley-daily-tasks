package product.app.java.repository;

import exception.DuplicateIDException;
import product.app.java.model.Product;

public interface ShoppingCartRepository {

    public void addProduct(Product product) throws DuplicateIDException;

    public void displayProduct();

    public int getTotalPrice();

    public void deleteProduct(int id);
}
