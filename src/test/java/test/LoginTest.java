package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.SelectCity;
import pages.Login;

public class LoginTest {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\bb\\drivers\\chromedriver102win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rentomojo.com");
		driver.manage().window().maximize();
		
		Login loginPg= PageFactory.initElements(driver, Login.class);
		loginPg.loginAction("8667225215");
//		driver.quit();

	}

}
