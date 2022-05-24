import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginDiary {

    WebDriver driver;

    public LoginDiary(WebDriver driver) {
        this.driver = driver;
    }
    By ComeNewAupd = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/main/section/div/div[1]/div[3]/div/div[1]/div[2]/div");
    By loginField = By.cssSelector("#login");
    By passwordField = By.cssSelector("#password");
    By comeInButton = By.cssSelector("#bind");
    By profileLink = By.cssSelector("#root > div.jss7 > header > div > div:nth-child(1) > div > div > div.MuiGrid-root.jss18.jss20.MuiGrid-item > div.jss37 > div.jss39 > div.MuiBox-root.jss96.jss91 > div > div");
    //Переход в профиль Сони Геворкян
    By profileGevoSonya = By.cssSelector("body > div.MuiPopover-root.jss94 > div.MuiPaper-root.jss95.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > div > div:nth-child(3)");

    public LoginDiary typeProfileGevoSonya() {
        driver.findElement(profileGevoSonya).click();
        return this;
    }
    public LoginDiary  typeProfileLink() {
        driver.findElement(profileLink).click();
        return this;
    }

    public LoginDiary typeComeNewAupd() {
        driver.findElement(ComeNewAupd).click();
        return this;
    }


    public LoginDiary typeLogin(String loginField) {
        driver.findElement(this.loginField).sendKeys("580-370-825 94");
        return this;
    }

    public LoginDiary typePassword(String passwordField) {
        driver.findElement(this.passwordField).sendKeys("uK3Ewds4");
        return this;
    }


    public LoginDiary typeComeInButton() {
        driver.findElement(comeInButton).click();
        return this;
    }


    public LoginDiary loginDiary(String loginField, String passwordField) {

        typeComeNewAupd();
        typeLogin(loginField);
        typePassword(passwordField);
        typeComeInButton();
        typeProfileLink();
        return      typeProfileGevoSonya();
    }



}
