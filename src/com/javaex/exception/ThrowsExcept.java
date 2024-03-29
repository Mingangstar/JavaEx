package com.javaex.exception;

public class ThrowsExcept {
	public void executExcept() throw IOException { // 선언부에 예외를 던질 것을 알림
		System.out.println("강제 예외 발생!");
		// 외부로 얘외 던지기 (throw)
		throw new IOException("강제 예외!");
		// IOException 대표적인 CheckecException,
		// CheckedException을 throw 할 떄는 해당 메서드가 CheckedException을 던져준다는 점을
		// 외부의 메서드에게 알려줘야 한다.
	}
}
