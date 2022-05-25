

import TC_3.TC_3_1;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TC_Test_3_1 {
    WebDriver driver;
    LoginDiary login;
    TC_3_1 tc_3_1;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_3_1() {

        System.out.println("Проверка кейса TC_D_3_1 https://jira.edu.mos.ru/browse/EDW-271  ");
        login = new LoginDiary(driver);
        tc_3_1 = new TC_3_1(driver);
        Actions actions = new Actions(driver);

        login.loginDiary("", "");
        tc_3_1

                .typeLinkEvent()
                .typeNews()
                .typeNameNews()
                .typeBack()
                .typeZagNews()
                .typeTextNews()
        ;

        driver.quit();
    }
}
