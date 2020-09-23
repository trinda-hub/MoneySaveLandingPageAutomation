import org.openqa.selenium.By;

public class Locators {
    // --- Navbar Locators---
    final static By HOME_NAVBAR = By.cssSelector(".navbar-nav > a:nth-child(1)");
    final static By TENTANG_KAMI_NAVBAR = By.cssSelector(".navbar-nav > a:nth-child(2)");

    // ---Slider Pagination Locators ---
    final static By SLIDER_KE_SATU = By.cssSelector(".col > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)");
    final static By SLIDER_KE_DUA = By.cssSelector(".col > div:nth-child(2) > div:nth-child(2) > div:nth-child(1)");
    final static By SLIDER_KE_TIGA = By.cssSelector(".col > div:nth-child(2) > div:nth-child(3) > div:nth-child(1)");
    final static By SLIDER_KE_EMPAT = By.cssSelector(".col > div:nth-child(2) > div:nth-child(4) > div:nth-child(1)");
    final static By SLIDER_KE_LIMA = By.cssSelector(".col > div:nth-child(2) > div:nth-child(5) > div:nth-child(1)");
    final static By SLIDER_KE_ENAM = By.cssSelector(".col > div:nth-child(2) > div:nth-child(6) > div:nth-child(1)");

    // --- Fitur Home Locators
    final static By TITLE_HOME_PAGE = By.cssSelector(".promo-caption > h1:nth-child(1)");
    // --- Fitur Selamat Datang Locators
    final static By TITLE_SELAMAT_DATANG_PAGE = By.cssSelector(".top-content > div:nth-child(1) > h2:nth-child(1)");
    // --- Fitur Keuntungan Locators
    final static By TITLE_KEUNTUNGAN_PAGE = By.cssSelector(".benefit > div:nth-child(1) > h2:nth-child(1)");
    // --- Fitur Fitur Utama Locators
    final static By TITLE_FITUR_UTAMA_PAGE = By.cssSelector(".main-feature > div:nth-child(1) > h2:nth-child(1)");
    final static By TAB_MENU_MONITORING = By.id("feature-tab-tab-monitoring");
    final static By TAB_MENU_PENGELUARAN = By.id("feature-tab-tab-manage-spending");
    final static By TAB_MENU_TABUNGAN = By.id("feature-tab-tab-saving");
    // --- Fitur Keamanan Locators
    final static By TITLE_KEAMANAN_PAGE = By.cssSelector("div.caption:nth-child(1) > h2:nth-child(1)");
    // --- Fitur Link Playstore and Footer Locators
    final static By TITLE_DOWNLOAD_PAGE = By.cssSelector(".download-details > div:nth-child(2) > h2:nth-child(1)");
    final static By LINK_TO_INSTAGRAM = By.cssSelector(".instagram > img:nth-child(1)");
    final static By LINK_TO_FACEBOOK = By.cssSelector(".facebook > img:nth-child(1)");
    final static By LINK_TO_TWITTER = By.cssSelector(".teamwork > img:nth-child(1)");
}
