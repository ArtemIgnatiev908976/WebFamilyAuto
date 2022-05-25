
import TC_1.TC_1_3;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_1_3 {


    WebDriver driver;
    LoginDiary login;
    TC_1_3 tc_1_3;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_Test_1_3() {

        System.out.println("Проверка кейса TC_D_1_3 https://jira.edu.mos.ru/browse/EDW-240  ");
        login = new LoginDiary(driver);
        tc_1_3 = new TC_1_3(driver);
        login.loginDiary("", "");
        tc_1_3

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
                .typeTodaySchedule()
                .typeButtonSettings()
                .typeDay7Button()
                .typeShedule7Days()
                .typeCalendarSelector()
                .typeCalendarSelectorArrow()
                .typeShedule7Days()
        ;
        driver.quit();


    }




}
