package com.javaex.oop.shape.v2;

// 인터페이스
// - 직접적인 상속관계를 해치지 않으면서 기능을 횡적 확장 할 수 있다
// - 내부에 추상 메서드만 담길 수 있고, 특별히 abstract는 명시하지 않음
public interface Drawable {
	Object draw = null;

	public void draw();
}
