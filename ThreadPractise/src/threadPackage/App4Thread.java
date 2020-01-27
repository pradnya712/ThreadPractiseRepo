package threadPackage;
class Vehicle{
	
   }

    public class App4Thread extends Vehicle implements Runnable {

	@Override
    public void run() {
		
		System.out.println(Thread.currentThread().getName()+" "+Math.random());
			}
	
	public static void main(String[] args) {
		System.out.println("Strating");
		
		for(int i =0;i<5;i++) {
			Runnable r = new App4Thread();
			Thread thread = new Thread(r);
			thread.start();
			}
		
		
		System.out.println("Ending...");
	}
}
