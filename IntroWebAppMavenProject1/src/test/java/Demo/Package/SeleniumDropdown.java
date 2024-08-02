package Demo.Package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	  System.setProperty("webdriver.chrome.driver","C:\\Users\\JyotiBidgar\\OneDrive - Dynamisch\\Documents\\Selenuimweb Driver\\chromedriver-win64\\chromedriver.exe");
//	  WebDriver driver = new ChromeDriver();
	  
	  System.setProperty("webdriver,edge,driver", "C:\\Users\\JyotiBidgar\\OneDrive - Dynamisch\\Documents\\Selenuimweb Driver\\msedgedriver.exe");
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.spicejet.com/");
	}

}
