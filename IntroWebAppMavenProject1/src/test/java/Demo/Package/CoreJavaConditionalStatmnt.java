package Demo.Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaConditionalStatmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = {5,8,9,10,15,12,11,16,121};
		//For loop
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]%2 == 0) {
				
//			 System.out.println("Even Values === "+arr2[i]);
			}	
//			}else {
//				 System.out.println("Odd Values === "+arr2[i]);
//			}
		}
		ArrayList<String> a = new ArrayList<String>();
		// Create object of the Class --- object.method
		a.add("Jyoti");
		a.add("Deepak");
		a.add("Vivek");
		a.add("Omkar");
		//System.out.println("Before Remove : " +a.get(2));
//		a.remove(2);
//		System.out.println("After Remove : " +a);
		for(int i=0;i<a.size();i++) {
			System.out.println("ArrayList Value : " +a.get(i));
		}
		
		//enhanced loop
		for(String s:a) {
			System.out.println("Enhanced ArrayList Value : " +s);
		}
		
		//Item present in ArrayList or not
		System.out.println(a.contains("Sonu"));
		
		String[] name = {"Selenium","Java","Python"};
		List<String> arrayList = Arrays.asList(name);
		System.out.println(arrayList.contains("Selenium"));
		
//		if(a.contains("Snehal")) {
//			System.out.println("Enhanced ArrayList Value :");
//		}
	}

}
