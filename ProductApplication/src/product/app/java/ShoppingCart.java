package product.app.java;

import product.app.java.model.Clothing;
import product.app.java.model.Electronics;
import product.app.java.repository.ShoppingCartRepository;
import product.app.java.repository.ShoppingCartServiceImpl;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        ShoppingCartRepository repository = new ShoppingCartServiceImpl();

        //Electronics
        System.out.println("=======ADD ELECTRONIC PRODUCTS DETAILS=======");
        System.out.println("Enter Product Id : ");
        int pId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Product Name : ");
        String pName = sc.nextLine();
        System.out.println("Enter Product Brand : ");
        String pBrand = sc.nextLine();
        System.out.println("Enter Product Warranty Period:");
        String pWarrantyPeriod = sc.nextLine();
        System.out.println("Enter Product Price : ");
        double pPrice = sc.nextDouble();
        System.out.println("Enter Quantity of Product : ");
        int pQuantity = sc.nextInt();

        Electronics electronics = new Electronics(pId, pName,pPrice,pQuantity,pBrand,pWarrantyPeriod);
        repository.addProduct(electronics);

        System.out.println("=======ADD CLOTHING PRODUCT DETAILS=======");
        System.out.println("Enter Clothing Product Id : ");
        int cId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Product Name : ");
        String cName = sc.nextLine();
        System.out.println("Enter Size:");
        String cSize = sc.nextLine();
        System.out.println("Enter Material : ");
        String cMaterial = sc.nextLine();
        System.out.println("Enter Product Price : ");
        double cPrice = sc.nextDouble();
        System.out.println("Enter Quantity of Product : ");
        int cQuantity = sc.nextInt();

        Clothing clothing = new Clothing(cId,cName,cPrice,cQuantity,cSize,cMaterial);
        repository.addProduct(clothing);

        System.out.println("Total Price --->"+repository.getTotalPrice());

    }
}
