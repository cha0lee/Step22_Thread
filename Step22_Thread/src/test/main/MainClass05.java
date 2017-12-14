package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		//local inner 익명 클래스
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("달려!");
			}
		};
		
		//스레드를 시작시킨다.
		new Thread(r1).start();
		new Thread(r1).start();
		new Thread(r1).start();
		
		//아래의 경우는 스레드를 1번 밖에 실행할 수 없다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("고고!");
			}
		}).start();
	}
}
