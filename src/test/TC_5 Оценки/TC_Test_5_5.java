

import TC_5.TC_5_5;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_5_5 {


    WebDriver driver;
    LoginDiary login;
    TC_5_5 tc_5_5;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_Test_5_5() {

        System.out.println("Проверка кейса TC_D_5_5 https://jira.edu.mos.ru/browse/EDW-881");
        login = new LoginDiary(driver);
        tc_5_5 = new TC_5_5(driver);
        login.loginDiary("", "");
        tc_5_5

                .typeLinkMarks()
                .typeColorMark()
                .typeColorMarkYear()
                .typePeriodMarks()
                .typeYearMark()
        ;
        driver.quit();


    }
}