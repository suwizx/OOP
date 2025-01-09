package six;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author suwizx
 */
public class Library {

    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;

    public void addBook(Book book, int slot) {
        if (slot == 1) {
            book1 = book;
        }
        if (slot == 2) {
            book2 = book;
        }
        if (slot == 3) {
            book3 = book;
        }
    }

    public void removeBook(int slot) {
        if (slot == 1) {
            book1 = null;
        }
        if (slot == 2) {
            book2 = null;
        }
        if (slot == 3) {
            book3 = null;
        }
    }

    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName + "\n");
        if (book1 != null) {
            printBookDetails(book1);
        } else {
            System.out.println("No book in this slot.");
        }
        System.out.println("");
        if (book2 != null) {
            printBookDetails(book2);
        } else {
            System.out.println("No book in this slot.");
        }
        System.out.println("");
        if (book3 != null) {
            printBookDetails(book3);
        } else {
            System.out.println("No book in this slot.");
        }

    }

    public void checkBookAvailability(int slot) {
        if (slot == 1) {
            if (book1 != null) {
                System.out.println(book1.title + " is available.");
            } else {
                System.out.println("Book in slot " + slot + " is not available.");
            }
        }
        if (slot == 2) {
            if (book2 != null) {
                System.out.println(book2.title + " is available.");
            } else {
                System.out.println("Book in slot " + slot + " is not available.");
            }
        }
        if (slot == 3) {
            if (book3 != null) {
                System.out.println(book3.title + " is available.");
            } else {
                System.out.println("Book in slot " + slot + " is not available.");
            }
        }

    }

    public void updateBookPrice(int slot, double newPrice) {
        if (slot == 1) {
            if (book1 == null) {
                System.out.println("No book in this slot.");
            } else {
                book1.price = newPrice;
                System.out.println("Updated price of " + book1.title + " to $" + newPrice + ".");
            }

        }
        if (slot == 2) {
            if (book2 == null) {
                System.out.println("No book in this slot.");
            } else {
                book2.price = newPrice;
                System.out.println("Updated price of " + book2.title + " to $" + newPrice + ".");
            }
        }
        if (slot == 3) {
            if (book3 == null) {
                System.out.println("No book in this slot.");
            } else {
                book3.price = newPrice;
                System.out.println("Updated price of " + book3.title + " to $" + newPrice + ".");
            }
        }
    }

    public void printBookDetails(Book book) {
        book.printDetails();
    }
}
