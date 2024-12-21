package users;

import academic.Course;
import enums.ManagerType;
import services.Database;
import java.util.List;

public class Manager extends Employee {
    private ManagerType type;

    public Manager(int id, String email, String password, String fullName, int employeeId, ManagerType type) {
        super(id, email, password, fullName, employeeId);
        this.type = type;
    }

    public void approveRegistration(Student student, Course course) {
        student.registerForCourse(course);
        System.out.println("Manager approved registration of " + student.getFullName() + " to " + course.getName());
    }

    public void addCourse(Course course, Database database) {
        database.getCourses().add(course);
        System.out.println("Manager added course: " + course.getName() + " to the database.");
    }

    public void assignTeacherToCourse(Teacher teacher, Course course) {
        course.getLessons().forEach(lesson -> lesson.setCourse(course));
        System.out.println("Manager assigned " + teacher.getFullName() + " to course: " + course.getName());
    }

    public void generateStatistics(List<Student> students) {
        double averageGPA = students.stream().mapToDouble(student -> student.getTranscript().getTotalGPA()).average().orElse(0.0);
        System.out.println("The average GPA of all students is: " + averageGPA);
    }

    public void viewInfo(List<Student> students) {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println("- " + student.getFullName() + " (GPA: " + student.getTranscript().getTotalGPA() + ")");
        }
    }

    public void manageNews(String newsContent) {
        System.out.println("Manager added news: " + newsContent);
    }

    public ManagerType getType() {
        return type;
    }

    @Override
    public void login() {
        System.out.println("Manager " + fullName + " has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Manager " + fullName + " has logged out.");
    }
}