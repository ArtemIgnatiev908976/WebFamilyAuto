
import TC_4.TC_4_2;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TC_Test_4_2 {
    WebDriver driver;
    LoginDiaryStudent login;
    TC_4_2 tc_4_2;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_4_2() throws InterruptedException {

        System.out.println("Проверка кейса TC_D_4_2 https://jira.edu.mos.ru/browse/EDW-276 ");
        login = new LoginDiaryStudent(driver);
        tc_4_2 = new TC_4_2(driver);
        Actions actions = new Actions(driver);

        login.loginDiaryStudent("", "");
        tc_4_2
                .typeLinkEvent()
                .typeLinkArchive()
                .typeCardArchive()
                .typeMarkArchive()
        ;

        driver.quit();
    }
}

