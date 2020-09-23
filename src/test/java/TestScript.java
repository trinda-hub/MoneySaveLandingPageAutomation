import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestScript {
    static Locators locators = new Locators();
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", TestData.CHROME_PATH);
        driver.get(TestData.BASE_URL);
        driver.manage().window().setSize(new Dimension(1366, 768));
    }
//    @AfterSuite
//    public static void tearDown(){
//        driver.manage().deleteAllCookies();
//        driver.quit();
//    }
    @Test(testName = "Redirect to page success")
    public static void testRedirectSuccessful(){
        /*
        Test case untuk redirect sukses
         */
        HomePage homePage = new HomePage(driver);

        // Step 1 - Click Slider 1
        homePage.redirectHomePageSuccess();

        // Step 2 - Assertion
        String element_text = homePage.getText(locators.TITLE_HOME_PAGE);
        Assert.assertEquals(element_text, "Transaksi Mudah Tanpa Gundah");

        //
        WelcomePage welcomePage = new WelcomePage(driver);
        // Step 3 - Click slider ke 2
        welcomePage.redirectToWelcomePage();

        // Step 4 - Assertion
        String element_text1 = welcomePage.getText(locators.TITLE_SELAMAT_DATANG_PAGE);
        Assert.assertEquals(element_text1, "Selamat Datang di MoneySave");

        //
        AdvantagePage advantagePage = new AdvantagePage(driver);
        // Step  - Click Slider ke 3
        advantagePage.redirectToAdvantagePage();
        // Step  - Assertion
        String element_text2 = advantagePage.getText(locators.TITLE_KEUNTUNGAN_PAGE);
        Assert.assertEquals(element_text2, "Keuntungan Menggunakan MoneySave");


    }
}
