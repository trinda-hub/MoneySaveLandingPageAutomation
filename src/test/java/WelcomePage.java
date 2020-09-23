import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {
    //
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public WelcomePage(WebDriver driver) {super(driver);}

    //fungsi untuk redirect ke slider ke-2 yaitu Selamat Datang Page
    public static void redirectToWelcomePage(){
        click(locators.SLIDER_KE_DUA);
        isVisible(locators.TITLE_SELAMAT_DATANG_PAGE);
    }

}
