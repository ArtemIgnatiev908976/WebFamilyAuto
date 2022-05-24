


import TC_17.TC_17_8;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_17_8 {


    WebDriver driver;
    LoginDiary login;
    TC_17_8 tc_17_8;

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
    public void TC_Test_17_8() throws InterruptedException {

        System.out.println("Проверка кейса TC_D_17_8  https://jira.mos.social/browse/EDW-1238");
        login = new LoginDiary(driver);
        tc_17_8 = new TC_17_8(driver);
        login.loginDiary("", "");
        tc_17_8

                .typeAllDopGroups()
                .typeBlockByDopGroups();
        Thread.sleep(1000);
        tc_17_8
                .typeSettingsDopGroups();
        Thread.sleep(1000);
        tc_17_8
                .typeNeverVisit();
        Thread.sleep(1000);
        tc_17_8
                .typePushNotVisitModal()
        ;
        driver.quit();
    }

}





