
import TC_1.TC_1_2;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_1_2 {
    WebDriver driver;
    LoginDiary login;
    TC_1_2 tc_1_2;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_Test_1_2() {

        System.out.println("Проверка кейса TC_D_1_2 https://jira.edu.mos.ru/browse/EDW-239  ");
        login = new LoginDiary(driver);
        tc_1_2 = new TC_1_2(driver);


        login.loginDiary("", "");
        tc_1_2

                .typeTodaySchedule()
                .typeTodaySchedule()
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
                .typeSaturdayDay()
                .typeTodaySchedule()
        ;
        driver.quit();
    }


}
