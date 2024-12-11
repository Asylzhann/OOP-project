package academic;

import java.util.Vector;

public class Transcript {
    private Vector<Semester> semesters;

    public Transcript() {
        semesters = new Vector<>();
    }

    public void addSemester(Semester semester) {
        semesters.add(semester);
    }

    public double getTotalGPA() {
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (Semester semester : semesters) {
            totalCredits += semester.getCredits();
            totalGradePoints += semester.getGPA() * semester.getCredits();
        }

        if (totalCredits == 0) {
            return 0;
        }

        return totalGradePoints / totalCredits;
    }

    @Override
    public String toString() {
        StringBuilder transcriptDetails = new StringBuilder();
        transcriptDetails.append("Total GPA: ").append(getTotalGPA()).append("\n");
        for (Semester semester : semesters) {
            transcriptDetails.append("Semester " + semester.getSemesterNum() + ": GPA: " + semester.getGPA() + "\n");
        }
        return transcriptDetails.toString();
    }
}