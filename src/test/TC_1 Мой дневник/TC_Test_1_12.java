
import TC_1.TC_1_12;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_1_12 {


    WebDriver driver;
    LoginDiaryStudent login;
    TC_1_12 TC_1_12;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_Test_1_12() {

        System.out.println("Проверка кейса TC_D_1_12 https://jira.edu.mos.ru/browse/EDW-812  "  );
        login = new LoginDiaryStudent(driver);
        TC_1_12 = new TC_1_12(driver);
        login.loginDiaryStudent("", "");
        TC_1_12

                .typeTodaySchedule()
                .typeCalendarSelector()
                .typeCalendarSelectorArrow()
                .typeWeekSelector()
                .typeFridayButton()
                .typeAbsence()
                .typeO()


        ;
        driver.quit();


    }




}
