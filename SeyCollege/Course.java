package SeyCollege;

import java.util.List;

public class Course {
	
	private int courseID;
	private String title;
	private String description;
	private int duration;//number of hours
	private float price;
	private String startDate;
	private String endDate;
	private Teacher teacher;
	private List<Student> students;
	
	
	public Course(int courseID, String title, String description, int duration, float price, String startDate, String endDate) {
		
		this.courseID = courseID;
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
		
	}




	public int getCourseID() {
		return courseID;
	}




	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public int getDuration() {
		return duration;
	}




	public void setDuration(int duration) {
		this.duration = duration;
	}




	public float getPrice() {
		return price;
	}




	public void setPrice(float price) {
		this.price = price;
	}




	public String getStartDate() {
		return startDate;
	}




	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}




	public String getEndDate() {
		return endDate;
	}




	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}




	public Teacher getTeacher() {
		return teacher;
	}




	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}




	public List<Student> getStudents() {
		return students;
	}




	public void setStudents(List<Student> students) {
		this.students = students;
	}




	public void addStudent(Student s) {
		
		this.students.add(s);
		
	}
	

}
