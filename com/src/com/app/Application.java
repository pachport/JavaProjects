package com.app;

import javax.swing.UIManager;


import com.dao.DAOStudent;
import com.model.Student;
import com.view.GaphicalIntf;

public class Application {

	public static void main(String[] args) {
		
		try {
			
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception e){
			
			System.out.println(e);
		}
		
		DBConnection.connectToDB();
		
		GaphicalIntf jf = new GaphicalIntf();
		jf.setVisible(true);
		
	}

}
