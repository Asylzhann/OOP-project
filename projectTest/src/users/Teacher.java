package users;

import enums.TeacherTitle;
import enums.UrgencyLevel;

import java.util.List;

public class Teacher extends Employee {
    private String teacherId;
    private TeacherTitle title;
    private String department;
    private List<String> coursesTaught;
    private double rating;

    public Teacher(int id, String email, String password, String fullName, int employeeId, String teacherId,
                   TeacherTitle title, String department, List<String> coursesTaught, double rating) {
        super(id, email, password, fullName, employeeId, department);
        this.teacherId = teacherId;
        this.title = title;
        this.department = department;
        this.coursesTaught = coursesTaught;
        this.rating = rating;
    }

    public void sendComplaint(Dean dean, List<User> students, String content, UrgencyLevel urgency) {
        StringBuilder complaintContent = new StringBuilder(content);
        complaintContent.append("\nInvolved Students:");
        for (User student : students) {
            complaintContent.append("\n - ").append(student.getFullName());
        }

        Complaint complaint = new Complaint(this, dean, complaintContent.toString(), urgency);
        complaint.send();
        System.out.println("Complaint has been processed: \n" + complaint.view());
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent by " + getFullName() + ": " + message);
    }

    @Override
    public void login() {
        System.out.println("Teacher " + getFullName() + " has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Teacher " + getFullName() + " has logged out.");
    }

}
