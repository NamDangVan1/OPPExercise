package booklist;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public abstract class Book implements IBook {

    private String bookID, publisher;
    private Date entryDate;
    private double unitPrice, quantity;
    
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Book() {}
    
    Book(String bookID, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookID = bookID;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public void addBook() {
        System.out.print("Book ID: ");
        bookID = sc.next();
        System.out.print("Publisher: ");
        sc.nextLine();
        publisher = sc.nextLine();
        System.out.print("Entry Date (dd/MM/yyyy): ");
        String date = sc.nextLine();
        try {
            entryDate = sdf.parse(date);
        } catch (ParseException e) {
            System.out.print("Error" + e.getMessage());
        }
        System.out.print("Unit Price: ");
        unitPrice = sc.nextDouble();
        System.out.print("Quantity: ");
        quantity = sc.nextDouble();
    }

    @Override
    public void updateBook(String ID) {
        System.out.println("Currently Updating: " + bookID);
        System.out.print("Publisher: ");
        publisher = sc.nextLine();
        System.out.print("Entry Date (dd/MM/yyyy): ");
        String date = sc.nextLine();
        try {
            entryDate = sdf.parse(date);
        } catch (ParseException e) {
            System.out.print("Error" + e.getMessage());
        }
        System.out.print("Unit Price: ");
        unitPrice = sc.nextDouble();
        System.out.print("Quantity: ");
        quantity = sc.nextDouble();
    }

    @Override
    public void displayBook() {
        System.out.println("1. Book ID: " + bookID);
        System.out.println("2. Publisher: " + publisher);
        System.out.println("3. Entry Date: " + sdf.format(entryDate));
        System.out.println("4. Unit Price: " + unitPrice);
        System.out.println("5. Quantity: " + quantity);
    }

    String getBookID() {
        return bookID;
    }
}
