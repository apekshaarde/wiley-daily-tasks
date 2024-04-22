import com.model.Account;

public class AccountManagementApp {

    public static void main(String[] args) {

        // Create few accounts

        // Display the no. of accounts created

        // Do the basic operations(deposit/withdraw)

        Account account1 =new Account(213454335644L, "John",500);

        Account account2 = new Account(214577228765L, "Peter", 1000);

        Account account3 = new Account(214577228765L, "Peter", 1000);
        Account account4 = new Account();



        System.out.println("created Accounts count :  "+Account.getNumberOfAccounts());

        System.out.println("Account 1 Info : ");
        account1.showAccountInfo();
        account1.deposit(5000);
        account1.showAccountInfo();
        account1.withdraw(500);
        account1.showAccountInfo();

        System.out.println("Account 2 Info : ");
        account2.showAccountInfo();
        account2.deposit(100);
        account2.showAccountInfo();
        account2.withdraw(600);
        account2.showAccountInfo();
    }

}