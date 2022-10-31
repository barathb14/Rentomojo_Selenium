package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.SelectCity;

public class SelectCityTest {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\bb\\drivers\\chromedriver102win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rentomojo.com");
		driver.manage().window().maximize();
		
		SelectCity selectCityPg= PageFactory.initElements(driver, SelectCity.class);
		selectCityPg.SelectCityAction();
		

	}

}
