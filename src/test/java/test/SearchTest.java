package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.SelectCity;
import pages.Login;
import pages.Search;

public class SearchTest {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\bb\\drivers\\chromedriver102win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		Search searchPg= PageFactory.initElements(driver, Search.class);
		searchPg.searchAction("bed");
		driver.navigate().to("https://www.rentomojo.com");
//		driver.quit();

	}

}
