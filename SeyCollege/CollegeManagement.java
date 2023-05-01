package SeyCollege;

import java.util.List;

public class CollegeManagement {
	
	private Teacher t;
	private Course c;
	private Student s;
	private boolean payment;
	private Certificate cert;
	
	
	public Student registerStudent(int id, String firstName, String lastName, String birthday, String address, String phone, String mail ) {
		
		this.s = new Student(id,firstName, lastName, birthday, address, phone, mail);
		return s;
		
	}
	
	public Teacher hireTeacher(int id, String firstName, String lastName, String birthday, String address, String phone, String mail, float salary) {
		
		this.t = new Teacher (id, firstName,lastName,birthday,address,phone,mail,salary);
		return t;
		
	}
	
	public void setStudentCredentials(Student s, String username, String password) {
		
		s.setUsername(username);
		s.setPassword(password);
		
	}
	
	public void setTeacherCredentials(Teacher t, String username, String password) {
		
		t.setUsername(username);
		t.setPassword(password);
		
	}
	
	public void setStudentRegistration(Course c, Student s, boolean payment) {
		
		if (payment) {
			
			s.addCourse(c);
			c.addStudent(s);
			System.out.println("Your course was sucessfully registered");
		}
		else System.out.println("We can't register the course before the payment has been recived");
		
	}
	
	
	public Course createCourse(int id, String title, String description, int duration, float price, String startDate, String endDate) {
		
		this.c = new Course(id, title, description, duration, price, startDate, endDate);
		return c;
		
	}
	
	public void assignTeacher(Teacher t, Course c) {
		
		c.setTeacher(t);
		t.addCourse(c);
		
		
	}
	
	
	public Certificate getCertificate(Course c, Student s, int grade) {
		
		if (grade>=70) {
			
			this.cert = new Certificate(c,s,grade); 
			this.cert.toString();
			s.addCertificate(cert);
			this.cert.printCertificate();
			return this.cert;
			
		}	else {
			
			System.out.println("You need to retake the course to get your certificate");
			return null;
			
		}
		
	}
	
	
	

}
