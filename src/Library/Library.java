package Library;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items = new ArrayList<LibraryItem>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void showAllItems(){
        System.out.println("---All Items---");
        for(LibraryItem item : items){
            item.displayInfo();
            System.out.println();
        }
    }

    public void checkoutAllItems(){
        System.out.println("--- Checked Out Items ---");
        for(LibraryItem item : items){
            item.checkout();
            System.out.println();
        }
    }
}
