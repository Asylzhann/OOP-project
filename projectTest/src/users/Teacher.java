package users;

import java.util.List;
import java.util.Objects;

import enums.TeacherTitle;

public class Teacher extends Employee {
	private String teacherId;             
    private TeacherTitle title;           
    private String department;           
    private List<String> coursesTaught;   
    private double rating;                

    public Teacher(int id, String email, String password, String fullName, int employeeId, String teacherId,
                   TeacherTitle title, String department, List<String> coursesTaught, double rating) {
        super(id, email, password, fullName, employeeId, department);
        this.teacherId = teacherId;
        this.title = title;
        this.department = department;
        this.coursesTaught = coursesTaught;
        this.rating = rating;
    }


    public void viewCourses() {
        System.out.println("Courses taught by " + fullName + ": " + coursesTaught);
    }

    public void manageCourses(String course) {
        coursesTaught.add(course);
        System.out.println(course + " added to " + fullName + "'s course list.");
    }

    public void viewStudents() {
        System.out.println("Viewing students for courses taught by " + fullName);
    }

    public void sendComplaint(String complaint) {
        System.out.println("Complaint sent by " + fullName + ": " + complaint);
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public TeacherTitle getTitle() {
        return title;
    }

    public void setTitle(TeacherTitle title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<String> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher teacher = (Teacher) obj;
        return Double.compare(teacher.rating, rating) == 0 &&
               Objects.equals(teacherId, teacher.teacherId) &&
               title == teacher.title &&
               Objects.equals(department, teacher.department) &&
               Objects.equals(coursesTaught, teacher.coursesTaught) &&
               super.equals(obj); 
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teacherId, title, department, coursesTaught, rating);
    }


    @Override
    protected Teacher clone() throws CloneNotSupportedException {
        return (Teacher) super.clone();
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Teacher{teacherId='" + teacherId + '\'' +
               ", title=" + title +
               ", department='" + department + '\'' +
               ", coursesTaught=" + coursesTaught +
               ", rating=" + rating +
               '}';
    }


	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}
}
