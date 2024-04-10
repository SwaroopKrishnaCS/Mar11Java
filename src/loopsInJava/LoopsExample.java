package loopsInJava;

public class LoopsExample {

	int a = 5;
	String nameOfStudent = "jerin";
	String[] listOfStudents = { "Prabh", "Manvir", "Arsh", "Jerin", "Gian" };
	int[] ageOfStudents = { 15, 16, 14, 12, 18, 21, 17, 11 };

	public void printStudentName() {
		System.out.println("Name of the Student " + nameOfStudent);
	}

	public void printStudentNameFromArray() {
		System.out.println("Name of the Student " + listOfStudents[2]);
	}

	public void incrementValue() {
		// a=a+1;
		System.out.println("A value intially " + a);
		a--;
		System.out.println("A value post decrement " + a);
		a++;
		System.out.println("A value post increment " + a);
		--a;
		System.out.println("A value pre decrement  " + a);
		++a;
		System.out.println("A value pre increment  " + a);
	}

	public void findJerin() {
		// for(counter;maximum condition for loop;increment condition){
		// }

		for (int counter = 0; counter < 5; counter = counter + 2) {
			System.out.println(listOfStudents[counter]);
		}
	}

	public void printAge() {
		for (int cnt = 5; cnt < 8; cnt++) {
			System.out.println(ageOfStudents[cnt]);
		}
	}

	public void attemptATM() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Wrong attempt");
		}
	}

}
