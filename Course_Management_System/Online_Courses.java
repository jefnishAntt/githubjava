package Course_Management_System;

public class Online_Courses {
	private String Course;
	private int Maxstudents;
	private String Duration;
	private String Days;
	private String Authors;
	private int Cost;
	private String Note;
	
    Online_Courses(String Course,int Maxstudents,String Duration,String Days,String Authors,int Cost,String Note) {
		this.Course = Course;
		this.Maxstudents = Maxstudents;
		this.Duration = Duration;
		this.Days = Days;
		this.Authors = Authors;
		this.Cost = Cost;
		this.Note = Note;
	}
    public String getCourse() {
    	return Course;
    }
    public int getMaxstudents() {
    	return Maxstudents;
    }
    public String getDuration() {
    	return Duration;
    }
    public String getDays() {
    	return Days;
    }
    public String getAuthors() {
    	return Authors;
    }
    public int getCost() {
    	return Cost;
    }
    public String getNote() {
    	return Note;
    }
    
    
    public void setCourse(String Course) {
    	this.Course = Course;
    }
    public void setMaxstudents(int Maxstudents) {
    	this.Maxstudents = Maxstudents;
    }
    public void setAuthors(String Authors) {
    	this.Authors = Authors;
    }
    public void setCost(int Cost) {
    	this.Cost = Cost;
    }
    public void setNote(String Note) {
    	this.Note = Note;
    }
    
    
    public void displayCourseName() {
    	System.out.println("Course :"+Course);
    }
    
   public  String toString() {
	return "Course Name \t\t:"+Course+"\nMaximum Students \t:"+Maxstudents+"\nDuration Of Course \t:"+
   Duration+"\nDays \t\t\t:"+Days+"\nAuthor Name \t\t:"+Authors+"\nCost \t\t\t:"+Cost+"\nNote \t\t\t:"+Note;
	   
   }
}
