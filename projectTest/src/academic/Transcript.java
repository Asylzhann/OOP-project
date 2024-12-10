package academic;
import java.io.Serializable;
import java.util.Vector;

public class Transcript implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4532577231756803048L;

	private double totalGPA;
	private int totalCredits;
	private Vector<Semester> semester;
	
	{
		semester = new Vector<>();
		totalGPA = 0;
		totalCredits = 0;
	}
	
	public Vector<Semester> getSemesters() {
		return semester;
	}
	
	public void setSemesters(Vector<Semester> semesters) {
		this.semester = semesters;
	}
	
	public double getTotalGPA() {
	    return semester.stream()
	           .mapToDouble(s -> s.getCredits() * s.getGPA())
	           .sum() / getTotalCredits();
	}

	public int getTotalCredits() {
	    return semester.stream()
	           .mapToInt(Semester::getCredits)
	           .sum();
	    
	
	}

	

}
