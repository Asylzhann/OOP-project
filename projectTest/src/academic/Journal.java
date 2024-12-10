package academic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Vector;
import users.Course;


public class Journal implements Serializable {
    private static final long serialVersionUID = 1L;

    private HashMap<Course, Vector<Mark>> marks = new HashMap<>();

    public Journal() {}

    public HashMap<Course, Vector<Mark>> getMarks() {
        return marks;
    }

    public void setJournal(HashMap<Course, Vector<Mark>> marks) {
        this.marks = marks;
    }

    public double getTotal(Course course) {
        double total = 0;
        for (Course c : marks.keySet()) {
            if (!c.getName().equals(course.getName())) continue;
            for (Mark m : marks.get(c)) {
                total += m.getMark();
            }
        }
        System.out.println(total);
        return total;
    }

    public double getGPA(Course course) {
        double totalMarks = getTotal(course);
        return convertToGPA(totalMarks);
    }

    private double convertToGPA(double mark) {
        if (mark > 95) return 4.00;
        if (mark > 90) return 3.67;
        if (mark > 85) return 3.33;
        if (mark > 80) return 3.0;
        if (mark > 75) return 2.67;
        if (mark > 70) return 2.33;
        if (mark > 65) return 2.0;
        if (mark > 60) return 1.67;
        if (mark > 55) return 1.33;
        if (mark > 50) return 1.00;
        return 0;
    }

    public void clear() {
        marks = new HashMap<>();
    }
}

