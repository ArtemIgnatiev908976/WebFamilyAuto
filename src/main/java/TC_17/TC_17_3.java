package TC_17;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class TC_17_3 {
    WebDriver driver;
    public TC_17_3(WebDriver driver) {
        this.driver = driver;
    }

    By allDopGroups = By.xpath("//div/p[text()='Другие занятия']/parent::div");
    //Блок с группами доп образования
    By blockByDopGroups = By.xpath("//div/p[text()='Биология поведения человека']");
    //3 точки (Настройки)
    By settingsDopGroups = By.xpath("//div/p[text()='Биология поведения человека']/ following-sibling::div");
    ///Некорректное расписание
    By noCorrectShedule = By.xpath("//div[text()='Некорректное расписание']");
    //Скрыть занятие в модальном окне
    By pushNoCorrectSheduleModal = By.xpath("//div/p[text()='Отправить']");



    public TC_17_3  typePushNoCorrectSheduleModal() {
        driver.findElement(pushNoCorrectSheduleModal).click();
        return this;
    }

    public TC_17_3  typeNoCorrectShedule() {
        driver.findElement(noCorrectShedule).click();
        return this;
    }

    public TC_17_3 typeAllDopGroups() {
        if (driver.findElements(allDopGroups).size() > 0) System.out.println("Блок с доп.группами  +++");
        else System.out.println("Блок с доп.группами  ---");
        return this;
    }

    // Группа Биология поведения чевовека
    public TC_17_3 typeBlockByDopGroups() {
        if (driver.findElements(blockByDopGroups).size() > 0) System.out.println("Группа Биология поведения человека  +++");
        else System.out.println("Группа Биология поведения чевовека  ---");
        return this;
    }
    //3 точки (Настройки) нажать
    public TC_17_3  typeSettingsDopGroups() {
        driver.findElement(settingsDopGroups).click();
        return this;
    }

}



