	package SeyCollege;
	
	import java.util.List;
	
	public class Teacher {
		
		private int teacherID;
		private String firstName;
		private String lastName;
		private String birthday; 
		private String address;
		private String phone;
		private String mail; 
		private String username;
		private String password;
		private float salary;
		private List<Course> courses;
		
		public Teacher(int id, String firstName, String lastName, String birthday, String address, String phone, String mail, float salary) {
			
			this.teacherID = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.birthday = birthday;
			this.address = address;
			this.phone = phone;
			this.mail = mail;
			this.salary = salary;
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
	
		
		public int getTeacherID() {
			return teacherID;
		}
	
		public void setTeacherID(int teacherID) {
			this.teacherID = teacherID;
		}
	
		public float getSalary() {
			return salary;
		}
	
		public void setSalary(float salary) {
			this.salary = salary;
		}
		
		public void addCourse(Course c) {
			
			this.courses.add(c);
			
		}
	
		public String toString() {
			return "Teacher [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + ", address="
					+ address + ", phone=" + phone + ", mail=" + mail + ", username=" + username + ", password=" + password
					+ ", courses=" + courses + "]";
		}
		
		
	
	}
