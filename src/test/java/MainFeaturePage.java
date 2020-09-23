import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;

public class MainFeaturePage extends BasePage {
    //
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public MainFeaturePage(WebDriver driver) {super(driver);}

    //fungsi untuk redirect ke slider ke-4 yaitu Fitur Utama Page
    public static void redirectToMainFeaturePage(){
        click(locators.SLIDER_KE_EMPAT);
        isVisible(locators.TITLE_FITUR_UTAMA_PAGE);
    }
    public static void moveToTabMenu(){
        click(locators.TAB_MENU_PENGELUARAN);
        click(locators.TAB_MENU_TABUNGAN);
    }
}
