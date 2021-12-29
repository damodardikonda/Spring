package Demo; 
public class WrittenTst {
 int marks;
int m;
String s;
 
 
 public int WrittenTest(Student student)
 {

	// for(int i=0;i<100;i++)
	 //{ 
		 marks=(int)(100 * Math.random());
	 //}
	 
	 System.out.println("Student name is"+student.name+"marks is "+marks);
	 
	 
	 if(marks>=50 && marks<=100)
	 {
		  m = marks;
		 s=student.name;
		
		 
		 System.out.println("the"+student.name+"is eligible for HRround and Technical round ");
	
	 return 1;
	 }
	 else
	 {
		 System.out.println("the"+student.name+"is not eligible for HRround and Technical round ");
	 }
 
 rreturn 0;
 }
}
