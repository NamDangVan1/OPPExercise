package booklist;

import java.util.Date;

public class TextBook extends Book {
    private String status;

    TextBook() {}
    
    TextBook(String bookID, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookID, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }
    
    @Override
    public void addBook() {
        super.addBook();
        System.out.print("Status: ");
        sc.nextLine();
        status = sc.nextLine();
    }

    @Override
    public void updateBook(String ID) {
        super.updateBook(ID);
        System.out.print("Status: ");
        sc.nextLine();
        status = sc.nextLine();
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("6. Status: " + status);
    }
}
