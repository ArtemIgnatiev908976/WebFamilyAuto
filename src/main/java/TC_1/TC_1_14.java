package TC_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_1_14 {
    WebDriver driver;
    public TC_1_14(WebDriver driver) {
        this.driver = driver;
    }


    By calendarSelector = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[1]/div/div[1]/div[1]/div/button[1]");
    By calendarSelectorArrow = By.xpath("/html/body/div[2]/div/div[1]/button[1]");
    //Выбор 1 недели
    By WeekSelector = By.xpath("/html/body/div[2]/div/div[2]/button");
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
    //Кнопка настройки
    By ButtonSettings = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[1]/div/div[2]/div/div");
    //Переключатель 7 дней
    By Day7Button = By.xpath("/html/body/div[2]/div/div/div[1]/div/button[2]");
    //Расписание на 7 дней
    By Shedule7Days = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]");
    //Вторник
    By TuesdayButton = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[1]/div/div[1]/div[2]/button[3]");
    //Пятница
    By FridayButton = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[1]/div/div[1]/div[2]/button[6]");
    //Отсутствие
    By Absence = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[9]/div/div/div[1]/div/div[2]");
    //Б
    By O = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[11]/div/div/div[1]/div/div[2]/div[3]");
    //H
    By H = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[3]/div[3]");
    //Переключение недели
    By LastWeek = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[1]/div/div[1]/div[2]/button[9]");

    public TC_1_14  typeLastWeek() {
        driver.findElement(LastWeek).click();
        return this;
    }

    public TC_1_14 typeH() {

        if(driver.findElement(H).getText().contains("Н")){
            System.out.println("Н  +++");
        }
        else System.out.println("Н ---");
        return this;
    }
    public TC_1_14  typeFridayButton() {
        driver.findElement(FridayButton).click();
        return this;
    }



    public TC_1_14 typeO() {

        if(driver.findElement(O).getText().contains("О")){
            System.out.println("О  +++");
        }
        else System.out.println("О ---");
        return this;
    }

    public TC_1_14 typeAbsence() {

        if(driver.findElement(Absence).getText().contains("ОТСУТСТВИЕ")){
            System.out.println("Отсутствие  +++");
        }
        else System.out.println("Отсутствие ---");
        return this;
    }



    public TC_1_14  typeTuesdayButton() {
        driver.findElement(TuesdayButton).click();
        return this;
    }

    public TC_1_14 typeShedule7Days() {
        if (driver.findElements(Shedule7Days).size() > 0) System.out.println("Блок расписания есть +++");
        else System.out.println("Блока раписания нет ---");
        return this;
    }

    public TC_1_14  typeDay7Button() {
        driver.findElement(Day7Button).click();
        return this;
    }

    public TC_1_14  typeButtonSettings() {
        driver.findElement(ButtonSettings).click();
        return this;
    }

    public TC_1_14 typeTurnLesson() {
        if (driver.findElements(TurnLesson).size() > 0) System.out.println("Перемена есть  +++");
        else System.out.println("Перемены нет ---");
        return this;
    }

    public TC_1_14  typeSaturdayDay() {
        driver.findElement(SaturdayDay).click();
        return this;
    }


    public TC_1_14 typeTodaySchedule() {
        if (driver.findElements(TodaySchedule).size() > 0) System.out.println("Блок расписания есть  +++");
        else System.out.println("Блока расписаиня нет ---");
        return this;
    }


    public TC_1_14 typeDopGroups() {
        if (driver.findElements(DopGroups).size() > 0) System.out.println("Блок с группами доп есть  +++");
        else System.out.println("Блока с группами доп нет ---");
        return this;
    }

    public TC_1_14 typeLessonAbsence() {
        if (driver.findElements(lessonAbsence).size() > 0) System.out.println("Лейбл об отсутствии есть  +++");
        else System.out.println("Лейбла об отсутствии нет ---");
        return this;
    }

    public TC_1_14 typeСardOfFirstLessonNumber() {
        if (driver.findElements(cardOfFirstLessonNumber).size() > 0) System.out.println("Номер урока есть  +++");
        else System.out.println("Номер урока есть ---");
        return this;
    }


    public TC_1_14 typeСardOfFirstLessonTime() {
        if (driver.findElements(cardOfFirstLessonTime).size() > 0) System.out.println("Время урока есть  +++");
        else System.out.println("Времени урока нет ---");
        return this;
    }

    public TC_1_14 typeLessonIconTypeDOP() {
        if (driver.findElements(lessonIconTypeDOP).size() > 0) System.out.println("Иконка ДОП урока есть  +++");
        else System.out.println("Иконки ДОП урока нет ---");
        return this;
    }



    public TC_1_14 typeLessonIconTypeDist() {
        if (driver.findElements(lessonIconTypeDist).size() > 0) System.out.println("Иконка дист урока есть  +++");
        else System.out.println("Иконки дист урока нет ---");
        return this;
    }

    public TC_1_14 typeCalendarSelector() {
        driver.findElement(calendarSelector).click();
        return this;
    }
    public TC_1_14  typeCalendarSelectorArrow() {


        while(!driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/p")).getText().contains("Март")){
            driver.findElement(calendarSelectorArrow).click();
        }
        return this;
    }

    public TC_1_14  typeWeekSelector() {
        driver.findElement(WeekSelector).click();
        return this;
    }


}
