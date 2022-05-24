
import TC_2.TC_2_1;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TC_Test_2_1 {
    WebDriver driver;
    LoginDiary login;
    TC_2_1 tc_2_1;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_2_1() {

        System.out.println("Проверка кейса TC_D_2_1 https://jira.edu.mos.ru/browse/EDW-265  ");
        login = new LoginDiary(driver);
        tc_2_1 = new TC_2_1(driver);
        Actions actions = new Actions(driver);

        login.loginDiary("", "");
        tc_2_1

                .typeLinkLearn()
                .typeProfileYP()
                .typeFormLearn()
                .typeNapravlennost()
                .typeLevelOfStudy()
                .typeParallelOfLearn()
                .typeWeekOfLearn()
                .typeObjectOfLearn()
                .typeTimeOfProgramm()
                .typeTimeOfWeek()
        ;

        driver.quit();
    }
}
