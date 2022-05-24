import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginDiaryStudent {

    WebDriver driver;

    public LoginDiaryStudent(WebDriver driver) {
        this.driver = driver;
    }

    By loginField = By.cssSelector("#login");
    By passwordField = By.cssSelector("#password");
    By comeInButton = By.cssSelector("#bind");
    By ComeNewAupd = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/main/section/div/div[1]/div[3]/div/div[1]/div[2]/div");

    public LoginDiaryStudent typeComeNewAupd() {
        driver.findElement(ComeNewAupd).click();
        return this;
    }

    public LoginDiaryStudent typeLogin(String loginField) {
        driver.findElement(this.loginField).sendKeys("183-966-930 33");
        return this;
    }

    public LoginDiaryStudent typePassword(String passwordField) {
        driver.findElement(this.passwordField).sendKeys("La78pE2x");
        return this;
    }


    public LoginDiaryStudent typeComeInButton() {
        driver.findElement(comeInButton).click();
        return this;
    }

    public LoginDiaryStudent loginDiaryStudent(String loginField, String passwordField) {

        typeComeNewAupd();
        typeLogin(loginField);
        typePassword(passwordField);
        return   typeComeInButton();



    }



}
