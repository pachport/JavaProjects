package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.dao.DAOStudent;
import com.model.Student;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;

public class GaphicalIntf extends JFrame {

	private JPanel contentPane;
	private JTextField nameT;
	private JTextField ageT;
	private JTable table = new JTable();
	
	private List<Student> students;
	private DAOStudent dao = new DAOStudent();

	/**
	 * Create the frame.
	 */
	
	public GaphicalIntf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(208, 191, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		nameLabel.setBounds(37, 53, 45, 13);
		contentPane.add(nameLabel);
		
		nameT = new JTextField();
		nameT.setBounds(92, 47, 96, 26);
		contentPane.add(nameT);
		nameT.setColumns(10);
		
		JLabel ageLabel = new JLabel("Age");
		ageLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ageLabel.setBounds(37, 89, 45, 13);
		contentPane.add(ageLabel);
		
		ageT = new JTextField();
		ageT.setBounds(92, 83, 96, 26);
		contentPane.add(ageT);
		ageT.setColumns(10);
		
		JButton buttonAdd = new JButton("Add Student");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String name=nameT.getText();
				int age = Integer.valueOf(ageT.getText()); //Integer.parseInt();
				
				Student s = new Student(name,age);
				
				DAOStudent daoStudent = new DAOStudent();
				
				daoStudent.insertStudent(s);
				
				nameT.setText(null);
				ageT.setText(null);
				
				fillTable();
				
				
			}
		});
		buttonAdd.setBounds(208, 49, 106, 21);
		contentPane.add(buttonAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 136, 352, 302);
		contentPane.add(scrollPane);
		
		
		scrollPane.getViewport().setBackground(new Color(208, 191, 240));
		scrollPane.getViewport().setOpaque(true);
		
		scrollPane.setViewportView(table);
		
		JButton buttonDelete = new JButton("Delete Student");
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Do you want to delete this student?","Delete", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					
					if (!nameT.getText().isEmpty()) {
						
						System.out.println("Entra al if"); 
						dao.deleteStudent(nameT.getText());
											
					}
					else {
						
						System.out.println("Entra al else");
						System.out.println(students);
						System.out.println(table.getSelectedRow());
						Student s = students.get(table.getSelectedRow());
						System.out.println(s.toString()); 
						dao.deleteStudent(s);
					
					}
					
					nameT.setText(null);
					fillTable();
				}
			}
		});
		buttonDelete.setBounds(205, 89, 109, 22);
		contentPane.add(buttonDelete);
		
		
		
		
			fillTable();
		
	}

	public void fillTable() {
		
				
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Age");
		
		
		students=dao.selectAllStudent();
				
		for (Student s : students) 		
			model.addRow(new Object[] {s.getName(),s.getAge()});
		
		
		table.setModel(model);
	}
}
