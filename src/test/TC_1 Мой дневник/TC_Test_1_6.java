
import TC_1.TC_1_6;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_1_6 {


    WebDriver driver;
    LoginDiary login;
    TC_1_6 TC_1_6;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_Test_1_6() {

        System.out.println("Проверка кейса TC_D_1_6 https://jira.edu.mos.ru/browse/EDW-1133");
        login = new LoginDiary(driver);
        TC_1_6 = new TC_1_6(driver);
        login.loginDiary("", "");
        TC_1_6

                .typeTodaySchedule()
                .typeTodaySchedule()
                .typeCalendarSelector()
                .typeCalendarSelectorArrow()
                .typeMondaySelector()
                .typeTuesdayButton()
                .typeAbsence()
                .typeB()

        ;
        driver.quit();


    }




}
