package test;

import org.junit.Test;
import play.twirl.api.Content;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;


/**
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 */
public class ApplicationTest {

  /**
   * Tests that 1+1 equals 2.
   */
  @Test
  public void simpleCheck() {
    int a = 1 + 1;
    assertThat(a).isEqualTo(2);
  }

  /**
   * Tests that the Index template renders correctly.
   */
  @Test
  public void renderIndexTemplate() {
    Content html = views.html.Index.render("Welcome to the home page.");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Welcome to Castle High School");
  }

  /**
   * Tests that the Students/Parents template renders correctly.
   */
  @Test
  public void renderStudentsParentsTemplate() {
    Content html = views.html.StudentsParents.render("Students/Parents");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Students/Parents");
  }

  /**
   * Tests that the Faculty/Staff template renders correctly.
   */
  @Test
  public void renderFacultyStaffTemplate() {
    Content html = views.html.FacultyStaff.render("Faculty/Staff");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Faculty/Staff");
  }

  /**
   * Tests that the Alumni/Friends template renders correctly.
   */
  @Test
  public void renderAlumniFriendsTemplate() {
    Content html = views.html.AlumniFriends.render("Alumni/Friends");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Alumni/Friends");
  }

  /**
   * Tests that the Contact template renders correctly.
   */
  @Test
  public void renderContactTemplate() {
    Content html = views.html.Contact.render("Contact");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Contact");
  }
}