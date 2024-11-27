package booklist;

import java.util.Date;

public class ReferenceBook extends Book {
    private double tax;
    
    ReferenceBook() {}
    
    ReferenceBook(String bookID, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookID, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    @Override
    public void addBook() {
        super.addBook();
        System.out.print("Tax: ");
        tax = sc.nextDouble();
    }

    @Override
    public void updateBook(String ID) {
        super.updateBook(ID);
        System.out.print("Tax: ");
        tax = sc.nextDouble();
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("6. Tax: " + tax);
    }
}
