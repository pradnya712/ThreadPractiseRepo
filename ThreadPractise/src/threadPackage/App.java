package threadPackage;

class SomeThread extends Thread{
	public void run() {
		System.out.println(Math.random());
	}
}
   public class App {

	public static void main(String[] args) {
		System.out.println("Starting here\n");
		
		for(int i=0;i<5;i++) {
			System.out.println("printing on screen "+i );
		}
		Thread thread = new SomeThread();
		Thread thread2 = new SomeThread();
		System.out.println(thread.getName());
		thread.start();
		System.out.println(thread2.getName()+" "+thread2.getId());
		System.out.println("Ends here \n");
		
	}
	
}
   
   
  
