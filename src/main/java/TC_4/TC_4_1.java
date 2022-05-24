package TC_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_4_1 {
    WebDriver driver;

    public TC_4_1(WebDriver driver) {
        this.driver = driver;
    }


    //Ссылка перехода в события
    By LinkEvent = By.xpath("//p[text()='События']");
    //Ссылка на архив
    By LinkArchive = By.xpath("//p[text()='Архив']");
    //Карточка архива
    By CardArchive = By.xpath("//h4[text()='2019 - 2020']/parent::div");
    //Оценка
    By MarkArchive = By.xpath("//p[text()='Технология']");

    public TC_4_1 typeMarkArchive() {

        if(driver.findElement(MarkArchive).getText().contains("Технология")){
            System.out.println("Оценки  +++");
        }
        else System.out.println("Оценки ---");
        return this;
    }

    public TC_4_1 typeCardArchive() {
        driver.findElement(CardArchive).click();
        return this;
    }
    public TC_4_1 typeLinkArchive() {
        driver.findElement(LinkArchive).click();
        return this;
    }

    public TC_4_1 typeLinkEvent() {
        driver.findElement(LinkEvent).click();
        return this;
    }


}
