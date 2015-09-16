package ru.st.selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FilmAddPage extends InternalPage {

	public FilmAddPage(PageManager pages) {
		super(pages);
	}
	
	@FindBy(name = "name")
	private WebElement filmnameField;
	
  @FindBy(name = "year")
  private WebElement yearField;
  
  @FindBy(name = "notes")
  private WebElement notesField;
  
  @FindBy(name = "submit")
  private WebElement submitButton;
  
//  private Select permissionDropdown() {
//    return new Select(driver.findElement(By.name("permission")));
//  }
  
  public String getFilmName() {
    return filmnameField.getAttribute("value");
  }

  public String getYear() {
    return yearField.getAttribute("value");
  }

  public String getDuration() {
	    return notesField.getAttribute("value");
  }
  
  public FilmAddPage setFilmNameField(String text) {
    filmnameField.sendKeys(text);
    return this;
  }

  public FilmAddPage setYear(String text) {
	yearField.sendKeys(text);
    return this;
  }

  public FilmAddPage setNote(String text) {
    notesField.sendKeys(text);
    return this;
  }

  public FilmAddPage clickSubmitButton() {
	submitButton.click();
	return this;
  }
  
//  public String getRole() {
//   return permissionDropdown().getFirstSelectedOption().getText();
//  }

  public FilmAddPage ensurePageLoaded() {
    super.ensurePageLoaded();
    wait.until(presenceOfElementLocated(By.className("addmovie")));
    return this;
  }
}
