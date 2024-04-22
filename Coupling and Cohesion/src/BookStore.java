import com.invension.app.model.Book;
import com.invension.app.service.Inventory;
import com.invension.app.service.InventoryImpl;
import com.invension.app.service.ShoppingCart;
import com.invension.app.service.ShoppingCartImpl;

public class BookStore {
    public static void main(String[] args) {
        Inventory inventory = new InventoryImpl();
        ShoppingCart shoppingCart = new ShoppingCartImpl();

        inventory.addBook(new Book("JAVA","James Gosling",400));
        inventory.addBook(new Book("Let Us C","Yashavant P Kanetkar",300));
        inventory.addBook(new Book("Understanding Pointers in C.","Yashavant P Kanetkar",500));
        inventory.addBook(new Book("Unix Shell Programming.","Yashavant P Kanetkar",550));
        inventory.addBook(new Book("ABC","XYZ",700));

        shoppingCart.addItem(inventory.findBookByTitle("JAVA"));

        for(Book book : inventory.findBooksByAuthor("Yashavant P Kanetkar")){
            shoppingCart.addItem(book);
        }


        shoppingCart.removeItem(new Book("ABC","XYZ",700));

        inventory.displayInventory();
        System.out.println("Total Price : "+shoppingCart.calculateTotalPrice());
        shoppingCart.displayItems();
    }
}
