package academic;

public class Attestation{
	private Course course;
    private double firstAttestation;
    private double secondAttestation;
    private double finalExam;
    
    public Attestation(Course course, double firstAttestation) {
      this.course = course;
      this.firstAttestation = firstAttestation;
      secondAttestation = 0;
      finalExam = 0;
    }

    public String toString() {
      return course.getName() + ": " + "first att: " + this.getFirstAttestation() + ", second att: " + this.getSecondAttestation() + ", final: " + this.getFinalExam();
    }
    

  public double getFirstAttestation() {
    return firstAttestation;
  }


  public void setFirstAttestation(double firstAttestation) {
    this.firstAttestation = firstAttestation;
  }


  public double getSecondAttestation() {
    return secondAttestation;
  }


  public void setSecondAttestation(double secondAttestation) {
    this.secondAttestation = secondAttestation;
  }


  public double getFinalExam() {
    return finalExam;
  }


  public void setFinalExam(double finalExam) {
    this.finalExam = finalExam;
  }


  public Course getCourse() {
    return course;
  }


  public void setCourse(Course course) {
    this.course = course;
  }
  
  public double getGPA() {
    return GpaConverter.getGPA(getFirstAttestation() + secondAttestation + finalExam);
  }
}

class GpaConverter {
	public static double getGPA(double mark) {
		if(mark > 95) return 4.00;
		if(mark > 90) return 3.67;
		if(mark > 85) return 3.33;
		if(mark > 80) return 3.0;
		if(mark > 75) return 2.67;
		if(mark > 70) return 2.33;
		if(mark > 65) return 2.0;
		if(mark > 60) return 1.67;
		if(mark > 55) return 1.33;
		if(mark > 50) return 1.00;
		return 0;
	}
}