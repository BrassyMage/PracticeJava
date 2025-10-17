package Library;

public class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber){
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public void checkout(){
        System.out.println("Checking out "+getTitle());
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Issue Number: "+issueNumber);
    }

}
