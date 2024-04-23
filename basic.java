package newjava.com;

public class basic {
	public basic(){
		System.out.println("object created");
		
//	naga jyothi
	}
	
	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		basic b = new basic();
        System.out.println(b.add(10,20));
	}
 
	public int add (int a, int b) {
	
		int c = a + b;
		return c;
	}
	
	
} 