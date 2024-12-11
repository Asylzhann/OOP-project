package services;

import academic.Course;
import users.Student;
import users.Teacher;
import java.util.List;
import java.util.ArrayList;

public class Database {
    private List<Course> courses;
    private List<Student> students;
    private List<Teacher> teachers;

    public Database() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added: " + course.getName());
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.getFullName());
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Teacher added: " + teacher.getFullName());
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Course getCourseByName(String courseName) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                return course;
            }
        }
        return null;
    }

    public Student getStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public Teacher getTeacherById(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    public void clearDatabase() {
        courses.clear();
        students.clear();
        teachers.clear();
        System.out.println("Database has been cleared.");
    }
}