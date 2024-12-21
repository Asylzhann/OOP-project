package academic;

import java.util.HashMap;
import java.util.Vector;

public class Journal {
    private HashMap<Course, Vector<Mark>> marks;

    public Journal() {
        marks = new HashMap<>();
    }

    public HashMap<Course, Vector<Mark>> getMarks() {
        return marks;
    }

    public void setJournal(HashMap<Course, Vector<Mark>> marks) {
        this.marks = marks;
    }

    public double getTotal(Course course) {
        double total = 0;
        if (marks.containsKey(course)) {
            for (Mark mark : marks.get(course)) {
                total += mark.getMark();
            }
        }
        return total;
    }

    public void addMark(Course course, Mark mark) {
        marks.computeIfAbsent(course, k -> new Vector<>()).add(mark);
    }

    public void clear() {
        marks.clear();
    }

    public void viewMarks() {
        for (Course course : marks.keySet()) {
            System.out.println("Course: " + course.getName());
            for (Mark mark : marks.get(course)) {
                System.out.println(mark);
            }
        }
    }
}