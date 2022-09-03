import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<Course> studentCourses;

    public Student(int newStudentID, String newStudentName) {
        studentID = newStudentID;
        studentName = newStudentName;
        studentCourses = new ArrayList<Course>();
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Course> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(ArrayList<Course> studentCourses) {
        this.studentCourses = studentCourses;
    }

    @Override
    public String toString() {
        return "studentID=" + studentID +
                ", studentName='" + studentName +
                ", numberOfTakenCourses=" + studentCourses.size()+"\n";
    }
}
