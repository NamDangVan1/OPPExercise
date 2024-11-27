package booklist;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Add Book.");
            System.out.println("2. Update Book By ID.");
            System.out.println("3. Delete Book By ID.");
            System.out.println("4. Find Book By ID.");
            System.out.println("5. Display All Book.");
            System.out.println("6. Exit.");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    bookList.addBook();
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    sc.nextLine();
                    String IDToUpdate = sc.nextLine();
                    bookList.updateBook(IDToUpdate);
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    sc.nextLine();
                    String IDToDelete = sc.nextLine();
                    bookList.deleteBookByID(IDToDelete);
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    sc.nextLine();
                    String IDToFind = sc.nextLine();
                    if(bookList.findBookByID(IDToFind) == null) {
                        System.out.println("Invalid ID");
                    }else{
                        bookList.findBookByID(IDToFind).displayBook();
                    }
                    break;
                case 5:
                    bookList.displayAllBook();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while(choice !=6);
    }
}
