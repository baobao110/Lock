
public class C implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		synchronized (Myobject.b) {
			System.out.println("Cb�ȱ���");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (Myobject.a) {
				System.out.println("Ca����");
			}
			
		}
	}
}
