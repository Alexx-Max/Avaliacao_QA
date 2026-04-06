package automacao.test;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;

public abstract class BaseTest {
    protected static WebDriver driver;
    private static final String URL_BASE = "https://www.saucedemo.com/";
    private static final String CAMINHO_DRIVER = "C:/Users/AlexMax/Documents/intelij/avaliacao/src/Resource/chromedriver-win64/chromedriver.exe";


    @BeforeClass
    public static void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-features=PasswordLeakDetection");
        options.addArguments("--disable-features=AutofillServerCommunication");

        options.setExperimentalOption("prefs", Map.of(
                "credentials_enable_service", false,
                "profile.password_manager_enabled", false
        ));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }
    @AfterClass
    public static void finalizar(){
        driver.quit();
    }
}
