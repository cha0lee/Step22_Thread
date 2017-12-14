package test.main;
/*
 * Thread클래스를 따로 만들어 규정해 두면 호출 시 같은 작업밖에 수행할 수 없지만,
 * 익명 클래스를 만들어 쓰면 그때그때 상황에 맞는 필요한 작업을 수행할 수 있다. (1회성) 
 */
public class MainClass08 {
	public static void main(String[] args) {
		//스레드 시작시키기
		new Thread(new MyRunnable()).start();
		new Thread(new MyRunnable()).start();
		new Thread(new MyRunnable()).start();
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("새로운 Thread에 B작업 수행");
				
			}
		}).start();
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("새로운 Thread에 C작업 수행");
				
			}
		}).start();
		
	}
	
	static class MyRunnable implements Runnable{
		@Override
		public void run() {
			System.out.println("새로운 Thread에 A작업 수행");
			
		}
	}
}
