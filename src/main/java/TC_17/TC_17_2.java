package TC_17;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class TC_17_2 {
    WebDriver driver;
    public TC_17_2(WebDriver driver) {
        this.driver = driver;
    }

    By allDopGroups = By.xpath("//div/p[text()='Другие занятия']/parent::div");
    //Блок с группами доп образования
    By blockByDopGroups = By.xpath("//div/p[text()='Биология поведения человека']");
    //3 точки (Настройки)
    By settingsDopGroups = By.xpath("//div/p[text()='Биология поведения человека']/ following-sibling::div");
    //Скрыть занятие
    By hideGroup = By.xpath("//div[text()='Скрыть занятие']");
    //Скрыть занятие в модальном окне
    By hideGroupsModal = By.xpath("//div/p[text()='Скрыть']");
    //Кнопка настроек дневника
    By settingsButton = By.xpath("//p[text()='Настройки']");
    //Показать скрытые настройки
    By showHideSettings = By.xpath("//p[text()='Показать скрытые занятия']");
    //Показать занятие
    By showGroup = By.xpath("//div[text()='Показать занятие']");
    //Показать занятие в модальном окне
    By showGroupsModal = By.xpath("//div/p[text()='Показать']");
    By lowerGroup = By.xpath("//p[text()='Вход в мир IT']");


    public TC_17_2  typeLowerGroup() {
        driver.findElement(lowerGroup).click();
        return this;
    }

    public TC_17_2  typeShowGroupsModal() {
        driver.findElement(showGroupsModal).click();
        return this;
    }
    public TC_17_2  typeShowGroup() {
        driver.findElement(showGroup).click();
        return this;
    }
    public TC_17_2  typeShowHideSettings() {
        driver.findElement(showHideSettings).click();
        return this;
    }
    public TC_17_2  typeSettingsButton() {
        driver.findElement(settingsButton).click();
        return this;
    }
    public TC_17_2 typeAllDopGroups() {
        if (driver.findElements(allDopGroups).size() > 0) System.out.println("Блок с доп.группами  +++");
        else System.out.println("Блок с доп.группами  ---");
        return this;
    }
    public TC_17_2  typeHideGroupsModal() {
        driver.findElement(hideGroupsModal).click();
        return this;
    }
    public TC_17_2  typeHideGroup() {
        driver.findElement(hideGroup).click();
        return this;
    }
    // Группа Биология поведения чевовека
    public TC_17_2 typeBlockByDopGroups() {
        if (driver.findElements(blockByDopGroups).size() > 0) System.out.println("Группа Биология поведения человека  +++");
        else System.out.println("Группа Биология поведения чевовека  ---");
        return this;
    }
    //3 точки (Настройки) нажать
    public TC_17_2  typeSettingsDopGroups() {
        driver.findElement(settingsDopGroups).click();
        return this;
    }
    //Проверка на прозрачность
    public TC_17_2 typeGreyOpacity() {

        WebElement ColorOpacity = driver.findElement(By.xpath("//div/p[text()='Биология поведения человека']/parent::div"));

        String greyOpacity = ColorOpacity.getCssValue("opacity");

        if(greyOpacity.equals("0.4"))
            System.out.println("Занятие скрылось +++");
        else
            System.out.println("Занятие скрылось ---");
        return this;
    }
}



