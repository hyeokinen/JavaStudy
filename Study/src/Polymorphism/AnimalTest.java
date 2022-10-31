package Polymorphism;

public class AnimalTest {

	public static void main(String[] args) {
		
		
		int number = (int)1.5; // casting
		System.out.println(number);
		
		/**
		 * up casting(업캐스팅): 자식 -> 부모로 캐스팅
		 * 1. 부모 클래스의 메소드를 사용할 수 있다.
		 * 2. 부모 클래스에 있는 메소드를 오버라이드 한 메소드를 사용할 수 있다.
		 * 3. 자식 클래스에만 있는 메소드는 사용할 수 없다. 
		 */
		Animal animal = new Cat();
		animal.eat();
		animal.cry();
		// animal.grooming();  // 사용 불가
		
		
		
		/**
		 * down casting(다운캐스팅): 부모 -> 자식으로 캐스팅
		 * - 자식 클래스 여러개이기 때문에 명확하게 캐스팅 문법을 명시해주어야 한다.
		 * - 어떤 자식 클래스인지 instanceof 명령어를 사용해서 검사해야 한다.
		 */
		if (animal instanceof Dog dog) {
			dog.lash();
		} else if (animal instanceof Cat cat) {
			cat.grooming();
		}
	}

}
