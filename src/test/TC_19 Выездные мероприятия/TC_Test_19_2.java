


import TC_19.TC_19_2;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_19_2 {


    WebDriver driver;
    LoginDiary login;
    TC_19_2 tc_19_2;

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
    public void TC_Test_19_2() throws InterruptedException {

        System.out.println("Проверка кейса TC_D_19_2  https://jira.mos.social/browse/EDW-1374 ");
        login = new LoginDiary(driver);
        tc_19_2 = new TC_19_2(driver);
        login.loginDiary("", "");
        driver.get("https://dnevnik-dev-k8s.mos.ru/diary/account/application/");


        tc_19_2
                .typeNameBlockConsent()
                .typeIconAllChildren()
                .typeIconChildren()
                .typeTabAll()
                .typeTabVaccination()
                .typeTabEvent()
                .typeTabAllClick()
                .typeBlockByEvent()
                .typeBackButton()
                .typeArchiveButton()
                .typeLoadStillButton()
                .typeIconChildren2();
        Thread.sleep(1000);
        tc_19_2
                .typeNameEvent();
        Thread.sleep(1000);
        tc_19_2
                .typeSettingsButton()
                .typeSelectorAllStatus()
                .typeSelectorYesOrNo()
                .typeSelectorYes()
                .typeSelectorNo()
        ;




        driver.quit();


    }




}





