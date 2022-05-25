package TC_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_1_2 {
    WebDriver driver;
    public TC_1_2(WebDriver driver) {
        this.driver = driver;
    }


    By calendarSelector = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[1]/div/div[1]/div[1]/div/button[1]");
    By calendarSelectorArrow = By.xpath("/html/body/div[2]/div/div[1]/button[1]");
    //Выбор дня Понедельник
    By mondaySelector = By.xpath("/html/body/div[2]/div/div[5]/button");
    //Время урока в карточке
    By cardOfFirstLessonTime = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[1]/p[2]");
    //Номер урока в карточке
    By cardOfFirstLessonNumber = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[1]/p[1]");
    //Название предмета
    By cardOfFirstLessonNameLesson = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/h5");
    //Значек типа урока Дистанционный
    By lessonIconTypeDist = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[7]/div/div/div[1]/div/div[2]/div");
    //Значек  типо урока ДОП
    By lessonIconTypeDOP = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[9]/div[2]/div/div[1]/div/div[2]/div/span");
    //Отсутствие Б
    By lessonAbsence = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[3]/div/div/div[1]/div/div[2]/div[3]");
    //группы доп образования
    By DopGroups = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[3]");
    //Блок расписания на текущий день
    By TodaySchedule = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div");
    //Выбрать Субботу
    By SaturdayDay = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[1]/div/div[1]/div[2]/button[7]");
    //Перемена
    By TurnLesson = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[2]");

    public TC_1_2 typeTurnLesson() {
        if (driver.findElements(TurnLesson).size() > 0) System.out.println("Перемена есть  +++");
        else System.out.println("Перемены нет ---");
        return this;
    }

    public TC_1_2  typeSaturdayDay() {
        driver.findElement(SaturdayDay).click();
        return this;
    }


    public TC_1_2 typeTodaySchedule() {
        if (driver.findElements(TodaySchedule).size() > 0) System.out.println("Блок расписания есть  +++");
        else System.out.println("Блока расписаиня нет ---");
        return this;
    }


    public TC_1_2 typeDopGroups() {
        if (driver.findElements(DopGroups).size() > 0) System.out.println("Блок с группами доп есть  +++");
        else System.out.println("Блока с группами доп нет ---");
        return this;
    }

    public TC_1_2 typeLessonAbsence() {
        if (driver.findElements(lessonAbsence).size() > 0) System.out.println("Лейбл об отсутствии есть  +++");
        else System.out.println("Лейбла об отсутствии нет ---");
        return this;
    }

    public TC_1_2 typeСardOfFirstLessonNumber() {
        if (driver.findElements(cardOfFirstLessonNumber).size() > 0) System.out.println("Номер урока есть  +++");
        else System.out.println("Номер урока есть ---");
        return this;
    }


    public TC_1_2 typeСardOfFirstLessonTime() {
        if (driver.findElements(cardOfFirstLessonTime).size() > 0) System.out.println("Время урока есть  +++");
        else System.out.println("Времени урока нет ---");
        return this;
    }

    public TC_1_2 typeLessonIconTypeDOP() {
        if (driver.findElements(lessonIconTypeDOP).size() > 0) System.out.println("Иконка ДОП урока есть  +++");
        else System.out.println("Иконки ДОП урока нет ---");
        return this;
    }



    public TC_1_2 typeLessonIconTypeDist() {
        if (driver.findElements(lessonIconTypeDist).size() > 0) System.out.println("Иконка дист урока есть  +++");
        else System.out.println("Иконки дист урока нет ---");
        return this;
    }


    public TC_1_2  typeCalendarSelector() {
        driver.findElement(calendarSelector).click();
        return this;
    }
    public TC_1_2  typeCalendarSelectorArrow() {


        while(!driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/p")).getText().contains("Январь")){
            driver.findElement(calendarSelectorArrow).click();
        }
        return this;
    }

    public TC_1_2  typeMondaySelector() {
        driver.findElement(mondaySelector).click();
        return this;
    }












}
