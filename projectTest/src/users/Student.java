package users;

import academic.Course;
import academic.Journal;
import academic.Transcript;
import enums.StudentDegree;
import java.util.Vector;

public class Student extends User {
    private String studentID;
    private StudentDegree degree;
    private String faculty;
    private int year;
    private double gpa;
    private int credits;
    private Transcript transcript;
    private Journal journal;
    private Vector<Course> courses;

    public Student(int id, String email, String password, String fullName, String studentID, StudentDegree degree, 
                   String faculty, int year, double gpa, int credits, Transcript transcript) {
        super(id, email, password, fullName);
        this.studentID = studentID;
        this.degree = degree;
        this.faculty = faculty;
        this.year = year;
        this.gpa = gpa;
        this.credits = credits;
        this.transcript = transcript;
        this.journal = new Journal();
        this.courses = new Vector<>();
    }

    public void registerForCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(fullName + " registered for the course: " + course.getName());
    }

    public void viewTranscript() {
        System.out.println("Transcript for " + fullName + ":");
        System.out.println(transcript);
    }

    public void rateTeacher(Teacher teacher, int rating) {
        System.out.println(fullName + " rated " + teacher.getFullName() + " with a rating of " + rating);
    }

    public Journal getJournal() {
        return journal;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public String getStudentID() {
        return studentID;
    }

    public StudentDegree getDegree() {
        return degree;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void login() {
        System.out.println("Student " + fullName + " has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Student " + fullName + " has logged out.");
    }
}