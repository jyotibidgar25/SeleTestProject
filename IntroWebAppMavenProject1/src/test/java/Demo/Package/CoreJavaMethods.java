package Demo.Package;

public class CoreJavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoreJavaMethods d = new CoreJavaMethods();
		String name2 = d.getData1();
		System.out.println(name2);
		
		getData();
//		String name = getData();
//		System.out.println(name);

		CoreJavaMethod2 d1 = new CoreJavaMethod2();
		String name1 = d1.getUserData();
		System.out.println(name1);
	}
    public static String getData() {
    	System.out.println("Welcome My World!!!!");
    	return "Jyoti Bidgar !!!!";
    }
    
    public String getData1() {
    	System.out.println("Welcome My World34555!!!!");
    	return "Jyoti Bidgar3455 !!!!";
    }

}
