package InheritancePractice;

public class Person {
    private String first_name;
    private String last_name;

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void displayDetails() {
        System.out.print(first_name + " "+ last_name);
    }
}
