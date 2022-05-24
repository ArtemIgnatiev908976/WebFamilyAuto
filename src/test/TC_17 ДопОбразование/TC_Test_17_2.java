


import TC_17.TC_17_2;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_17_2 {


    WebDriver driver;
    LoginDiaryStudent login;
    TC_17_2 tc_17_2;

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
    public void TC_Test_17_2() throws InterruptedException {

        System.out.println("Проверка кейса TC_D_17_2  https://jira.mos.social/browse/EDW-1232 ");
        login = new LoginDiaryStudent(driver);
        tc_17_2 = new TC_17_2(driver);
        login.loginDiaryStudent("", "");
        tc_17_2

                .typeAllDopGroups();
        Thread.sleep(1000);
        tc_17_2
                .typeBlockByDopGroups();
        Thread.sleep(1000);
        tc_17_2
                .typeSettingsDopGroups();
        Thread.sleep(1000);
        tc_17_2
                .typeHideGroup();
        Thread.sleep(1000);
        tc_17_2
                .typeHideGroupsModal();
        Thread.sleep(1000);
        tc_17_2
                .typeSettingsButton();
        Thread.sleep(1000);
        tc_17_2
                .typeShowHideSettings();
        Thread.sleep(1000);
        tc_17_2
                .typeLowerGroup();
        Thread.sleep(1000);
        tc_17_2
                .typeSettingsDopGroups();
        Thread.sleep(1000);
        tc_17_2
                .typeGreyOpacity();
        Thread.sleep(1000);
        tc_17_2
                .typeShowGroup();
        Thread.sleep(1000);
        tc_17_2
                .typeShowGroupsModal();
        Thread.sleep(1000);
        ;

        driver.quit();


    }




}





