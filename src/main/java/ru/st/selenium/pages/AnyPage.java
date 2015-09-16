package ru.st.selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AnyPage extends Page {

	public AnyPage(PageManager pages) {
		super(pages);
	}
	  @FindBy(css = "nav a[href $= '?go=profile']")
	  private WebElement userProfileLink;

	  @FindBy(css = "nav a[href $= '?go=users']")
	  private WebElement userManagementLink;

	  @FindBy(css = "nav a[onclick $= '?logout']")
	  private WebElement logoutLink;
	  
	  
	  public UserProfilePage clickUserProfilePage() {
	    userProfileLink.click();
	    return pages.userProfilePage;
	  }

	  public UserManagementPage clickUserManagementLink() {
	    userManagementLink.click();
	    return pages.userManagementPage;
	  }
	  
	  public LoginPage clickLogoutLink() {
	    logoutLink.click();
	    wait.until(alertIsPresent()).accept();
	    return pages.loginPage;
	  }
	  
}
