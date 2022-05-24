package TC_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_4_1 {
    WebDriver driver;

    public TC_4_1(WebDriver driver) {
        this.driver = driver;
    }


    //Ссылка перехода в события
    By linkEvent = By.xpath("//p[text()='События']");
    //Ссылка на архив
    By linkArchive = By.xpath("//p[text()='Архив']");
    //Карточка архива
    By cardArchive = By.xpath("//h4[text()='2019 - 2020']/parent::div");
    //Оценка
    By markArchive = By.xpath("//p[text()='Технология']");

    public TC_4_1 typeMarkArchive() {

        if(driver.findElement(markArchive).getText().contains("Технология")){
            System.out.println("Оценки  +++");
        }
        else System.out.println("Оценки ---");
        return this;
    }

    public TC_4_1 typeCardArchive() {
        driver.findElement(cardArchive).click();
        return this;
    }
    public TC_4_1 typeLinkArchive() {
        driver.findElement(linkArchive).click();
        return this;
    }

    public TC_4_1 typeLinkEvent() {
        driver.findElement(linkEvent).click();
        return this;
    }


}
