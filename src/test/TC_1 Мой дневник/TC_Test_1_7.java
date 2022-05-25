
import TC_1.TC_1_7;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_1_7 {


    WebDriver driver;
    LoginDiary login;
    TC_1_7 TC_1_7;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_Test_1_7() {

        System.out.println("Проверка кейса TC_D_1_7 https://jira.edu.mos.ru/browse/EDW-1134");
        login = new LoginDiary(driver);
        TC_1_7 = new TC_1_7(driver);
        login.loginDiary("", "");
        TC_1_7

                .typeTodaySchedule()

                .typeTodaySchedule()
                .typeCalendarSelector()
                .typeCalendarSelectorArrow()
                .typeMondaySelector()
                .typeFridayButton()
                .typeAbsence()
                .typeB()
                .typeH()

        ;
        driver.quit();


    }




}
