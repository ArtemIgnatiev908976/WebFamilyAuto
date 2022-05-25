

import TC_3.TC_3_3;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TC_Test_3_3 {
    WebDriver driver;
    LoginDiaryStudent login;
    TC_3_3 tc_3_3;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_3_3() throws InterruptedException {

        System.out.println("Проверка кейса TC_D_3_3 https://jira.edu.mos.ru/browse/EDW-273 ");
        login = new LoginDiaryStudent(driver);
        tc_3_3 = new TC_3_3(driver);
        Actions actions = new Actions(driver);

        login.loginDiaryStudent("", "");
        tc_3_3
                .typeLinkEvent();

        Thread.sleep(2000);
        tc_3_3
                .typeEvent()
                .typeBackEvent()
                .typeNameEvent()
                .typeTextEvent()
                .typeDateAndTimeEvent()
        ;

        driver.quit();
    }
}
