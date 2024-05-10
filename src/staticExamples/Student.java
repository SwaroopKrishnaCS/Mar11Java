package staticExamples;

import java.util.Random;

public class Student {
	
	static String subject;
	static String classTime;
	final static String instructors = Constants.instructors;

	
	private int rollNo;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		generateZoomLinkNumber();
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	private String name;
	private int age;
	private String phoneNo;

	public Student(String name, int age, String phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
	}
	
	
	public static Long generateZoomLinkNumber() {
		
		Random random = new Random();
		
		Long zoomLinkNumber = random.nextLong();
		
			
		return zoomLinkNumber;
	}
	
	public static int generateRollNo() {
		
		//Can a non static method be call inside a  static method - NO
	//	String name = getName();
		
		//can we call a static method inside another static method  - Yes
		generateZoomLinkNumber();
		
		return new Random().nextInt(100);
	}
	
	
	public void submitAssignment() {
		
		//Can a static method be call inside a non static method - Yes
		
		int rollNo = generateRollNo();
		
		System.out.println("Submit assignment in time");
	}
	
}
