package ru.st.selenium.applogic0;

import ru.st.selenium.applogic.ApplicationManager;
import ru.st.selenium.applogic.FilmHelper;
import ru.st.selenium.applogic.UserHelper;

public class ApplicationManager0 implements ApplicationManager {

  UserHelper userHelper = new UserHelper0();
  FilmHelper filmHelper = new FilmHelper0();
  
  @Override
  public UserHelper getUserHelper() {
    return userHelper;
  }

  @Override
  public FilmHelper getFilmHelper() {
    return filmHelper;
  }

}