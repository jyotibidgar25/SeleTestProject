package Demo.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.out.println("Hello World....!!!!");
       System.setProperty("webdriver.chrome.driver","C:\\Users\\JyotiBidgar\\OneDrive - Dynamisch\\Documents\\Selenuimweb Driver\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.navigate().to("https://rahulshettyacademy.com/");
       driver.manage().window().maximize();
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      Thread.sleep(5000);
      driver.close();
	}

}
