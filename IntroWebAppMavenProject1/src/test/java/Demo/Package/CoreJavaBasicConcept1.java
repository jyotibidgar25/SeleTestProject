package Demo.Package;

public class CoreJavaBasicConcept1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		String myString = "Hello World!!!";
		char charN= 'd';
        double floatDT = 5.99;
        boolean booleanValue = true;
        
        System.out.println("All data types .."+myString);
        
        //Initialize Arrays 
        int[] arr = new int[5];
        arr[0] = 111;
        arr[1] = 8;
        System.out.println(arr[0]);
        
		int[] arr2 = {5,8,9,10,15};
		//For loop
		for(int i=0;i<arr2.length;i++) {
			//  System.out.println("Arr2 Values === "+arr2[i]);
		}
		
		String[] name = {"jyoti","Durva","Omkar","Pandhare"};
//		for(int i=0;i<name.length;i++) {
//			  System.out.println("Name Values === "+name[i]);
//		}
		
		for(String s: name) {
			 System.out.println("Print S Value === "+s);
		}
	}

}
