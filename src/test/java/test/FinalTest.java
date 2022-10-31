package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.SelectCity;
import pages.Login;
import pages.Search;
import pages.Category;
import pages.Item;
import pages.AddCart;

public class FinalTest {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\bb\\drivers\\chromedriver102win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rentomojo.com");
		driver.manage().window().maximize();
		
		SelectCity selectCityPg= PageFactory.initElements(driver, SelectCity.class);
		selectCityPg.SelectCityAction();
		
		Login loginPg= PageFactory.initElements(driver, Login.class);
		loginPg.loginAction("8667225215");
		
		Search searchPg= PageFactory.initElements(driver, Search.class);
		searchPg.searchAction("bed");
		driver.navigate().to("https://www.rentomojo.com");
		
		Category categoryPg= PageFactory.initElements(driver, Category.class);
		categoryPg.categoryAction();
		
		Item itemPg= PageFactory.initElements(driver, Item.class);
		itemPg.ItemAction();
		
		AddCart addPg= PageFactory.initElements(driver, AddCart.class);
		addPg.addAction();
		

	}

}
