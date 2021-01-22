package packHireView12;

public class Examp {
	
	public int a;
	private Examp() {
		this.a=10;
	}
	public void print() {
		System.out.println(a);
	}
	public static Examp set() {
		return new Examp();
		
	}

	public static void main(String[] args) {
		Examp ex = Examp.set();
		ex.print();
		

	}

}
