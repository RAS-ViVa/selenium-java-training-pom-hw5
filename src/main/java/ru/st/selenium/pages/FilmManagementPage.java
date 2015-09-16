package ru.st.selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FilmManagementPage extends InternalPage {

	public FilmManagementPage(PageManager pages) {
		super(pages);
	}
	
	@FindBy(css = "nav a[href $= '?go=delete']")
	private WebElement buttonDelete;
	

 
  public FilmManagementPage ensurePageLoaded() {
    super.ensurePageLoaded();
    wait.until(presenceOfElementLocated(By.cssSelector("div.content")));
//    wait.until(presenceOfElementLocated(By.cssSelector("div.content h3")));
    return this;
  }
  
  @FindBy(css = "nav a[onclick $= '?logout']")
  private WebElement logoutLink1;
  
  public LoginPage clickLogoutLink1() {
	    logoutLink1.click();
	    wait.until(alertIsPresent()).accept();
	    return pages.loginPage;
  }
}
