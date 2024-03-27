package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog1 = new Dog("Snoopy");
		//   Upcasting : 보무 타입으로 자손 객체를 참조하는 것
		// 자동 캐스팅
		// 참조 타입에 설계된 것만 사용할 수 있ㄷㅏ
		
		dog1.eat();
		dog1.walk();
	//	dog.bark();
		// 설계도에 있는 것만 사용 가능ㄹ

		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		// Downcasting : 명시적으로 타입을 지정
		// dog1을 bark() 하도록 해보자
		
		((Dog)(dog1)).bark(); //  Aninal - > Dog 캐드팅 후 실행
 
		{
		 Dog pet = new Dog("Azi");
		 pet.eat();
		 pet.walk();
		 pet.bark();
		 
		 pet = null;
		 
//		 pet = new Cat("아즈라엘"); // 부모가 아닌 클래스에서는 참조 불가
		}
		
		{
			Animal pet = new Dog("아즈라엘");
			pet.eat();
			pet.walk();
	//		pet.bark();
			//현재 pet이 어떤 클래스의 인스턴스인지 확인
			if (pet instanceof Dog) { // Dog의 인스턴스면
				((Dog)pet).bark();
			} else if (pet instanceof Cat) { // Cat이 인스턴스면
				((Cat)pet).meow();
			}
			
			pet = null;
			
			pet = new Cat("아즈라엘");
			pet.eat();
			pet.walk();
			pet.meow();
			
			if (pet instanceof Dog) { // Dog의 인스턴스면
				((Dog)pet).bark();
			} else if (pet instanceof Cat) { // Cat이 인스턴스면
				((Cat)pet).meow();
			}
			
		}
	}

}
