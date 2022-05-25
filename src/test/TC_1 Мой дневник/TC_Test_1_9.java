
import TC_1.TC_1_9;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_1_9 {


    WebDriver driver;
    LoginDiaryStudent login;
    TC_1_9 TC_1_9;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_Test_1_9() {

        System.out.println("Проверка кейса TC_D_1_9 https://jira.edu.mos.ru/browse/EDW-1136");
        login = new LoginDiaryStudent(driver);
        TC_1_9 = new TC_1_9(driver);
        login.loginDiaryStudent("", "");
        TC_1_9

                .typeTodaySchedule()
                .typeCalendarSelector()
                .typeCalendarSelectorArrow()
                .typeMondaySelector()
                .typeFridayButton()
                .typeAbsence()
                .typeB()


        ;
        driver.quit();


    }




}
