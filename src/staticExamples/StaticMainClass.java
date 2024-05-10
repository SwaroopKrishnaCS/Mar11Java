package staticExamples;

import java.util.Arrays;

import enumExamples.Subjects;

public class StaticMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student("Annena", 16, "98779869869");
		int rollNO = Student.generateRollNo();
		student1.setRollNo(rollNO);

		Student student2 = new Student("Ravneet", 16, "98789989868");
		rollNO = Student.generateRollNo();
		student2.setRollNo(rollNO);

		Student student3 = new Student("Arshpreet", 20, "7858586588");
		rollNO = Student.generateRollNo();
		student3.setRollNo(rollNO);

		//Static means common to all objects (For 100 objects or as many object created) . Alternatively - Static variables belongs to Class
		Student.subject = "Java";

		Student.classTime = "7:30 to 9:30";

		System.out.println("Printing Student details");

		System.out.println("Student 1 details :  Name : " + student1.getName() + "  Age : " + student1.getAge()
				+ " Subject : " + Student.subject + "   ClassTime : " + Student.classTime + "Roll no : "+student1.getRollNo());

		System.out.println("Student 2 details :  Name : " + student2.getName() + "  Age : " + student2.getAge()
				+ " Subject : " + Student.subject + "   ClassTime : " + Student.classTime +  "Roll no : "+student2.getRollNo());

		System.out.println("Student 3 details :  Name : " + student3.getName() + "  Age : " + student3.getAge()
				+ " Subject : " + Student.subject + "   ClassTime : " + Student.classTime + "Roll no : "+student3.getRollNo());

		student1.subject = "Selenium";
//		
//		student2.subject="Selenium";
//		
//		student3.subject = "Selenium";

//		Student.subject = "Selenium";
//
//		System.out.println("Printing Student details after changing subject for each one of them");
//
//		System.out.println("Student 1 details :  Name : " + student1.getName() + "  Age : " + student1.getAge()
//				+ " Subject : " + Student.subject + "   ClassTime : " + Student.classTime);
//
//		System.out.println("Student 2 details :  Name : " + student2.getName() + "  Age : " + student2.getAge()
//				+ " Subject : " + Student.subject + "   ClassTime : " + Student.classTime);
//
//		System.out.println("Student 3 details :  Name : " + student3.getName() + "  Age : " + student3.getAge()
//				+ " Subject : " + Student.subject + "   ClassTime : " + Student.classTime);
//
		Student.subject = "Maven";
		
		System.out.println("Subjects we teach ");
		
//		System.out.println(Subjects.ManualTesting);
//		
		System.out.println(Subjects.Java);
		
		System.out.println(Arrays.toString(Subjects.values()));
		
		
		Student.subject = Subjects.Maven.toString();
//
		System.out.println("Printing Student details after changing subject using static variable");

		System.out.println("Student 1 details :  Name : " + student1.getName() + "  Age : " + student1.getAge()
				+ " Subject : " + Student.subject + "   ClassTime : " + Student.classTime);

		System.out.println("Student 2 details :  Name : " + student2.getName() + "  Age : " + student2.getAge()
				+ " Subject : " + Student.subject + "   ClassTime : " + Student.classTime);
//
//		System.out.println("Student 3 details :  Name : " + student3.getName() + "  Age : " + student3.getAge()
//				+ " Subject : " + Student.subject + "   ClassTime : " + Student.classTime);

		//Student.instructors="Manvir";
		
		System.out.println("Instructor of class : "+Student.instructors);
		
		System.out.println("Generate zoom link number : "+Student.generateZoomLinkNumber());
		
		System.out.println("ADd two numbers :"+ Math.addExact(1, 110));
	}

}
