package Demo.Package;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello World....!!!!");

		//Chromedriver.exe -- Chrome Browser
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\JyotiBidgar\\OneDrive - Dynamisch\\Documents\\Selenuimweb Driver\\chromedriver-win64\\chromedriver.exe");

		//Webdriver.chrome.drover -- value of path
		// WebDriver driver = new ChromeDriver();

		//Firefox launch
		//geckodriver
		//webdriver.gecko.driver
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\JyotiBidgar\\OneDrive - Dynamisch\\Documents\\Selenuimweb Driver\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		//Microsoft Edge 
		System.setProperty("webdriver.edge.driver","C:\\Users\\JyotiBidgar\\OneDrive - Dynamisch\\Documents\\Selenuimweb Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		//Chrome launch
		//driver.navigate().to("https://rahulshettyacademy.com/");
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();  //Maximize the current Window
		
		//Get Title of URL
		System.out.println(driver.getTitle());
		
		//Get Current URL of Website
		System.out.println(driver.getCurrentUrl());
		
		//Wait for 5sec
		Thread.sleep(5000);
		// driver.close();
	}

}
