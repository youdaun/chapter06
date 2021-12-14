package echo.ex06;

public class UpperImpl implements Runnable {

	public void run() {
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
