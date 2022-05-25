package TC_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class TC_1_1 {
    WebDriver driver;
    public TC_1_1(WebDriver driver) {
        this.driver = driver;
    }


    By calendarSelector = By.xpath("//button[@class='MuiButtonBase-root']");
    By calendarSelectorArrow = By.xpath("/html/body/div[2]/div/div[1]/button[1]");
    //Выбор дня Понедельник
    By mondaySelector = By.xpath("/html/body/div[2]/div/div[5]/button");
    By cardOfLesson = By.xpath("//h5[text()='Алгебра']/parent::div/parent::div");
    //Время урока в карточке
    By cardOfFirstLessonTime = By.xpath("//p[text()='11:30 – 12:10']");
    //Номер урока в карточке
    By cardOfFirstLessonNumber = By.xpath("//p[text()='1 урок']");
    //Номер кабинета в карточке
    By cardOfFirstLessonClass = By.xpath("//p[text()='каб. 212']");
    //Название предмета
    By cardOfFirstLessonNameLesson = By.xpath("//h5[text()='Алгебра']");
    //Значек типа урока Дистанционный
    By lessonIconTypeDist = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[7]/div/div/div[1]/div/div[2]/div");
    //Значек  типо урока ДОП
    By lessonIconTypeDOP = By.xpath("//span[text()='ДОП']");
    //Отсутствие Б
    By lessonAbsence = By.xpath("//div[text()='Б']");
    //группы доп образования
    By dopGroups = By.xpath("//p[text()='Другие занятия']/parent::div");
    //Лейбл домашней работы в карточке урока
    By labelOfHomeworkinCard = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div[2]/div[1]/button[2]/div[2]/div/div");
    //Оценка
    By markInCard = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]");
    //Форма контроля
    By formControlInCard = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/p");
    //Перемена
    By turnLesson = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[2]");

    public TC_1_1 typeTurnLesson() {
        if (driver.findElements(turnLesson).size() > 0) System.out.println("Перемена есть  +++");
        else System.out.println("Перемены нет ---");
        return this;
    }


    public TC_1_1 typeFormControlInCard() {
        if (driver.findElements(formControlInCard).size() > 0) System.out.println("Форма контроля есть  +++");
        else System.out.println("Формы контроля нет ---");
        return this;
    }

    public TC_1_1 typeMarkInCard() {
        if (driver.findElements(markInCard).size() > 0) System.out.println("Оценка в карточке урока есть  +++");
        else System.out.println("Оценки в карточке урока  нет ---");
        return this;
    }

    public TC_1_1 typeLabelOfHomeworkinCard() {
        if (driver.findElements(labelOfHomeworkinCard).size() > 0) System.out.println("Лейбл дз в карточке урока есть  +++");
        else System.out.println("Лейбла дз в карточке урока  нет ---");
        return this;
    }


    public TC_1_1 typeDopGroups() {
        if (driver.findElements(dopGroups).size() > 0) System.out.println("Блок с группами доп есть  +++");
        else System.out.println("Блока с группами доп нет ---");
        return this;
    }


    public TC_1_1 typeCardOfFirstLessonNameLesson() {
        if (driver.findElements(cardOfFirstLessonNameLesson).size() > 0) System.out.println("Название предмета есть  +++");
        else System.out.println("Названия предмета нет ---");
        return this;
    }


    public TC_1_1 typeLessonAbsence() {
        if (driver.findElements(lessonAbsence).size() > 0) System.out.println("Лейбл об отсутствии есть  +++");
        else System.out.println("Лейбла об отсутствии нет ---");
        return this;
    }


    public TC_1_1 typeСardOfFirstLessonClass() {
        if (driver.findElements(cardOfFirstLessonClass).size() > 0) System.out.println("Номер кабинета есть  +++");
        else System.out.println("Номера кабинета нет ---");
        return this;
    }


    public TC_1_1 typeСardOfFirstLessonNumber() {
        if (driver.findElements(cardOfFirstLessonNumber).size() > 0) System.out.println("Номер урока есть  +++");
        else System.out.println("Номер урока есть ---");
        return this;
    }


    public TC_1_1 typeСardOfFirstLessonTime() {
        if (driver.findElements(cardOfFirstLessonTime).size() > 0) System.out.println("Время урока есть  +++");
        else System.out.println("Времени урока нет ---");
        return this;
    }

    public TC_1_1 typeLessonIconTypeDOP() {
        if (driver.findElements(lessonIconTypeDOP).size() > 0) System.out.println("Иконка ДОП урока есть  +++");
        else System.out.println("Иконки ДОП урока нет ---");
        return this;
    }

    public TC_1_1 typeLessonIconTypeDist() {
        if (driver.findElements(lessonIconTypeDist).size() > 0) System.out.println("Иконка дист урока есть  +++");
        else System.out.println("Иконки дист урока нет ---");
        return this;
    }


    public TC_1_1  typeCardOfLesson() {
        driver.findElement(cardOfLesson).click();
        return this;
    }



    public TC_1_1  typeCalendarSelector() {
        driver.findElement(calendarSelector).click();
        return this;
    }
    public TC_1_1  typeCalendarSelectorArrow() {


        while(!driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/p")).getText().contains("Январь")){
            driver.findElement(calendarSelectorArrow).click();
        }
        return this;
    }

    public TC_1_1  typeMondaySelector() {
        driver.findElement(mondaySelector).click();
        return this;
    }



}
