package Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Harry Potter", "JK Rowling", 2001,"Fiction");
        Magazine mag = new Magazine("Mag", "MAg mag", 2023,21345);

        library.addItem(book);
        library.addItem(mag);
        library.checkoutAllItems();
        library.showAllItems();
    }
}
