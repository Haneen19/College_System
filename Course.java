public class Course {
    private int courseID;
    private String courseName;
    private Lecturer courseLecturer;
    private int numberOfRegisteredStudents;


    public Course(int newCourseID, String newCourseName){
        courseID = newCourseID;
        courseName = newCourseName;
        courseLecturer = new Lecturer();
        numberOfRegisteredStudents = 0;
    }


    public int getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecturer getCourseLecturer() {
        return courseLecturer;
    }

    public int getNumberOfRegisteredStudents() {
        return numberOfRegisteredStudents;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseLecturer(Lecturer courseLecturer) {
        this.courseLecturer = courseLecturer;
    }

    public void setNumberOfRegisteredStudents(int numberOfRegisteredStudents) {
        this.numberOfRegisteredStudents = numberOfRegisteredStudents;
    }

    @Override
    public String toString() {
        return "courseID=" + courseID +
                ", courseName='" + courseName +
                ", courseLecturer=" + courseLecturer.getLecturerName() +
                ", numberOfRegisteredStudents=" + numberOfRegisteredStudents+"\n";
    }
}
