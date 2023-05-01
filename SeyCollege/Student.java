package SeyCollege;

import java.util.List;

public class Student {
	
	private int studentId;
	private String firstName;
	private String lastName;
	private String birthday; 
	private String address;
	private String phone;
	private String mail; 
	private String username;
	private String password;
	private List<Course> courses;
	private String cardNumber;
	private List<Certificate> certificates;
	
	
	
	
	public Student(int studentId,String firstName, String lastName, String birthday, String address, String phone, String mail) {
		
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.address = address;
		this.phone = phone;
		this.mail = mail;
		
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getBirthday() {
		return birthday;
	}




	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	public String getMail() {
		return mail;
	}




	public void setMail(String mail) {
		this.mail = mail;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public List<Course> getCourses() {
		return courses;
	}




	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}




	public String getCardNumber() {
		return cardNumber;
	}




	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}




	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + ", address="
				+ address + ", phone=" + phone + ", mail=" + mail + ", username=" + username + ", password=" + password
				+ ", courses=" + courses + ", cardNumber=" + cardNumber + "]";
	}


	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void addCourse(Course c) {
		
		this.courses.add(c);
		
	}
	
	public void addCertificate(Certificate c) {
		
		this.certificates.add(c);
		
	}
	

}
