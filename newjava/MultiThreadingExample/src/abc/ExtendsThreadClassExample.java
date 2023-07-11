package abc;

class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=1000;i++) {
			System.out.println("i "+i);
		}
	}
}
class B extends Thread{
	@Override
	public void run() {
		for(int j=0;j<=1000;j++) {
			System.out.println("j "+j);
		}
	}
}

public class ExtendsThreadClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.start(); //ready to run - runnable state
		obj2.start();
		

	}

}
