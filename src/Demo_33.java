
public class Demo_33 {

	public static void main(String[] args) {

		student obj = new student(234, "vivek", true);
		student obj1=new student(345,"Rahul",false);
		if(obj.secondchance==true) {
			obj.identifymarks((float)34.0,(float)75.0);
		}
		else {
			obj.identifymarks((float)34.0);	
		}
		System.out.println("Student id is"+obj.studentId);
		System.out.println("Student name is"+obj.studentName);
		System.out.println("Student marks is"+obj.marks);
		System.out.println("case of taking second chance is"+obj.secondchance);
		if(obj1.secondchance==true) {
			obj1.identifymarks((float)34.0,(float)75.0);
		}
		else {
			obj1.identifymarks((float)34.0);	
		}
		System.out.println("Student id is"+obj1.studentId);
		System.out.println("Student name is"+obj1.studentName);
		System.out.println("Student marks is"+obj1.marks);
		System.out.println("case of taking second chance is"+obj1.secondchance);
	}
}


class student{
	int studentId; String studentName; float marks; boolean secondchance;
	student(int studentId, String studentName, boolean secondchance){
		this.studentId=studentId;
		this.studentName=studentName;
		this.secondchance=secondchance;
	}
	int getStudentId() {
		return this.studentId;
	}
	String getstudentName() {
		return this.studentName;
	}
	float getmarks() {
		return this.marks;
	}
	boolean getSecondChance() {
		return this.secondchance;
	}
	void identifymarks(float marks ) {
		this.marks=marks;	
	}
	void identifymarks(float marks1, float marks2) {
		if(marks1>marks2)
			this.marks=marks1;
		else
			this.marks=marks2;
	}	
}

