package ru.st.selenium;

import org.testng.annotations.*;
import static org.junit.Assert.*;

import ru.st.selenium.model.Film;
import ru.st.selenium.model.User;



public class CreateFilmNotTest extends ru.st.selenium.pages.TestBase{

	@BeforeMethod
	public void mayBeLogout() {
	  if (app.getUserHelper().isNotLoggedIn()) {
	    return;
	  }
	  app.getUserHelper().logout();
	}

	@Test
	public void testCreateFilmNegative() throws Exception {
		Film film = new Film()
			   .setTitle("")
			   .setYear("2015")
			   .setNotes("My favorit metod");
		  	  
		app.getUserHelper().loginAs(ADMIN);
		  
		app.getFilmHelper().create(film);	  
		assertTrue(app.getFilmHelper().isFilmNotCreated());
		  
	}
		
}
