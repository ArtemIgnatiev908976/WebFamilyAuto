
import TC_1.TC_1_5;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_1_5 {


    WebDriver driver;
    LoginDiaryStudent login;
    TC_1_5 TC_1_5;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_Test_1_5() {

        System.out.println("Проверка кейса TC_D_1_5 https://jira.edu.mos.ru/browse/EDW-252  ");
        login = new LoginDiaryStudent(driver);
        TC_1_5 = new TC_1_5(driver);
        login.loginDiaryStudent("", "");
        TC_1_5


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
                .typeLessonIconTypeDist()
                .typeLessonIconTypeDOP()
                .typeTurnLesson()
                .typeСardOfFirstLessonTime()
                .typeСardOfFirstLessonNumber()
                .typeLessonAbsence()
                .typeDopGroups()
                .typeTodaySchedule()
        ;
        driver.quit();


    }




}
