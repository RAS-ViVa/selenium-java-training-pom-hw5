package ru.st.selenium;

import org.testng.annotations.*;
import static org.junit.Assert.*;
//import org.openqa.selenium.*;

import ru.st.selenium.model.Film;
import ru.st.selenium.model.User;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Window.*;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver.RemoteWebDriverOptions;
//import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.*;
//import org.openqa.selenium.remote.RemoteWebDriver.RemoteWebDriverOptions.*;
import org.openqa.selenium.support.ui.Select;




public class CreateFilmTest extends ru.st.selenium.pages.TestBase{

//  @BeforeMethod
//  public void mayBeLogout() {
//	if (app.getUserHelper().isNotLoggedIn()) {
//	  return;
//	}
//	app.getUserHelper().logout();
//  }

	
  @Test(priority=1)
  public void testCreateFilmPositive() throws Exception {
	Film film = new Film()
	  .setTitle("0 PageObjectModel")
	  .setYear("2015")
	  .setNotes("My favorit metod");
	    	  
	app.getUserHelper().loginAs(ADMIN);
//		assertTrue(app.getUserHelper().isLoggedInAs(user));
	    
	app.getFilmHelper().create(film);	 
		  
	assertTrue(app.getFilmHelper().isFilmCreatedOk());
//	app.getFilmHelper().logout();
		
  }		
/*	
  @Test(priority=2)
  public void testCreateFilmNegative() throws Exception {
	Film film = new Film()
		.setTitle("")
		.setYear("2015")
		.setNotes("My favorit metod");
		  	  
	app.getUserHelper().loginAs(ADMIN);
		  
	app.getFilmHelper().create(film);	  
	//assertTrue(app.getFilmHelper().isFilmNotCreated());

		  
	} 
*/
}
