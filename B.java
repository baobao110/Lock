
public class B implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (Myobject.a) {
			System.out.println("Ba�ȱ���");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (Myobject.b) {
				System.out.println("Bb����");
			}
			
		}
	}

}
