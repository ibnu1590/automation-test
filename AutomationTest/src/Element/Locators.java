package Element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		driver.findElement(By.id("email")).sendKeys("ibnu1590@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("b1sm1ll4h");
		driver.findElement(By.name("login")).click();
		//using xpath span -> div -> copy full xpath
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div")).click();
		//Logout
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(), 'Keluar')]")).click();
		
		//implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//		driver.findElement(By.className("signInBtn")).click();
//		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ibnu");
//		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ibnu@gmail.com");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ibnu2@gmail.com");
//		driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345678");
//		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
//		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.id("chkboxOne")).click();
//		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
	}

}
