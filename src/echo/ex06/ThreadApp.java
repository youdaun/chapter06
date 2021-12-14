package echo.ex06;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new DigitImpl());
		Thread thread2 = new Thread(new LowerImpl());
		Thread thread3 = new Thread(new UpperImpl());
		
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
