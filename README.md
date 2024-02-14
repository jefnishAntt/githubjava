# githubjava
Aim: 

        The ultimate objective is to learn about the course that the user needs to buy and to study that specific course from the location of their choice.

Synopsis:

	Online Courses Class.
	Purchasing Class.
	Course Class.
	Merits.
	Demerits.
	Scope.
	Features That Can Add.

Introduction:

                In this case, Java is the programming language being used, while Eclipse is the IDE in which the program was run. A package was made and given the name "Courses Purchase." Three classes are created inside the package and given the names Online Course, Course, and Purchasing.

Online Courses Class:

•	Instance Variables were created to store the data.

•	It was designated as private because the data are not wanted to be Accessed from outside of the class.

•	A Constructor method was created with the parameters. Inside the Constructor Class Parameters Value was assigned to the Instance Variable of Class Here” this” method was used to refer the current classes instance variables for ambiguity between two variables.

•	The Instance Variable data was private so it was not possible to access this data from other classes. To access these data from other classes, get method was created for each and every object to return its value.

![image](https://github.com/jefnishAntt/githubjava/assets/159998733/72cf3bba-e547-498a-866b-7baad3996ef7)

•	Set method was created to change the value of the particular objects.

•	Display Course Name method was created to display the value of the Course Name.

•	Finally, the “to String method” was created to return the original code value of the Constructor Objects.

 ![image](https://github.com/jefnishAntt/githubjava/assets/159998733/0db4b375-eb32-414d-ab90-f80a13257439)

Purchasing Class:

•	The Array List Librarys and Scanner Library was inserted which is an inbuild in java.

•	 Inside the Purchasing Class Instance Variable was created to get the input from the user.

•	In the Constructor Class which is named as Purchasing the Scanner object was created to store the Input value given by the User.

•	Then the Particular Name of the instance Variable was asked to print and the Input method was Created to get the input value by the user and it will store the data in the Instance Variable.

•	The boolean method named as isAvailable was created to return the value wheather it is true or false.

•	The Array List of Online Courses and purchasing Which was Inserted in the Course class was added inside the parenthesis of isAvailable Method.

•	Integer maxStudent variable is created and assigned the value as “0” to store the total value of MaxStudents of the Online Courses Class.

•	Getting each and every data from Array List of Online Courses and storing inside the Variable “c” by using for each loop.

•	Inside the If Condition the getCourse method and getCost Method which is in the Online Courses Class was invoked to its particular Object and checking wheather the data of Purchasing ClassCourse Name is equal to the Instance Variable of the same class. 

•	If both the Course Name and Cost are equal the maxStudent Variable will get the data of Online Courses Class  Maxstudents by the help of getMaxstudents method which was Invoked to the Object “c”.

•	The Student Variable was created and assingned as 0 in an integer Datatype.

•	The Enhanced for loop was looping the Object from “Buy” ArrayList to “p”.

•	The if condition was checking whether the purchased Course Name and Cost are equal to the Current Course Name and Cost if it was equal the Students value will be incremented by One.

•	If the the students is lesser than max students it will return true else false.

![image](https://github.com/jefnishAntt/githubjava/assets/159998733/1a08b28b-cca8-4179-af1e-f7a93e6fcdf7)

Course Class:

•	The Scanner and Array List Library was inserted which was an Inbuild in java.

•	In Course Class the Execution Programs are Entered inside the Main Method for an easy access.

•	New array List was created and the Online Courses Data are stored inside the Courses Object and the Purchasing data are stored inside the Buy Object.

•	The Details of the Course which needs to be Displayed were added to the Courses Object.

•	A String “Courses That We Are Providing” were Printed along with Tab Escape Sequences.

•	In Enhanced for loop the “c” Object is getting the access of data from Online Courses Class Array List.

•	 The Display Course Name Method was Invoked in the Object” c”.

•	Scanner Object Was Created and “Back” String is assigned to the Confirmation Variable.

•	If the While Loop Condition Confirmation was equals to “Back” bellow Statement blocks will be executed and it does not concern whether it is upper case or lower case because the “equalsIgnoreCase” Method was Invoked.

•	“Enter The Course Name for Details” were asked to Printed. In the next line Input Method was Called and Value given by the user will be stored in the “CN” Variable.

•	In the Switch Case Condition CN Variable is Allotted. The Switch Case Will check particular value of CN which is given by the user is matching to the case one by one if matches it will execute the particular Statement block.

•	Inside the Switch Case the for each and every course the toString Method which convert’s the object to String was invoked to Object “courses”.

 ![image](https://github.com/jefnishAntt/githubjava/assets/159998733/f9371779-4dba-439a-8d1f-fad9ba06649b)

•	If a Statement Block is executed the “break” keyword will Terminate the Loop. If none of the case match to “CN” default will be executed.

•	After the Switch Case “Enter Next to Purchase the Course or Back to View Other Courses” Will Printed along with an Escape Sequence.

•	In the next line Input Method was Called and the Input Value was assigned to Confirmation Variable.

•	The if condition will check the input of user If the User enters “Next” in the input the Confirmation value will be assigned as next then the While Loop will be executed else “Sorry! The entered input was wrong” will be Printed.

•	If the Confirmation equals to “Next” the “if Condition” will be executed.

•	Inside the if statement new memory allocated for Purchasing Class in the Object pu.

•	The next if condition invoking the isAvailable Method to object “pu” and asked to check whether the current data can purchase the course or not. If possible, the Statement Block inside the if statement will be executed else the else Statement will be executed.

•	 If the Course Purchased Successfully “Enter any number for applying more course” will get Printed and ask for the input Integer. If Integer was inserted by the user it will ask to apply for more course.
 
•	If User enter Back in the Confirmation Input which was in Line no.62 It will ask for Course name which the User prefer to Purchase and Display its Details then the loop will be Continued from the beginning.
 
![image](https://github.com/jefnishAntt/githubjava/assets/159998733/590b747e-3f6a-4751-bce3-501fda65c1ca)
	
 
Merits:

•	The User can Purchase the Course and Study in the Place Which they prefer to.

•	The course's availability and details will be prominently highlighted.

•	It will be Convenient to use.

•	Can Change the Capacity of Course, Max Students, Authors, Cost and note.

Demerits:

•	The Details about Starting of next Batch is Unknown.

•	The Exit Option Was not added.

•	If the First letter of the Course Name Entered in lowercase it will not Consider it as a Course Name.

Scope:

     The Main Objective of this Project is to make the students to start their carrier without wasting their time after their Graduation. Because many of them have no idea about what to do after their studies. By getting into this Particular Platform, they can gain Knowledge about their Carrier by the help of their Mentor who teach them about the Course because they will have Experience about this path it will Prevent the students from getting into a Wrong path and also, they don’t want to Stress their self to Study this Course especially like travelling to some other city for Studying. They can Study from the place which they prefer to. 
     
Features That Can Add:

•	Sending Purchased Slip to the Users Gmail.
•	Exit Option After Booking.
•	After Purchasing displaying Author Contact No.
•	Getting the Qualification of the Students to guide them in a Proper way.
•	Making Partnership with best Institutes and Displaying based on their reviews to purchase their Course’s.

