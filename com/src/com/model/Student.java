package com.model;

public class Student {
	
	private long StudentID;
	private String name;
	private int age;
	
	
	public Student() {
		
	}


	public Student(long studentID, String name, int age) {
		StudentID = studentID;
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, int age) {
	
		this.name = name;
		this.age = age;
	}


	public long getStudentID() {
		return StudentID;
	}


	public void setStudentID(long studentID) {
		StudentID = studentID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	/*public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}*/
	
	public String toString() {
		return "Student [ id=" + StudentID + " name=" + name + ", age=" + age + "]";
	}
	
	

}
