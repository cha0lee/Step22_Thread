package test.mypac;

public class AnotherThread extends Thread{
	//run() 메소드 재정의
	@Override
	public void run() {
		System.out.println("또다른 스레드가 시작되었습니다.");
		
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("또다른 스레드가 종료됩니다.");
	}

}
