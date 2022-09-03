import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Press 1 to add a course.");
        System.out.println("Press 2 to add a student.");
        System.out.println("Press 3 to add a lecturer.");
        System.out.println("Press 4 to register a course for a student.");
        System.out.println("Press 5 to register a course for a lecturer.");
        System.out.println("Press 6 to display collage information.");
        System.out.println("Press 7 to display all courses.");
        System.out.println("Press 8 to display all students.");
        System.out.println("Press 9 to display all lecturers.");
        System.out.println("Press 10 to display courses currently taken by a particular student.");
        System.out.println("Press 11 to display courses currently taken by a particular lecturer.");
        System.out.println("Press 12 to remove student.");
        System.out.println("Press 13 to remove lecturer.");
        System.out.println("Press 14 to remove course.");
        System.out.println("Press 15 to quit.");




        Collage collage = Collage.getInstance(1,"CCIT");


        Scanner input = new Scanner(System.in);

        while(true) {
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Please enter course ID...");
                int courseID = input.nextInt();
                System.out.println("Please enter course name...");
                String courseName = input.next();
                Course course = new Course(courseID, courseName);
                collage.addCourse(course);

            } else if (choice == 2) {
                System.out.println("Please enter student ID...");
                int studentID = input.nextInt();
                System.out.println("Please enter student name...");
                String studentName = input.next();
                Student student = new Student(studentID, studentName);
                collage.addStudent(student);

            } else if (choice == 3) {
                System.out.println("Please enter lecturer ID...");
                int lecturerID = input.nextInt();
                System.out.println("Please enter lecturer name...");
                String lecturerName = input.next();
                Lecturer lecturer = new Lecturer(lecturerID, lecturerName);
                collage.addLecturer(lecturer);

            } else if (choice == 4) {
                System.out.println("Please enter course ID...");
                int courseID = input.nextInt();
                System.out.println("Please enter student ID...");
                int studentID = input.nextInt();

                ArrayList<Student>students = collage.getStudents();
                ArrayList<Course>courses = collage.getCourses();
                Course course = null;
                for(int i = 0; i < courses.size(); i++) {
                    if(courses.get(i).getCourseID() == courseID){
                        course = courses.get(i);
                        break;
                    }
                }
                for(int i = 0; i < students.size(); i++) {
                    if(students.get(i).getStudentID() == studentID){
                        students.get(i).getStudentCourses().add(course);
                        course.setNumberOfRegisteredStudents(course.getNumberOfRegisteredStudents()+1);
                        break;
                    }
                }
            } else if (choice == 5) {
                System.out.println("Please enter course ID...");
                int courseID = input.nextInt();
                System.out.println("Please enter lecturer ID...");
                int lecturerID = input.nextInt();

                ArrayList<Lecturer>lecturers = collage.getLecturers();
                ArrayList<Course>courses = collage.getCourses();
                Lecturer lecturer = null;
                for(int i = 0; i < lecturers.size(); i++) {
                    if(lecturers.get(i).getLecturerID() == lecturerID){
                        lecturer = lecturers.get(i);
                        break;
                    }
                }
                for(int i = 0; i < courses.size(); i++) {
                    if(courses.get(i).getCourseID() == courseID){
                        courses.get(i).setCourseLecturer(lecturer);
                        lecturer.getLecturerCourses().add(courses.get(i));
                        break;
                    }
                }

            } else if (choice == 6) {
                System.out.println(collage.toString());

            } else if (choice == 7) {
                ArrayList<Course>courses = collage.getCourses();
                for(int i = 0; i < courses.size(); i++) {
                    System.out.print(courses.get(i).toString());
                }

            } else if (choice == 8) {
                ArrayList<Student>students = collage.getStudents();
                for(int i = 0; i < students.size(); i++) {
                    System.out.print(students.get(i).toString());
                }

            } else if (choice == 9) {
                ArrayList<Lecturer>lecturers = collage.getLecturers();
                for(int i = 0; i < lecturers.size(); i++) {
                    System.out.print(lecturers.get(i).toString());
                }

            } else if (choice == 10) {
                System.out.println("Please enter student ID");
                int studentID = input.nextInt();

                ArrayList<Student>students = collage.getStudents();
                for(int i = 0; i < students.size(); i++) {
                    if(students.get(i).getStudentID() == studentID){
                        ArrayList<Course>studentCourses = students.get(i).getStudentCourses();
                        for(int j = 0; j < studentCourses.size(); j++) {
                            System.out.println(studentCourses.get(j).toString());
                        }
                        break;
                    }
                }

            } else if (choice == 11) {
                System.out.println("Please enter lecturer ID");
                int lecturerID = input.nextInt();
                ArrayList<Course>courses = collage.getCourses();
                for(int i = 0; i < courses.size(); i++) {
                    if (courses.get(i).getCourseLecturer().getLecturerID() == lecturerID){
                        System.out.println(courses.get(i).toString());
                    }
                }

            } else if (choice == 12) {
                System.out.println("Please enter student ID");
                int removeByStudentID = input.nextInt();
                ArrayList<Student>students = collage.getStudents();
                int i = 0;
                for(i = 0; i < students.size(); i++) {
                    if (students.get(i).getStudentID() == removeByStudentID){
                        Student std = students.get(i);
                        for(int j = 0; j < std.getStudentCourses().size(); j++) {
                            Course cr = std.getStudentCourses().get(j);
                            cr.setNumberOfRegisteredStudents(cr.getNumberOfRegisteredStudents()-1);
                        }
                        break;
                    }
                }
                students.remove(i);

            } else if (choice == 13) {
                System.out.println("Please enter lecturer ID");
                int removeByLecturerID = input.nextInt();
                ArrayList<Lecturer>lecturers = collage.getLecturers();
                int i = 0;
                for(i = 0; i < lecturers.size(); i++) {
                    if (lecturers.get(i).getLecturerID() == removeByLecturerID){
                        Lecturer lec = lecturers.get(i);
                        for(int j = 0; j < lec.getLecturerCourses().size(); j++) {
                            lec.getLecturerCourses().get(j).setCourseLecturer(new Lecturer());
                        }
                        break;
                    }
                }
                lecturers.remove(i);

            } else if (choice == 14) {
                System.out.println("Please enter course ID");
                int removeByCourseID = input.nextInt();
                ArrayList<Course>courses = collage.getCourses();
                int i = 0;
                for(i = 0; i < courses.size(); i++) {
                    if (courses.get(i).getCourseID() == removeByCourseID){
                        break;
                    }
                }
                Course removeCr = courses.get(i); // course to be removed
                courses.remove(i);

                // Remove the course from the lecturers that taught that course
                ArrayList<Lecturer>lecturers = collage.getLecturers();
                for(i = 0; i < lecturers.size(); i++) {
                    ArrayList<Course>lecturerCourses = lecturers.get(i).getLecturerCourses();
                    int j = 0;
                    for (j=0; j<lecturerCourses.size();j++){
                        if(lecturerCourses.get(j).getCourseID() == removeCr.getCourseID()){
                            break;
                        }
                    }
                    lecturerCourses.remove(j);
                }

                // Remove the course from the students that registered that course.
                ArrayList<Student>students = collage.getStudents();
                for(i = 0; i < students.size(); i++) {
                    ArrayList<Course>studentCourses = students.get(i).getStudentCourses();
                    int j = 0;
                    for (j=0; j<studentCourses.size();j++){
                        if(studentCourses.get(j).getCourseID() == removeCr.getCourseID()){
                            break;
                        }
                    }
                    studentCourses.remove(j);
                }




            } else if (choice == 15) {
                break;
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}
