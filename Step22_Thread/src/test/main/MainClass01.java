package test.main;

import test.mypac.AnotherThread;

/*
 *  [ Thread (작업단위) 만들기 ]
 *  
 *  (방법1)
 *  
 *  1. Thread 클래스를 상속받은 클래스를 정의한다.
 *  2. run() 메소드를 오버라이딩한다.
 *  3. 새로운 작업단위가 필요한 시점에 클래스를 이용해서 객체를 생성하고
 *     start() 라는 메소드를 호출하면 스레드가 시작된다. 
 */
public class MainClass01 {

	public static void main(String[] args) {
		// 
		System.out.println("메인 메소드가 시작되었습니다.");
		//새로운 작업단위 시작시키기 (run()메소드를 호출하는 것이 아니라 start()를 호출해야함! - run()이 새로운 작업단위이기 때문에)
		new AnotherThread().start();
		//작업단위 하나당 새로운 Thread 객체 생성해야 함
		new AnotherThread().start();
		new AnotherThread().start();
		
		doSomething();
		
		System.out.println("메인 메소드가 종료됩니다.");

	}
	
	public static void doSomething() {
		System.out.println("메인 스레드가 5초 일시 정지되요~");
		//Thread의 흐름을 5초동안 잡아두기
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("doSomeThing()가 리턴됩니다.");
	}

}
