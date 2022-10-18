package Inheritance;

public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println("학생입니다.");
	}
	
	public Student(String name, String major) {
		// 부모클래스의 name 필드에 값 저장하기
		//super(name); // 부모의 생성자를 통해.. 생성자 호출은 첫번째 줄에만 위치해야 함
		//super.name = name; 
		this.name = name;
		this.major = major;
	}
	
	// 오버라이드: 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것
	@Override
	public void introduce() {
		 System.out.println("내 전공은 " + this.major + "입니다.");
		 super.introduce();
	}
}
