

import TC_3.TC_3_2;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TC_Test_3_2 {
    WebDriver driver;
    LoginDiaryStudent login;
    TC_3_2 tc_3_2;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_3_2() {

        System.out.println("Проверка кейса TC_D_3_2 https://jira.edu.mos.ru/browse/EDW-272 ");
        login = new LoginDiaryStudent(driver);
        tc_3_2 = new TC_3_2(driver);
        Actions actions = new Actions(driver);

        login.loginDiaryStudent("", "");
        tc_3_2
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
