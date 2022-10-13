package ClassPart;

public class Student {

	public static void main(String[] args) {
		
		
		StudentClass test1 = new StudentClass();
		test1.age = 21;
		test1.name = "안";
		int age = test1.getAge();
		
		System.out.println(test1.getAge());
		System.out.println(test1.name);
		
//		StudentClass test = new StudentClass();
//		test.age = 30;
//		test.name = "홍길";
//		test.className = "mate";
//		test.phoneNumber = 1234;
//		
//		System.out.println(test.age);
//		
		
//		StudentClass.isAdult();
	}

}
