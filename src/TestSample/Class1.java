package TestSample;
import org.testng.annotations.Test;

public class Class1 {
	@Test	
   public void TSa() {
	   System.out.println("Hello World......");
   }
	@Test
	public void login() {
		System.out.println("I am inside the Login form...");
		
	}
	@Test
	public void search() {
		System.out.println("I am inside the Search...");
	}
	@Test
	public void logout() {
		System.out.println("I am inside the Logout form...");
	}
}
