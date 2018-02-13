
public class D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a=new B();
		C b=new C();
		new Thread(a).start();
		new Thread(b).start();
		
	}

}
