package academic;
import java.io.Serializable;
import java.util.HashMap;

import users.Course;
public class Semester implements Serializable {
	private static final long serialVersionUID = 1;
	private HashMap <Course, Attestation> attestation;
	
	private int semesterNum;
	private int credits;
	private double GPA;
	
	{
		attestation = new HashMap<>();
		credits=0;
		GPA=0;
	}
	
	private Semester(int semesterNum) {
		this.semesterNum=semesterNum;
	}
	
	public HashMap<Course, Attestation> getAttestation() {
		return attestation;
	}
	
	public void setAttestations(HashMap<Course, Attestation> attestation) {
		this.attestation=attestation;
	}
	
	public int getSemesterNum() {
		return semesterNum;
	}
	
	public void addCredits(int credit) {
	    this.credits+=credit;
	  }
	  
	  public void setSemesterNum(int number) {
	    this.semesterNum = number;
	  }
	  
	  public int getCredits() {
	    return credits;
	  }
	  
	  public void setCredits(int credtis) {
	    this.credits = credtis;
	  }
	  
	  public double getGPA() {
		    if (attestation.isEmpty()) return 0.0;
		    double weightedGPA = attestation.values().stream()
		        .mapToDouble(att -> att.getGPA() * att.getCourse().getCredits())
		        .sum();
		    return weightedGPA / getCredits();
		}
	  
	   public int getTotalCredits() {
	        return attestation.keySet().stream()
	                          .mapToInt(Course::getCredits)
	                          .sum();
	    }
	  

}
