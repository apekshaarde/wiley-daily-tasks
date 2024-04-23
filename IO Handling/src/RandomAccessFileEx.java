import java.io.*;
import java.util.Scanner;

public class RandomAccessFileEx {
    public static void main(String[] args) {

        try(
                Scanner sc = new Scanner(System.in);
                RandomAccessFile randomAccessFile = new RandomAccessFile("output.txt","rw")){

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
                        randomAccessFile.writeUTF(data);
                        System.out.println("data added successfully to the file........");
                        while (true) {
                            System.out.println("Want to add more? (y/n)");
                            char choice = sc.next().charAt(0);
                            if (choice != 'y' && choice != 'Y')
                                break;
                            sc.nextLine();
                            System.out.println("Enter data to add: ");
                            data = sc.nextLine();
                            randomAccessFile.writeUTF(data);
                            System.out.println("Data added successfully to the file.");
                        }
                        break;
                    case 2:
                            randomAccessFile.seek(0);
                            String res;
                            while ((res = randomAccessFile.readUTF()) != null) {
                                if(!res.equals(""))
                                    System.out.print(res);
                            }
                        break;
                    default:
                        System.out.println("invalid choice");
                }
        } while (true);

        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}

