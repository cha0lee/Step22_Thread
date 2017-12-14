package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		//스레드의 작업이 메인클래스 종료 후 시작 될 경우 지역변수 name이 사라지므로 final을 붙여서 변수를 상수화 한 후 
		//스레드의 참조값이 현재 상태의 스냅샷을 찍어 기억하게 하고 나중에 사용하게 한다. 
		//상수화 하는 이유는 스냅샷 찍은 후 지역변수 값을 변경 못하게 하려고..
		final String NAME = "김구라"; 
		
		//local inner class를 이용해서 Thread 시작하기
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("local variable name: " + NAME);
			}
		}).start();
	}
}
