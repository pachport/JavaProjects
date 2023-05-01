package SeyCollege;

public class Certificate {
	
	private Course c;
	private Student s;
	private int grade;
	
	public Certificate(Course c, Student s, int grade) {
		this.c = c;
		this.s = s;
		this.grade = grade;
	}

	
	public String toString() {
		return "Certificate [c=" + c + ", s=" + s + ", grade=" + grade + "]";
	}
	
	public void printCertificate() {
		
		System.out.println("SEY College /n CERTIFICATE /n Student: "+ this.s.getFirstName() + " " + this.s.getLastName()+"/n Course:"+ this.c.getTitle()+ "/n Star Date: " + this.c.getStartDate()+ " End Date: " + this.c.getEndDate());	
		
	}

}
