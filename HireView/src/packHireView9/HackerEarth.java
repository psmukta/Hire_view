package packHireView9;

public class HackerEarth {

	public static void main(String[] args) {
		
		HackerEarth HE=new HackerEarth();
		HE.start();
	}
	private void start() {
		System.out.println(check("12345"));
		System.out.println(check("123456"));
		System.out.println(check(null));
	}
	
	private boolean check(String aString) {
		
		try {
			return aString.length()>5;
		}
		catch(NullPointerException e){
			
		System.out.println("exceptions occured");	
		return false;
		}
		
	}

}
