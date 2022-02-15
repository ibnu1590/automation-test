package Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {

	public static void main(String[] args) {
		
		//Chrome
//		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		//Edge
		System.setProperty("webdriver.edge.driver", "D:\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//Code
		driver.get("https://facebook.com");
		System.out.println("Title => " + driver.getTitle());
		System.out.println("Current URL => " + driver.getCurrentUrl());
		driver.close();
	}

}
