package Library;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int year;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    abstract void checkout();

    void displayInfo(){
        System.out.println("---Book Information---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor(){
       return author;
    }

    public int getYear() {
        return year;
    }
}
