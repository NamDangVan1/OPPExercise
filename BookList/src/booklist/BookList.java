package booklist;

import java.util.*;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    BookList() {
    }

    void addBook() {
        int num;
        do {
            System.out.print("How many books do you want to add? ");
            num = sc.nextInt();
        } while (!(num instanceof Integer));

        for (int i = 0; i < num; i++) {
            System.out.print("What kind of book do you want to add? (1) Text Book \t (2) Reference Book : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    TextBook tb = new TextBook();
                    tb.addBook();
                    bookList.add(tb);
                    break;
                case 2:
                    ReferenceBook rb = new ReferenceBook();
                    rb.addBook();
                    bookList.add(rb);
                    break;
                default:
                    System.out.println("Invalid choice");
                    i--;
                    break;
            }
        }
    }

    void updateBook(String ID) {
        boolean check = false;
        for (Book book : bookList) {
            if (book.getBookID().equals(ID)) {
                book.updateBook(ID);
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Invalid ID");
        }
    }

    void deleteBookByID(String ID) {
        boolean check = false;
        for (Book book : bookList) {
            if (book.getBookID().equals(ID)) {
                bookList.remove(book);
                check = true;
                System.out.println("A Book was deleted!");
                break;
            }
        }
        if (check == false) {
            System.out.println("Invalid ID");
        }
    }

    Book findBookByID(String ID) {
        for (Book book : bookList) {
            if (book.getBookID().equals(ID)) {
                return book;
            }
        }
        return null;
    }

    void displayAllBook() {
        int i = 0;
        System.out.println("Display All Book");
        for (Book book : bookList) {
            System.out.println("Book " + (++i) + ":");
            book.displayBook();
        }
    }
}
