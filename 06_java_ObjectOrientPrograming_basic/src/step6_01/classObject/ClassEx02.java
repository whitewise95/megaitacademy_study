package step6_01.classObject;
/*
 * 
 * # 클래스의 범위
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
 *       ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
 * 
 * */
class Student {
	
	String name;
	int Score;
}



public class ClassEx02 {
	
	public static void main(String[] args) {
		
		//같은 클래스 파일의 클래스
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		//같은 패키지 안의 다른 클래스 파일의 클래스
		Character c1= new Character();
		Character c2= new Character();
		Character c3= new Character();
		
		
		ClassEx01 obj = new ClassEx01();
		
		
		
		
		
		
		
		
	}

}
