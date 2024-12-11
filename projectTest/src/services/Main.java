package services;

import academic.*;
import users.*;
import services.*;
import enums.*;

import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("Object-Oriented Programming", 4, CourseType.MAJOR, Faculty.SITE);
        Course course2 = new Course("Data Structures", 3, CourseType.MAJOR, Faculty.SITE);

        // Create students
        Student student1 = new Student(1, "student1@example.com", "password", "Alice", "S001", StudentDegree.BACHELOR, "SITE", 2, 3.7, 18, new Transcript());
        Student student2 = new Student(2, "student2@example.com", "password", "Bob", "S002", StudentDegree.BACHELOR, "SITE", 2, 3.9, 20, new Transcript());

        // Register students for courses
        student1.registerForCourse(course1);
        student2.registerForCourse(course1);
        student1.registerForCourse(course2);
        student2.registerForCourse(course2);

        // Create teachers
        Teacher teacher1 = new Teacher(3, "teacher1@example.com", "password", "Prof. Smith", 1001, "T001", TeacherTitle.PROFESSOR, new ArrayList<>(), 4.8);
        Teacher teacher2 = new Teacher(4, "teacher2@example.com", "password", "Dr. Johnson", 1002, "T002", TeacherTitle.LECTOR, new ArrayList<>(), 4.5);

        // Assign teachers to courses
        teacher1.viewCourses();
        teacher2.viewCourses();

        // Create a Manager
        Manager manager = new Manager(5, "manager@example.com", "password", "Manager Bob", 1003, ManagerType.DEPARTMENT);

        // Teacher views students for a course
        teacher1.viewStudents(course1);

        // Teachers grade students
        Mark mark1 = new Mark(teacher1, 95, new GregorianCalendar(2024, 2, 15), "Excellent work!");
        teacher1.gradeStudent(student1, mark1, course1);

        // View student marks after grading
        student1.getJournal().viewMarks();

        // Manager approves a registration
        manager.approveRegistration(student2, course1);

        // Create and send complaints
        Dean dean = new Dean(6, "dean@example.com", "password", "Dean Wilson", 1004);
        Complaint complaint = new Complaint(student1, teacher1, "Student's behavior", UrgencyLevel.HIGH);
        complaint.send();
        dean.receiveComplaint(complaint);
        System.out.println(complaint.view());

        // Manager generates statistics
        manager.generateStatistics(List.of(student1, student2));

        // View student's transcript
        System.out.println("Transcript for " + student1.getFullName() + ":");
        System.out.println(student1.getTranscript());

        // Students rate teachers
        student1.rateTeacher(teacher1, 5);
        student2.rateTeacher(teacher1, 4);
        System.out.println("Prof. Smith's rating: "+teacher1.getRating());

        // Employees sending message
        teacher1.sendMessage(teacher2, "Good morning, sir!");
        teacher1.sendMessage(teacher2, "Good evening, sir!");
        teacher2.viewReceivedMessages();
    }
}
