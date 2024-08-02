package Demo.Package;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class WebEleentLocators {

	//static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 // Update the path to your chromedriver.exe file
      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\JyotiBidgar\\OneDrive - Dynamisch\\Documents\\Selenuimweb Driver\\chromedriver-win64\\chromedriver.exe");
      //  WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver,edge,driver", "C:\\Users\\JyotiBidgar\\OneDrive - Dynamisch\\Documents\\Selenuimweb Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

        // Use implicit wait for dynamic elements (optional, adjust timeout if needed)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize(); 


        // Consider using a more robust locator (inspect the element on the page)
        driver.findElement(By.id("visitUsTwo")).click();

        Thread.sleep(5000);

      //  driver.quit();
		
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JyotiBidgar\\OneDrive - Dynamisch\\Documents\\Selenuimweb Driver\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.manage().window().maximize();
//		// https://rahulshettyacademy.com/locatorspractice/
//		Thread.sleep(5000);
//		driver.findElement(By.id("visitUsTwo")).click();

	}

}
