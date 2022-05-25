

import TC_5.TC_5_3;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_Test_5_3 {


    WebDriver driver;
    LoginDiaryStudent login;
    TC_5_3 tc_5_3;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://dnevnik-dev.mos.ru/");
        driver.manage().window().maximize();
    }


    @Test
    public void TC_Test_5_3() throws InterruptedException {

        System.out.println("Проверка кейса TC_D_5_3 https://jira.edu.mos.ru/browse/EDW-256");
        login = new LoginDiaryStudent(driver);
        tc_5_3 = new TC_5_3(driver);
        login.loginDiaryStudent("", "");
        tc_5_3


                .typeLinkMarks()
                .typeForSubjectButton()
                .typeMarksOfStudent()
                .typeYearMarks();
        Thread.sleep(1000);
        tc_5_3
                .typePeriodMark()
                .typeMarks()
                .typeMiddleBall()
                .typeFinalMark()
        ;
        driver.quit();


    }




}
