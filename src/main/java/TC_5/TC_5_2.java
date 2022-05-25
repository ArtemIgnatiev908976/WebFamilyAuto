package TC_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_5_2 {
    WebDriver driver;

    public TC_5_2(WebDriver driver) {
        this.driver = driver;
    }



    //Ссылка оценок
    By linkMarks = By.xpath("//a/p[text()='Оценки']");

    //Оценки по дате
    By dateMarks = By.xpath("//span[text()='По дате']/parent::button");
    //Стрелка календаря
    By calendarSelectorArrow = By.xpath("//span[@class='MuiButton-label']/parent::button");
    //Календарь
    By calendarMain = By.xpath("//button[@class='MuiButtonBase-root']/child::div/p");
    //Оценка
    By mark = By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4' and contains(text(),'5')]");
    //Название предмета
    By markLesson = By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 MuiTypography-colorTextSecondary' and contains(text(),'Цифровое домашнее задание')]/preceding-sibling::p");
    //Нажатие на оценку
    By clickMark = By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4' and contains(text(),'5')]/parent::div/parent::div");
    //Оценка внутри карточки
    By markInCard = By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4' and contains(text(),'5')]");
    //Тема урока
    By topicInCard = By.xpath("//p[text()='Повторение. Арифметическая и геометрическая прогрессии']");
    //Дата и время оценки
    By dateAndTimeMark = By.xpath("//p[text()='23 мая, 9:13']");
    //Форма контроля
    By formControl = By.xpath("//p[text()='Цифровое домашнее задание']");
    //
    By formControlInCard = By.xpath("//p[text()='Цифровое домашнее задание']");


    public TC_5_2 typeFormControlInCard() {

        if(driver.findElement(formControlInCard).getText().contains("Цифровое домашнее задание")){
            System.out.println("Форма контроля в карточке +++");
        }
        else System.out.println("Форма контроля в карточке ---");
        return this;
    }

    public TC_5_2 typeFormControl() {

        if(driver.findElement(formControl ).getText().contains("Цифровое домашнее задание")){
            System.out.println("Форма контроля +++");
        }
        else System.out.println("Форма контроля ---");
        return this;
    }

    public TC_5_2 typeDateAndTimeMark() {

        if(driver.findElement(dateAndTimeMark).getText().contains("23 мая, 9:13")){
            System.out.println("Дата и время оценки +++");
        }
        else System.out.println("Дата и время оценки ---");
        return this;
    }

    public TC_5_2 typeTopicInCard() {

        if(driver.findElement(topicInCard).getText().contains("Повторение. Арифметическая и геометрическая прогрессии")){
            System.out.println("Тема урока +++");
        }
        else System.out.println("Тема урока ---");
        return this;
    }

    public TC_5_2 typeMarkInCard() {

        if(driver.findElement(markInCard ).getText().contains("5")){
            System.out.println("Оценка +++");
        }
        else System.out.println("Оценка ---");
        return this;
    }

    public TC_5_2  typeClickMark() {
        driver.findElement(clickMark).click();
        return this;
    }
    public TC_5_2 typeMarkLesson() {

        if(driver.findElement(markLesson).getText().contains("Алгебра")){
            System.out.println("Название предмета +++   Добавить в авто тест форму контроля после выполнения задачи");
        }
        else System.out.println("Название предмета --- Добавить в авто тест форму контроля после выполнения задачи ");
        return this;
    }
    public TC_5_2 typeMark() {

        if(driver.findElement(mark).getText().contains("5")){
            System.out.println("Оценка +++");
        }
        else System.out.println("Оценка ---");
        return this;
    }

    public TC_5_2 typeCalendarSelectorArrow() {


        while(!driver.findElement(calendarMain).getText().contains("23 мая - 29 мая")){
            driver.findElement(calendarSelectorArrow).click();
        }
        return this;
    }

    public TC_5_2  typeDateMarks() {
        driver.findElement(dateMarks).click();
        return this;
    }

    public TC_5_2  typeLinkMarks() {
        driver.findElement(linkMarks).click();
        return this;
    }
}
