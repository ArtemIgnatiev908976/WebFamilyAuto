


import TC_17.TC_17_1;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_17_1 {


    WebDriver driver;
    LoginDiary login;
    TC_17_1 tc_17_1;

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
    public void TC_Test_17_1() throws InterruptedException {

        System.out.println("Проверка кейса TC_D_17_1  https://jira.mos.social/browse/EDW-1231 ");
        login = new LoginDiary(driver);
        tc_17_1 = new TC_17_1(driver);
        login.loginDiary("", "");
        tc_17_1

                .typeAllDopGroups() ;
                Thread.sleep(1000);
        tc_17_1
                .typeBlockByDopGroups();
        Thread.sleep(1000);
        tc_17_1
                .typeSettingsDopGroups();
        Thread.sleep(1000);
        tc_17_1
                .typeHideGroup();
        Thread.sleep(1000);
        tc_17_1
                .typeHideGroupsModal();
        Thread.sleep(1000);
        tc_17_1
                .typeSettingsButton();
        Thread.sleep(1000);
        tc_17_1
                .typeShowHideSettings();
        Thread.sleep(1000);

        tc_17_1
                .typeLowerGroup();
        Thread.sleep(1000);
        tc_17_1
                .typeSettingsDopGroups();
        Thread.sleep(1000);
        tc_17_1
                .typeGreyOpacity();
        Thread.sleep(1000);
        tc_17_1
                .typeShowGroup();
        Thread.sleep(1000);
        tc_17_1
                .typeShowGroupsModal();
        Thread.sleep(1000);



        driver.quit();


    }




}





