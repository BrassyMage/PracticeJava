package Library;

public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    @Override
    public void checkout(){
        System.out.println("Checking out "+getTitle());
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Genre: "+genre);
    }
}
