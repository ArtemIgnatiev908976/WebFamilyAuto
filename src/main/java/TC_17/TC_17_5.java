package TC_17;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class TC_17_5 {
    WebDriver driver;
    public TC_17_5(WebDriver driver) {
        this.driver = driver;
    }

    By allDopGroups = By.xpath("//div/p[text()='Другие занятия']/parent::div");
    //Блок с группами доп образования
    By blockByDopGroups = By.xpath("//div/p[text()='Биология поведения человека']");
    //3 точки (Настройки)
    By settingsDopGroups = By.xpath("//div/p[text()='Биология поведения человека']/ following-sibling::div");
    //Скрыть занятие в модальном окне
    By pushNotVisitModal = By.xpath("//div/p[text()='Отправить']");
    ///Некорректное расписание
    By notVisit = By.xpath("//div[text()='Больше не посещаю']");


    public TC_17_5  typeNotVisit() {
        driver.findElement(notVisit).click();
        return this;
    }

    public TC_17_5  typePushNotVisitModal() {
        driver.findElement(pushNotVisitModal).click();
        return this;
    }

    public TC_17_5 typeAllDopGroups() {
        if (driver.findElements(allDopGroups).size() > 0) System.out.println("Блок с доп.группами  +++");
        else System.out.println("Блок с доп.группами  ---");
        return this;
    }

    // Группа Биология поведения чевовека
    public TC_17_5 typeBlockByDopGroups() {
        if (driver.findElements(blockByDopGroups).size() > 0) System.out.println("Группа Биология поведения человека  +++");
        else System.out.println("Группа Биология поведения чевовека  ---");
        return this;
    }
    //3 точки (Настройки) нажать
    public TC_17_5  typeSettingsDopGroups() {
        driver.findElement(settingsDopGroups).click();
        return this;
    }

}



