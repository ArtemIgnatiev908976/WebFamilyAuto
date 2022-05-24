


import TC_17.TC_17_3;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_17_3 {


    WebDriver driver;
    LoginDiaryStudent login;
    TC_17_3 tc_17_3;

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
    public void TC_Test_17_3() throws InterruptedException {

        System.out.println("Проверка кейса TC_D_17_3  https://jira.mos.social/browse/EDW-1233 ");
        login = new LoginDiaryStudent(driver);
        tc_17_3 = new TC_17_3(driver);
        login.loginDiaryStudent("", "");
        tc_17_3

                .typeAllDopGroups()
                .typeBlockByDopGroups()
                .typeSettingsDopGroups()
                .typeNoCorrectShedule()
                .typePushNoCorrectSheduleModal()
        ;
        driver.quit();
    }

}





