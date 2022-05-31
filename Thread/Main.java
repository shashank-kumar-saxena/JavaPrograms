
class T extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print(i+" ");
			try{
			Thread.sleep(1000);
		}catch(Exception e)
		{
		    
		}
		}
		
	}
}
class E implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print(i+" ");
			try{
			Thread.sleep(1500);
		}catch(Exception e)
		{
		    
		}
		}
		
	}
}

class Main {
	public static void main(String[] args)
	{
		T t1=new T();
		t1.start();
		E e=new E();
		Thread t2=new Thread(e);
		t2.start();
		Thread t3=new Thread(new Runnable(){
		  public void run()
	        {
		for(int i=0;i<10;i++)
		{
			System.out.print(i+" ");
			try{
			Thread.sleep(1500);
		}catch(Exception e)
		{
		    
		}
		}
		
	}});
		    t3.start();
		
}
}


