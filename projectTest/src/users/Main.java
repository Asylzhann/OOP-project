package users;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Create a Student
        Student student = new Student(1, "john@example.com", "password123", "John Doe", 
                "S123", "Bachelor", "CS", 3, 3.9, 30, null, "OSIT", "Member", true);

        // Student becomes a researcher
        Researcher researcherStudent = student.becomeResearcher();
        researcherStudent.addPaper(new ResearchPaper("10.1234/abcd", "AI Revolution", "2023-12-08", 20, 100));

        // Create a Teacher
        Teacher teacher = new Teacher(2, "susan@example.com", "password456", "Susan Smith", 
                1002, "Computer Science", "T456", TeacherTitle.PROFESSOR, null, 4.5);

        // Teacher becomes a researcher
        Researcher researcherTeacher = teacher.becomeResearcher();
        researcherTeacher.addPaper(new ResearchPaper("10.4567/efgh", "Machine Learning", "2021-11-10", 12, 150));

        // Print papers
        System.out.println("\n--- Student's Papers ---");
        researcherStudent.printPapers(Comparator.comparing(ResearchPaper::getDate));

        System.out.println("\n--- Teacher's Papers ---");
        researcherTeacher.printPapers(Comparator.comparing(ResearchPaper::getDate));
    }
}
