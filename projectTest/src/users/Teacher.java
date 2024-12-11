package users;

import academic.Course;
import academic.Mark;
import academic.Journal;
import services.Complaint;
import enums.TeacherTitle;
import enums.UrgencyLevel;
import java.util.List;

public class Teacher extends Employee {
    private String teacherId;
    private TeacherTitle title;
    private List<Course> coursesTaught;
    private double rating;

    public Teacher(int id, String email, String password, String fullName, int employeeId, String teacherId, 
                   TeacherTitle title, List<Course> coursesTaught, double rating) {
        super(id, email, password, fullName, employeeId);
        this.teacherId = teacherId;
        this.title = title;
        this.coursesTaught = coursesTaught;
        this.rating = rating;
    }

    public void viewCourses() {
        for (Course course : coursesTaught) {
            System.out.println("- " + course.getName());
        }
    }

    public void gradeStudent(Student student, Mark mark, Course course) {
        Journal journal = student.getJournal();
        journal.addMark(course, mark);
    }

    public void sendComplaint(Dean dean, List<User> students, String content, UrgencyLevel urgency) {
        StringBuilder complaintContent = new StringBuilder(content);
        for (User student : students) {
            complaintContent.append("\n - ").append(student.getFullName());
        }
        Complaint complaint = new Complaint(this, dean, complaintContent.toString(), urgency);
        complaint.send();
    }

    public void viewStudents(Course course) {
        System.out.println("Students enrolled in " + course.getName() + ":");
        for (Student student : course.getStudents()) {
            System.out.println("- " + student.getFullName());
        }
    }

    @Override
    public void login() {
        System.out.println("Teacher " + fullName + " has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Teacher " + fullName + " has logged out.");
    }

    public String getTeacherId() {
        return teacherId;
    }

    public TeacherTitle getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }
}