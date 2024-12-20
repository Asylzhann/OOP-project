package academic;

import java.util.HashMap;

public class Semester{
  private HashMap <Course, Attestation> attestations;
	  
  private int semesterNum;
  private int credits;
  private double GPA;
  
  {
    attestations = new HashMap <>();
    credits = 0;
    GPA = 0 ;
  }
  
  public Semester(int semesterNum) {
    this.semesterNum = semesterNum;
  }
  
  public HashMap<Course, Attestation> getAttestations() {
    return attestations;
  }
  
  public void setAttestations(HashMap<Course, Attestation> attestations) {
    this.attestations = attestations;
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
    return GPA;
  }
}