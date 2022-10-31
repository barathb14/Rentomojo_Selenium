package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;

public class SelectCity {
	WebDriver driver;
	
	public SelectCity(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	@FindBy(xpath="//*[@id='citySelector']/li[1]")
	
	WebElement city;
	
	
	public void SelectCityAction() {
		
		city.click();
	}
}
