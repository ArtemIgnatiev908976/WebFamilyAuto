


import TC_17.TC_17_4;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_17_4 {


    WebDriver driver;
    LoginDiary login;
    TC_17_4 tc_17_4;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();

    }


    @Test
    public void TC_Test_17_4() throws InterruptedException {

        System.out.println("Проверка кейса TC_D_17_4  https://jira.mos.social/browse/EDW-1234 ");
        login = new LoginDiary(driver);
        tc_17_4 = new TC_17_4(driver);
        login.loginDiary("", "");
        tc_17_4

                .typeAllDopGroups()
                .typeBlockByDopGroups()
                .typeSettingsDopGroups()
                .typeNoCorrectShedule()
                .typePushNoCorrectSheduleModal()
        ;
        driver.quit();
    }

}





