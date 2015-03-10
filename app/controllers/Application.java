package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.StudentsParents;
import views.html.FacultyStaff;
import views.html.AlumniFriends;
import views.html.Contact;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns the Students/Parents page.
   * @return The resulting Students/Parents page.
   *
   */
  public static Result studentsParents() {
    return ok(StudentsParents.render("Students/Parents"));
  }


  /**
   * Returns the Faculty/Staff page.
   * @return The resulting Faculty/Staff page.
   *
   */
  public static Result facultyStaff() {
    return ok(FacultyStaff.render("Faculty/Staff"));
  }

  /**
   * Returns the Alumni/Friends page.
   * @return The resulting Alumni/Friendspage.
   *
   */
  public static Result alumniFriends() {
    return ok(AlumniFriends.render("Alumni/Friends"));
  }

  /**
   * Returns the Contact page.
   * @return The resulting Contact page.
   *
   */
  public static Result contact() {
    return ok(Contact.render("Contact"));
  }
}
