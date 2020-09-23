import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage extends BasePage {
    //
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public HomePage(WebDriver driver) {super(driver);}

    // Fungsi untuk redirect to Home Page
    public static void redirectHomePageSuccess(){
       // click(locators.HOME_NAVBAR);
        click(locators.SLIDER_KE_SATU);
        isVisible(locators.TITLE_HOME_PAGE);
    }
}
