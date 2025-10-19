package InheritancePractice;

public class Student extends Person {
    private String school;
    private String studentID;
    private int yearStarted;

    public void setSchool(String school) {
        this.school = school;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    @Override
    public void displayDetails() {
        System.out.print("Student from "+school+" with ID "+studentID+" is ");
        super.displayDetails();
        System.out.print(" who started on "+yearStarted+".");
    }

}
