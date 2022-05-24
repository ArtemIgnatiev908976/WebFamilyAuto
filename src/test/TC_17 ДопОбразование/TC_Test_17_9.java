


import TC_17.TC_17_9;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_17_9 {


    WebDriver driver;
    LoginDiary login;
    TC_17_9 tc_17_9;

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
    public void TC_Test_17_9() throws InterruptedException {

        System.out.println("Проверка кейса TC_D_17_9  https://jira.mos.social/browse/EDW-1240");
        login = new LoginDiary(driver);
        tc_17_9 = new TC_17_9(driver);
        login.loginDiary("", "");
        tc_17_9

                .typeSettingsButton()
                .typeHideSettings()
        ;
        driver.quit();
    }

}





