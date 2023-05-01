package com.dao;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.DBConnection;
import com.model.Student;

public class DAOStudent {
	
	public void insertStudent(Student s) {
		
		try {
			
			Statement st = DBConnection.connectToDB().createStatement();
			String query = "Insert into student (name, age) values ('" + s.getName() + "'," + s.getAge()+");";
			st.executeUpdate(query);
			System.out.println("Student " + s.toString() + " created SUCCESSFULLY" );
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public void updateStudent(int studentID, String newName, int newAge) {
		
		try {
			
			Statement st = DBConnection.connectToDB().createStatement();
			String query = "Update student set name = " + newName + " age = " + newAge + " where studentID =" + studentID +";";
			st.executeUpdate(query);
			System.out.println("Student updated SUCCESSFULLY" );
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public void deleteStudent(int studentID) {
		
		try {
			
			Statement st = DBConnection.connectToDB().createStatement();
			String query = "Delete student where studentID =" + studentID +";";
			st.executeUpdate(query);
			System.out.println("Student deleted SUCCESSFULLY delete id" );
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public void deleteStudent(String name) {
		
		try {
			
			Statement st = DBConnection.connectToDB().createStatement();
			System.out.println(name);
			String query = "Delete from student where name = '" + name +"';";
			st.executeUpdate(query);
			System.out.println("Student deleted SUCCESSFULLY delete name" );
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public List<Student> selectAllStudent() {
		
		try {
			
			List<Student> students = new ArrayList<Student>();
			
			Statement st = DBConnection.connectToDB().createStatement();
			String query = "Select * from student;";
			ResultSet result = st.executeQuery(query);
		
			while(result.next()) {
				
				Student s = new Student(result.getInt(1),result.getString(2),result.getInt(3));
				students.add(s);
				
			}
			
			return students;
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}

	public void deleteStudent(Student s) {
		System.out.println("Entra delete" + s.toString());

		try {
			System.out.println("Entra try" + s.toString());
			Statement st = DBConnection.connectToDB().createStatement();
			String query = "Delete from student where studentID =" + s.getStudentID() +";";
			st.executeUpdate(query);
			System.out.println("Student deleted SUCCESSFULLY Student s func" );
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
