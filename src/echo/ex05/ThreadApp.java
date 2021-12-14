package echo.ex05;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(new DigitRunableImpl());
		
		thread.start();
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}

}
