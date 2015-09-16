package ru.st.selenium.applogic2;

import java.util.List;

import ru.st.selenium.applogic.FilmHelper;
import ru.st.selenium.model.Film;
import ru.st.selenium.pages.FilmAddPage;
import ru.st.selenium.pages.FilmManagementPage;
import ru.st.selenium.pages.Page;

public class FilmHelper2 extends DriverBasedHelper implements FilmHelper {

  public FilmHelper2(ApplicationManager2 manager) {
    super(manager.getWebDriver());
  }

  @Override
  public void create(Film film) {
    pages.internalPage
    	.clickAddFilmLink().ensurePageLoaded()
    	.setFilmNameField(film.getTitle())
    	.setYear(film.getYear())
    	.setNote(film.getNotes())
    	.clickSubmitButton();  
  }

  @Override
  public void logout() {
    pages.filmManagementPage.ensurePageLoaded()
      .clickLogoutLink();
  }
  
  @Override
  public boolean isFilmCreatedOk() {
	  return pages.filmManagementPage.waitPageLoaded();
  }
  
  @Override
  public boolean isFilmNotCreated() {
	  return pages.filmAddPage.waitPageLoaded();
  }
  
  @Override
  public void delete(Film film) {
    // TODO Auto-generated method stub

  }

  @Override
  public List<Film> search(String title) {
    // TODO Auto-generated method stub
    return null;
  }

}
