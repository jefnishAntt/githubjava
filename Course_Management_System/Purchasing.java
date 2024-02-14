package Course_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Purchasing {
	String Course_Name;
	String Name;
	int Mobile_no;
	String Gmail;
	int Cost;

	Purchasing() {
		Scanner User = new Scanner(System.in);
		
		System.out.println("Course Name :");
		Course_Name = User.next();
		System.out.println("Name :");
		Name = User.next();
		System.out.println("Mobile.no :");
		Mobile_no =User.nextInt();
		System.out.println("Gmail :");
		Gmail =User.next();
		System.out.println("Enter The Payment :");
		Cost =User.nextInt();
		
	}
		public boolean isAvailable(ArrayList<Online_Courses>courses, ArrayList<Purchasing>Buy) {
			int maxStudent =0;
			for(Online_Courses c:courses) { 
				if(c.getCourse().equals(Course_Name)&& c.getCost()==Cost) { 
					maxStudent =c.getMaxstudents();	
			    }
			}	
			int students =0;
			
			for(Purchasing p:Buy) {
				if(p.Cost == Cost && p.Course_Name.equals(Course_Name)) {
					students++;
				}
			}
			return students<maxStudent?true:false;
			
		}
}