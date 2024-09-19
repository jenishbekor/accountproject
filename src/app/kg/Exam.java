package app.kg;

public class Exam {

    protected String course;

    private int grade;

    //Constructor
    public Exam(String course, int grade){
        this.course = course;
        this.grade = grade;
    }


    // Setter Method
    public void setGrade(int grade){
        if(grade>=0 && grade<=100)
            this.grade = grade;
    }

    //Getter MEthod
    public int getGrade(){
        return this.grade;
    }

    public String toString(){

        return "Course: " + this.course + ", Grade: "+ this.grade;

    }

}
