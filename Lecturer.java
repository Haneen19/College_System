import java.util.ArrayList;

public class Lecturer {
    private int lecturerID;
    private String lecturerName;
    private ArrayList<Course> lecturerCourses;


    public Lecturer(){

    }

    public Lecturer(int newLecturerID, String newLecturerName) {
        lecturerID = newLecturerID;
        lecturerName = newLecturerName;
        lecturerCourses = new ArrayList<Course>();
    }


    public int getLecturerID() {
        return lecturerID;
    }

    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public ArrayList<Course> getLecturerCourses() {
        return lecturerCourses;
    }

    public void setLecturerCourses(ArrayList<Course> lecturerCourses) {
        this.lecturerCourses = lecturerCourses;
    }

    @Override
    public String toString() {
        return "lecturerID=" + lecturerID +
                ", lecturerName='" + lecturerName +
                ", lecturerCourses=" + lecturerCourses.size()+"\n";
    }
}




