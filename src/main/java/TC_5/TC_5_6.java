package TC_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class TC_5_6 {
    WebDriver driver;

    public TC_5_6(WebDriver driver) {
        this.driver = driver;
    }


    //Ссылка оценок
    By linkMarks = By.xpath("//a/p[text()='Оценки']");
    //Стрелка календаря
    By calendarSelectorArrow = By.xpath("//span[@class='MuiButton-label']/parent::button");
    //Календарь
    By calendarMain = By.xpath("//button[@class='MuiButtonBase-root']/child::div/p");
    //Проверка оценки
    By periodMarks = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div/p");
    //Годовая оценка
    By yearMark = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[6]/div/p");

    public TC_5_6 typeYearMark() {

        if(driver.findElement(yearMark).getText().contains("4")){
            System.out.println("Оценка годовая +++");
        }
        else System.out.println("Оценка годовая ---");
        return this;
    }

    public TC_5_6 typePeriodMarks() {

        if(driver.findElement(periodMarks).getText().contains("4")){
            System.out.println("Оценка по периоду +++");
        }
        else System.out.println("Оценка по периоду ---");
        return this;
    }


    public TC_5_6 typeColorMark() {
        //Оценки по периодам должны отображаться в светло - зеленых квадратах.
        WebElement ColorMark = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div"));
        String greenColor = ColorMark.getCssValue("background-color");
        String hexGreenColor = Color.fromString(greenColor).asHex();
        if(hexGreenColor.equals("#eaf3ea"))
            System.out.println("Оценки по периодам отображаются в светло - зеленых квадратах +++");
        else
            System.out.println("Оценки по периодам отображаются в светло - зеленых квадратах ---");
        return this;
    }

    public TC_5_6 typeColorMarkYear() {
        //Оценки по периодам должны отображаться в светло - зеленых квадратах.
        WebElement ColorMark = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[6]/div"));
        String greenColor = ColorMark.getCssValue("background-color");
        String hexGreenColor = Color.fromString(greenColor).asHex();
        if(hexGreenColor.equals("#3daf3a"))
            System.out.println("Оценки годовые должны отображаться в насыщенно - зеленом квадрате +++");
        else
            System.out.println("Оценки годовые должны отображаться в насыщенно - зеленом квадрате ---");
        return this;
    }

    public TC_5_6 typeCalendarSelectorArrow() {


        while(!driver.findElement(calendarMain).getText().contains("14 март - 20 март")){
            driver.findElement(calendarSelectorArrow).click();
        }
        return this;
    }

    public TC_5_6  typeLinkMarks() {
        driver.findElement(linkMarks).click();
        return this;
    }
}
