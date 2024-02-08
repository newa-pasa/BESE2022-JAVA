public class AsyncUDPServer implements Runnable
{  
	public void run(){  
		System.out.println("thread is running...");  
	}
	public static void main(String args[]){  
		AsyncUDPServer m1=new AsyncUDPServer();  
		Thread t1 =new Thread(m1);  
		t1.start();  
	}  
}  