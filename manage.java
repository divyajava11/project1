package project;

public class Test1 {
	
	public static void main(String[] args) {
		
		Utext utext = new Utext() {
			@Override
			public void manage() {

				System.out.println("manage");
				
			}
			
			@Override
			public int count() {

				
				return 15;
			}
		};
		utext.manage();
		
		int count = utext.count();
		System.out.println("Count  = " + count);
		
	}

}