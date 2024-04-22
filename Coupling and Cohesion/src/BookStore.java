import com.invension.app.exception.BookNotFound;
import com.invension.app.model.Book;
import com.invension.app.service.Inventory;
import com.invension.app.service.InventoryImpl;
import com.invension.app.service.ShoppingCart;
import com.invension.app.service.ShoppingCartImpl;

import java.util.List;

public class BookStore {
    public static void main(String[] args) {
        Inventory inventory = new InventoryImpl();
        ShoppingCart shoppingCart = new ShoppingCartImpl();

        inventory.addBook(new Book("JAVA","James Gosling",400));
        inventory.addBook(new Book("Let Us C","Yashavant P Kanetkar",300));
        inventory.addBook(new Book("Understanding Pointers in C.","Yashavant P Kanetkar",500));
        inventory.addBook(new Book("Unix Shell Programming.","Yashavant P Kanetkar",550));
        inventory.addBook(new Book("ABC","XYZ",700));
        inventory.addBook(new Book("PQR","XYZ",450));
        inventory.addBook(new Book("SSS","XYZ",300));


        //Add items to shopping cart by book title
        shoppingCart.addItem(inventory.findBookByTitle("JAVA"));


        //Adding books by Author Name to shopping cart
        List<Book> addBooksByAuthor = inventory.findBooksByAuthor("XYZ");
        if(addBooksByAuthor!=null){
            for(Book book : addBooksByAuthor){
                shoppingCart.addItem(book);
            }
        }

        //Find books by author name and add into shopping cart
        for(Book book : inventory.findBooksByAuthor("Yashavant P Kanetkar")){
            shoppingCart.addItem(book);
        }


        //Remove books by Author Name
        List<Book> remove = inventory.findBooksByAuthor("XYZ");
        if(remove!=null){
            for(Book book : remove) {
                shoppingCart.removeItem(book);
            }
        }

        //find books by price range
        List<Book> booksInRange = inventory.findBooksByPriceRange(400,600);
        System.out.println("========Books in Given Price Range======");
        for(Book book : booksInRange){
            System.out.println(book);
        }

        inventory.displayInventory();
        //Total Price of Shopping cart
        System.out.println("Total Price : "+shoppingCart.calculateTotalPrice());
        shoppingCart.displayItems();

        //check custom exception is working or not
        try {
            shoppingCart.removeItem(new Book("CCC", "MMM", 900));
        }catch (BookNotFound e){
            System.err.println(e.getMessage());
        }
    }
}
