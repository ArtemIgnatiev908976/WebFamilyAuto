package TC_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_3_1 {
    WebDriver driver;

    public TC_3_1(WebDriver driver) {
        this.driver = driver;
    }


    //Ссылка перехода в события
    By linkEvent = By.xpath("//a/p[text()='События']");
    //Новость
    By news = By.xpath("//div/p[text()='Новость от куратора (глобальная)']/parent::div");
    //Название новости
    By nameNews = By.xpath("//p[text()='Новость от куратора (глобальная)']");
    //Кнопка назад
    By back = By.xpath("//span[text()='Назад']/parent::button");
    //Заголовок новости
    By zagNews = By.xpath("//p[text()='Новость от куратора (глобальная)']");
    //Текс новости
    By textNews = By.xpath("//div[text()='Для всех']");



    public TC_3_1 typeTextNews() {

        if(driver.findElement(textNews).getText().contains("Для всех")){
            System.out.println("Текст новости +++");
        }
        else System.out.println("Текст новости ---");
        return this;
    }

    public TC_3_1 typeZagNews() {

        if(driver.findElement(zagNews).getText().contains("Новость от куратора (глобальная)")){
            System.out.println("Заголовок новости +++");
        }
        else System.out.println("Заголовок новости ---");
        return this;
    }

    public TC_3_1 typeBack() {
        driver.findElement(back).click();
        return this;
    }

    public TC_3_1 typeNameNews() {

        if(driver.findElement(nameNews).getText().contains("Новость от куратора (глобальная)")){
            System.out.println("Название новости +++");
        }
        else System.out.println("Название новости ---");
        return this;
    }

    public TC_3_1 typeNews() {
        driver.findElement(news).click();
        return this;
    }

    public TC_3_1 typeLinkEvent() {
        driver.findElement(linkEvent).click();
        return this;
    }

}
