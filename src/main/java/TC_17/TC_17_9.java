package TC_17;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class TC_17_9 {
    WebDriver driver;
    public TC_17_9(WebDriver driver) {
        this.driver = driver;
    }

    //Кнопка настроек дневника
    By settingsButton = By.xpath("//p[text()='Настройки']");
    //Показать скрытые настройки
    By showHideSettings = By.xpath("//p[text()='Показать скрытые занятия']");


    public TC_17_9 typeHideSettings(){
        if (driver.findElements(showHideSettings).size() > 0) System.out.println("Чекбокс Показать скрытые  +++");
        else System.out.println("Чекбокс Показать скрытые  ---");
        return this;
    }

    public TC_17_9  typeSettingsButton() {
        driver.findElement(settingsButton).click();
        return this;
    }

}



