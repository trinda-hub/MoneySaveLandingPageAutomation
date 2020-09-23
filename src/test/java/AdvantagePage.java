import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;

public class AdvantagePage extends BasePage {
    //
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public AdvantagePage(WebDriver driver) {super(driver);}

    //fungsi untuk redirect ke slider ke-3 yaitu Keuntungan Page
    public static void redirectToAdvantagePage(){
        click(locators.SLIDER_KE_TIGA);
        isVisible(locators.TITLE_KEUNTUNGAN_PAGE);
    }
}
