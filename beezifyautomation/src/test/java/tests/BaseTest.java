package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import functions.Common;
import ids.BaseIDs;
import navbars.Navbar;

public abstract class BaseTest {
	protected WebDriver driver;
	protected Common common;
	protected Navbar tray;
	private boolean automaticLoginEnabled = true;
	
	/**
	 * @param enabled - enable or disable automatic login while starting test
	 */
	public final void enableAutomaticLogin(boolean enabled){
		this.automaticLoginEnabled = enabled;
	}
	
	private final void Login(){
		common.safeFindElement(By.id("login")).sendKeys(BaseIDs.LOGIN_USERNAME.get());
		common.safeFindElement(By.id("password")).sendKeys(BaseIDs.LOGIN_PASSWORD.get());
		common.safeFindElement(By.id("domain")).sendKeys(BaseIDs.LOGIN_DOMAIN.get());
		// Demonstracije i provjere radi
		common.safeFindElement(By.id(BaseIDs.BTN_SIGN_IN_ID.get())).click();
	}
	
	@BeforeSuite
	public final void SetUp(){
		// Otvara browser
		driver = new FirefoxDriver();
		//maksimizira prozor
		driver.manage().window().maximize();
		//Ucitava stranicu
		driver.get(BaseIDs.BASE_URL.get());
		// Instanciramo nase metode
		common = new Common(driver);
		//Logovanje
		if(automaticLoginEnabled) Login();
		tray = new Navbar(driver);
	}
	
	//@AfterSuite
	public final void TearDown(){
		//Zatvara browser
		driver.quit();
	}
}
