package Demo.Package;

public class CoreJavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an Object
		String s = "Selenium Automation Training course";
		String s1 = "Selenium Automation Training";
		 String[] splittedString =  s1.split("Automation");
		 
		// System.out.println(splittedString[0]);
		 //System.out.println(splittedString[1]);
		// System.out.println(splittedString[1]);
		 //System.out.println(splittedString[1].trim());
		 
//		 for(int i=0; i<s.length();i++) {
//			 System.out.println(s.charAt(i));
//		 }
		
		 //Print in Reverse order 
		 System.out.println("Print Characters in Reverse Order : ");
		 for(int i=s.length()-1; i>=0;i--) {
			 System.out.println(s.charAt(i));
		 }
		//String s2 = new String("Welcome my World..");
       
	}

}
