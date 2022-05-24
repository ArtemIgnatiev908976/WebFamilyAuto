
import TC_2.TC_2_4;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TC_Test_2_4 {
    WebDriver driver;
    LoginDiary login;
    TC_2_4 tc_2_4;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_2_4() throws InterruptedException {

        System.out.println("Проверка кейса TC_D_2_4 https://jira.edu.mos.ru/browse/EDW-268");
        login = new LoginDiary(driver);
        tc_2_4 = new TC_2_4(driver);
        Actions actions = new Actions(driver);

        login.loginDiary("", "");
        tc_2_4

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
                .typeCardOfProgramm()
                .typeTopicName()
                .typeHoursOfTopic()
                .typeOpenTopic();
        Thread.sleep(2000);
        tc_2_4
                .typeLessonNameInTopic()
        ;

        driver.quit();
    }
}
