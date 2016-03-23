package pages;

import org.openqa.selenium.WebDriver;

import functions.Common;

public abstract class BasePage {
	protected WebDriver driver;
	protected Common common;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		common = new Common(driver);
	}
	
	public final String getTitle(){
		return driver.getTitle();
	}
}
