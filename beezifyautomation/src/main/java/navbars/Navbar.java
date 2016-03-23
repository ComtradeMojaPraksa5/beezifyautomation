package navbars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import functions.Common;
import ids.BaseIDs;

public class Navbar {
	private final WebDriver driver;
	private List<WebElement> dropmenuItems;
	private Common common;
	
	public Navbar(WebDriver driver){
		this.driver = driver;
		common = new Common(driver);
	}
	
	/**
	 * Opens "Quick actions" menu
	 * @return WebsiteTray
	 */
	public final Navbar openQuickActionsMenu(){
		common.safeFindElement(By.cssSelector(BaseIDs.BTN_QUICKACTIONS_CSS.get())).click();
		WebElement we = common.safeFindElement(By.cssSelector(BaseIDs.UL_QUICKACITIONS_DROPMENU_CSS.get()));
		WebElement dropmenu = we.findElement(By.className("dropdown-menu"));
		//pitati mentora
		//dropmenuItems.addAll(dropmenu.findElements(By.tagName("li")));
		return this;
	}
	
	/**
	 * @param index - item to retrieve; NOTE: starts from 1, not 0; use ACTUAL item index
	 * @return element in the list (WebElement)
	 */
	public final WebElement getMenuItem(int index){
		// NOT WORKING, DO NOT USE
		return null;
		//return dropmenuItems.get(index - 1);
	}
	
	public final WebElement openNotifications(){
		common.safeFindElement(By.cssSelector(BaseIDs.BTN_NOTIFICATION_CSS.get())).click();
		return common.safeFindElement(By.cssSelector(BaseIDs.DIV_NOTIFICATION_CSS.get()));
	}
	
	public final Navbar openUserInfo(){
		common.safeFindElement(By.id("avatar-dropdown")).click();
		return this;
	}
	
	/*
	 * TODO:
	 * 		- add QuickActions dropmenu getters
	 * 		- add UserInfo dropmenu getters
	 */
	
}
