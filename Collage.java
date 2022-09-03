import java.util.ArrayList;
import java.util.List;

public class Collage {
    private static Collage college = null;

    private int collageID;
    private String collageName;
    private ArrayList<Course>courses;
    private ArrayList<Student>students;
    private ArrayList<Lecturer>lecturers;



    private Collage(int newCollageID, String newCollageName) {
        collageID = newCollageID;
        collageName = newCollageName;
        courses = new ArrayList<Course>();
        students = new ArrayList<Student>();
        lecturers = new ArrayList<Lecturer>();
    }

    public static Collage getInstance(int newCollageID, String newCollageName) {
        if(college == null) {
            college = new Collage(newCollageID, newCollageName);
        }
        return college;
    }

    public void addCourse(Course course){
        courses.add(course);

    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addLecturer(Lecturer lecturer){
        lecturers.add(lecturer);
    }


    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }

    @Override
    public String toString() {
        return "collageID=" + collageID +
                ", collageName='" + collageName  +
                ", courses=" + courses.size() +
                ", students=" + students.size() +
                ", lecturers=" + lecturers.size()+"\n";
    }
}

