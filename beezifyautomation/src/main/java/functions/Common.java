package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ids.CommonIDs;

/**
 * @author Tarik
 *	This is a class with 'basic'/smart functions
 *	P.S. Don't be a low-level programmer - Use us !
 *	NOTE:
 *		Parameter 'by', which is implemented in most of the functions,
 *		is used to identify elements (id, css, cssSelector, xpath ..)
 */
public class Common{
	//pitati mentora za ovo
	//private WebDriver augmentedDriver;
	private WebDriver driver;
	
	public Common(WebDriver driver){
		//augmentedDriver = new Augmenter().augment(driver);
		this.driver = driver;
	}
	
	/**
	 * @param by
	 * @return found element
	 * Method to properly find element
	 */
	public WebElement safeFindElement(By by){
		try{
			/*
			 * Give browser some time to load element properly
			 * time is specified in "CommonIDs" class under "TIMEOUT_PRESENCE" variable
			 */
			(new WebDriverWait(driver, CommonIDs.TIMEOUT_PRESENCE.get()))
			.until(ExpectedConditions.presenceOfElementLocated(by));
			
			/*
			 * If exception was not thrown by the function above,
			 * proceed finding element within the time specified in
			 * "CommonIDs" class under "TIMEOUT_VISIBLE" variable
			 */
			return (WebElement) (new WebDriverWait(driver, CommonIDs.TIMEOUT_VISIBLE.get()))
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
