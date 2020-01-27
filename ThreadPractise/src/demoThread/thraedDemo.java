package demoThread;
class MultithreadingDemo extends Thread{
	public void run()
	{
		try {
			System.out.println("Thread- " + Thread.currentThread().getName() + " is running" ); 
			
		} catch (Exception e) {
			
			System.out.println("Exception is caught");
			
		}
	}
}

public class thraedDemo {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
				MultithreadingDemo object = new MultithreadingDemo();         
		        object.start();
        }
		
	}

}
