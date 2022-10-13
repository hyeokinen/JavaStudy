package Class;

public class StudentClass {
	// 1. 학생 명단
	// 학생 클래스를 설계하되, 멤버변수(필드): 이름, 수업명, 나이, 전화번호
	// 메소드 = 나이가 20세 이상이면 "OOO(이름)은 성인입니다. "나이가 20세 미만이면 "OOO(이름)은 미성년자입니다."
	// 2개의 객체를 생성하고, 각각의 값 출력과 메소드를 호출해서 출력하세요.
	
	// 속성: 필드(멤버변수)
	public String name;
	public String className;
	private int age;
	public int phoneNumber;
	
	// 생성자 = 값을 초기화 해주는 값 
//	public StudentClass(String name, String className, int age, int phoneNumber) {
//		this.age = age;
//		this.className = className;
//		this.phoneNumber = phoneNumber;
//		this.name = name;
//	}
	
	
	
	// 행위,기능 : 메소드
	
	public  void isAdult() {
		if(age >= 20) {
			System.out.println(name + "은/ 성인입니다.");
		}
		else {
			System.out.println(name + "은/ 미성년자 입니다.");
		}
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	
	
}
