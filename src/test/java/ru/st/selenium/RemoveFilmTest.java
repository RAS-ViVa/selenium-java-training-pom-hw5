package ru.st.selenium;

import org.testng.annotations.*;
import static org.junit.Assert.*;

import ru.st.selenium.model.Film;
import ru.st.selenium.model.User;



public class RemoveFilmTest extends ru.st.selenium.pages.TestBase{

	@BeforeMethod
	public void mayBeLogout() {
	  if (app.getUserHelper().isNotLoggedIn()) {
	    return;
	  }
	  app.getUserHelper().logout();
	}

	
	@Test
	public void testCreateFilmPositive() throws Exception {
		Film film = new Film()
		    .setTitle("0 PageObjectModel")
		    .setYear("2015")
		    .setNotes("My favorit metod");
	    	  
		app.getUserHelper().loginAs(ADMIN);
//		assertTrue(app.getUserHelper().isLoggedInAs(user));
	    
		app.getFilmHelper().create(film);	 
		  
		assertTrue(app.getFilmHelper().isFilmCreatedOk());
//		app.getUserHelper().logout();
		
	}		
}
