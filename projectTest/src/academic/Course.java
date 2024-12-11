package academic;

import users.Student;
import enums.CourseType;
import enums.Faculty;
import java.util.Vector;
import java.util.Objects;

public class Course {
    private final String name;
    private int credits;
    private CourseType type;
    private Faculty faculty;
    private Vector<Lesson> lessons;
    private Vector<Student> students;

    public Course(String name, int credits, CourseType type, Faculty faculty) {
        this.name = name;
        this.credits = credits;
        this.type = type;
        this.faculty = faculty;
        this.lessons = new Vector<>();
        this.students = new Vector<>();
    }

    public Course(Course course, Vector<Lesson> lessons) {
        this.name = course.getName();
        this.credits = course.getCredits();
        this.type = course.getType();
        this.faculty = course.getFaculty();
        this.lessons = lessons;
        this.students = new Vector<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Vector<Student> getStudents() {
        return students;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Vector<Lesson> getLessons() {
        return lessons;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course other = (Course) o;
        return credits == other.credits &&
               faculty == other.faculty &&
               Objects.equals(lessons, other.lessons) &&
               Objects.equals(name, other.name) &&
               type == other.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(credits, faculty, lessons, name, type);
    }

    @Override
    public String toString() {
        return name + ": Credits: " + credits + ", Type: " + type + ", Faculty: " + faculty;
    }
}