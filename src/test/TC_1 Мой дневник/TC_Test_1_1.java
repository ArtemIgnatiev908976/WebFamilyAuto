

import TC_1.TC_1_1;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class TC_Test_1_1 {

    WebDriver driver;
    LoginDiary login;
    TC_1_1 tc_1_1;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();

    }


    @Test
    public void TC_1_1() {

        System.out.println("Проверка кейса TC_D_1_1 https://jira.edu.mos.ru/browse/EDW-238  ");
        login = new LoginDiary(driver);
        tc_1_1 = new TC_1_1(driver);
        Actions actions = new Actions(driver);

        login.loginDiary("", "");
      tc_1_1

                .typeCalendarSelector()
                .typeCalendarSelectorArrow()
                .typeMondaySelector()
                .typeLessonIconTypeDist()
                .typeLessonIconTypeDOP()
                .typeTurnLesson()
                .typeСardOfFirstLessonTime()
                .typeСardOfFirstLessonNumber()
                .typeLessonAbsence()
                .typeDopGroups()
                .typeCardOfFirstLessonNameLesson()
                .typeСardOfFirstLessonClass()
                .typeCardOfLesson()
                .typeLabelOfHomeworkinCard()
                .typeMarkInCard()
                .typeFormControlInCard();
        driver.quit();
    }
}
