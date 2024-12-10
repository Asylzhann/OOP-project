package academic;
import java.io.Serializable;
import java.util.GregorianCalendar;
import users.Teacher;


public class Mark implements Serializable {
	
	private Teacher teacher;
	private double mark;
	private String description;
	private GregorianCalendar date;
	String month[] = { "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
	
	public Mark(Teacher teacher, double mark, GregorianCalendar date, String description) {
		this.setTeacher(teacher);
		this.setMark(mark);
		this.setDate(date);
		this.setDescription(description);
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	
	@Override
	public String toString() {
	    return "Mark [teacher=" + teacher + ", mark=" + mark + ", description=" + description +
	           ", date=" + (date.get(GregorianCalendar.DAY_OF_MONTH) + " " +
	           month[date.get(GregorianCalendar.MONTH)] + " " + date.get(GregorianCalendar.YEAR)) + "]";
	}

	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public double getGPA() {
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
	

}
