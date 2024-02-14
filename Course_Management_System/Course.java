package Course_Management_System;

import java.util.Scanner;
import java.util.ArrayList;
public class Course {

	public static void main(String[] args) {
		
		ArrayList<Online_Courses> courses = new ArrayList<Online_Courses>();
		ArrayList<Purchasing> Buy = new ArrayList<Purchasing>();
		
		
		courses.add(new Online_Courses("Java",5,"Six Months","Monday-Saturday","Mr.Ram",25000,"Saturday Will Be A Discussing Session."));
		courses.add(new Online_Courses("Phython",7,"Six Months","Monday-Saturday","Mr.Saravanan",25000,"Saturday Will Be A Discussing Session."));
		courses.add(new Online_Courses("C",10,"Three Months","Monday-Saturday","Miss.Santhiya",10000,"Saturday Will Be A Discussing Session."));
		courses.add(new Online_Courses("Flutter",3,"One Month","Monday-Saturday","Mr.Suriya",20000,"Saturday Will Be A Discussing Session."));
		
		System.out.println("\t\t\t\t\tCourses That We Are Providing");
		for(Online_Courses C:courses) {
			C.displayCourseName();
		}
		Scanner User = new Scanner(System.in);
		String Confirmation = "Back";
			
		while(Confirmation.equalsIgnoreCase("Back")) {
		System.out.println("Enter The Course Name For Details:");
		String CN = User.next();
		switch(CN) {
		case "Java":
			int i=0;
			while(i==0) {
				System.out.println(courses.get(i).toString());
				i=1;
			}
			break;
		case "Phython":
			int j=1;
			while(j==1) {
				System.out.println(courses.get(j).toString());
				j=2;
			}
			break;
		case "C":
			int k=2;
			while(k==2) {
				System.out.println(courses.get(k).toString());
				k=3;
			}
			break;
		case "Flutter":
			int L=3;
			while(L==3) {
				System.out.println(courses.get(L).toString());
				L=4;
			}
			break;
			default:
				System.out.println("Invalid Text");
				break;
		}
		System.out.println("\nEnter Next To Purchase The Course Or Back To View Other Courses");
		Confirmation = User.next();
		
		if(Confirmation.equalsIgnoreCase("Next")||Confirmation.equalsIgnoreCase("Back")){
		
		while(Confirmation.equalsIgnoreCase("Next")) {
			
		if(Confirmation.equalsIgnoreCase("Next")) {
			
		Purchasing pu = new Purchasing();
		if(pu.isAvailable(courses,Buy)) {
	    	Buy.add(pu);
			System.out.println("You Have Successfully Purchased The Course");
			System.out.println("Enter Any Number For Applying More Courses:");
			int num = User.nextInt();
		}
		 else
			System.out.println("The Batch Of The Course That You Have Selected Is Currently Full");
		}
		}
		}
		else
			System.out.println("Sorry! The entered input was wrong");
		}
}
}