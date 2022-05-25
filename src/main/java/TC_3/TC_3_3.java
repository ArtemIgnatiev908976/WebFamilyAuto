package TC_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_3_3 {
    WebDriver driver;

    public TC_3_3(WebDriver driver) {
        this.driver = driver;
    }


    //Ссылка перехода в события
    By linkEvent = By.xpath("//a/p[text()='События']");
    //Мероприятие
    By event = By.xpath("//p[text()='ср, 1 сентября 10:00 - 11:00']/parent::div");
    //Кнопка назад Мероприятие
    By backEvent = By.xpath("//span[text()='Назад']/parent::button");
    // Название мероприятия
    By nameEvent = By.xpath("//p[text()='Мероприятие']");
    // Описание мероприятия
    By textEvent = By.xpath("//p[text()='тест<br>']");
    // дата/время проведения мероприятия
    By dateAndTimeEvent = By.xpath("//p[text()='ср, 1 сентября 10:00 - 11:00']");


    public TC_3_3 typeDateAndTimeEvent() {

        if(driver.findElement(dateAndTimeEvent).getText().contains("ср, 1 сентября 10:00 - 11:00")){
            System.out.println("Дата/время мероприятия  +++");
        }
        else System.out.println("Дата/время мероприятия ---");
        return this;
    }

    public TC_3_3 typeTextEvent() {

        if(driver.findElement(textEvent).getText().contains("тест<br>")){
            System.out.println("Текст мероприятия  +++");
        }
        else System.out.println("Текст мероприятия ---");
        return this;
    }


    public TC_3_3 typeNameEvent() {

        if(driver.findElement(nameEvent).getText().contains("Мероприятие")){
            System.out.println("Название мероприятия  +++");
        }
        else System.out.println("Название мероприятия ---");
        return this;
    }

    public TC_3_3 typeBackEvent() {
        driver.findElement(backEvent).click();
        return this;
    }

    public TC_3_3 typeEvent() {
        driver.findElement(event).click();
        return this;
    }

    public TC_3_3 typeLinkEvent() {
        driver.findElement(linkEvent).click();
        return this;
    }


}
