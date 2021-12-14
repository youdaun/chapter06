package echo.ex04;

public class UpperThread extends Thread {

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
