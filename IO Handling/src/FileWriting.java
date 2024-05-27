import java.io.*;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {

        try(
                Scanner sc = new Scanner(System.in);
                Writer writer = new FileWriter("output.txt",true);
                ){

            do {
                System.out.println("1.Enter text to written : \n Want to add more?(y/n)");
                System.out.println("2.Read contents of file : ");
                System.out.println("Enter your choice : ");
                int ch = sc.nextInt();

                switch (ch){
                    case 1:
                        sc.nextLine();
                        System.out.println("Enter data to add: ");
                        String data = sc.nextLine();
                        writer.write(data +"\n");
                        System.out.println("data added successfully to the file........");
                        while (true) {
                            System.out.println("Want to add more? (y/n)");
                            char choice = sc.next().charAt(0);
                            if (choice != 'y' && choice != 'Y')
                                break;
                            sc.nextLine();
                            System.out.println("Enter data to add: ");
                            data = sc.nextLine();
                            writer.write(data+"\n");
                            System.out.println("Data added successfully to the file.");
                        }
                        writer.close();
                        break;
                    case 2:
                        try(
                        Reader reader = new FileReader("output.txt");
                        ) {
                            int res;
                            while ((res = reader.read()) != -1) {
                                System.out.print((char) res);
                            }
                        }catch (IOException ex){
                            System.err.println(ex.getMessage());
                        }
                        break;
                    default:
                        System.out.println("invalid choice");
                }

            }while (true);

        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
