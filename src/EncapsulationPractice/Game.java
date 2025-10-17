package EncapsulationPractice;

public class Game {
    private String name;
    private int yearPublished;
    private String publisher;

    public String getName(){
        return name;
    }

    public int getYearPublished(){
        return yearPublished;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

}
