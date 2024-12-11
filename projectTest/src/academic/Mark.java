package academic;

import java.util.GregorianCalendar;
import users.Teacher;
import java.util.Calendar;

public class Mark {
    private Teacher teacher;
    private double mark;
    private String description;
    private GregorianCalendar date;
    String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public Mark() {}

    public Mark(Teacher t, double mark, GregorianCalendar date, String description) {
        this.teacher = t;
        this.mark = mark;
        this.date = date;
        this.description = description;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Mark: " + mark + ", Description: " + description + ", Date: " + month[date.get(Calendar.MONTH)] + " " + date.get(Calendar.DATE) + ", " + date.get(Calendar.YEAR) + ", by " + teacher.getFullName();
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}