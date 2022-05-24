package TC_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_2_3 {
    WebDriver driver;

    public TC_2_3(WebDriver driver) {
        this.driver = driver;
    }


    //Ссылка перехода в учебу
    By linkLearn = By.xpath("//a/p[text()='Учеба']");
    //Профиль учебного плана
    By  profileYP = By.xpath("//span[text()='Технологический']");
    //Форма обучения
    By formLearn = By.xpath("//span[text()='очная']");
    //Направленность
    By napravlennost = By.xpath("//span[text()='Учебные курсы, обеспечивающие образовательные потребности обучающихся']");
    //Уровень образования
    By levelOfStudy = By.xpath("//span[text()='уровень ООО']");
    //Параллель
    By parallelOfLearn = By.xpath("//span[text()='9 параллель']");
    //Неделя
    By weekOfLearn = By.xpath("//span[text()='6 дневная']");
    //Предмет
    By objectOfLearn = By.xpath("//p[text()='Астрономия']");
    //Часы по программе
    By timeOfProgramm = By.xpath("//p[text()='28 занятий']");
    //Количество часов в неделю
    By timeOfWeek = By.xpath("//p[text()='1 часов в неделю']");

    //Карточка программы
    By cardOfProgramm = By.xpath("//div/p[text()='История России. Всеобщая история']/parent::div");
    //Название темы урока
    By topicName = By.xpath("//p[text()='Россия в эпоху великих реформ']/parent::div");
    //Кол-во часов в теме
    By hoursOfTopic = By.xpath("//p[text()='5 занятий']/parent::div");
    //Раскрыть карточку темы
    By openTopic = By.xpath("//p[text()='Россия в эпоху великих реформ']/parent::div");
    //Название урока в теме
    By lessonNameInTopic = By.xpath("//p[text()='Судебная реформа Александра II']");


    public TC_2_3 typeLessonNameInTopic() {

        if(driver.findElement(lessonNameInTopic).getText().contains("Судебная реформа Александра II")){
            System.out.println("Название урока в теме +++");
        }
        else System.out.println("Название урока в теме ---");
        return this;
    }


    public TC_2_3 typeOpenTopic() {
        driver.findElement(openTopic).click();
        return this;
    }


    public TC_2_3 typeHoursOfTopic() {

        if(driver.findElement(hoursOfTopic).getText().contains("5 занятий")){
            System.out.println("Количество часов +++");
        }
        else System.out.println("Количество часов ---");
        return this;
    }


    public TC_2_3 typeTopicName() {

        if(driver.findElement(topicName).getText().contains("Россия в эпоху великих реформ")){
            System.out.println("Название темы +++");
        }
        else System.out.println("Название темы ---");
        return this;
    }

    public TC_2_3 typeCardOfProgramm() {
        driver.findElement(cardOfProgramm).click();
        return this;
    }

    public TC_2_3 typeTimeOfWeek() {

        if(driver.findElement(timeOfWeek).getText().contains("1 часов в неделю")){
            System.out.println("Количество часов в неделю +++");
        }
        else System.out.println("Количество часов в неделю ---");
        return this;
    }


    public TC_2_3 typeTimeOfProgramm() {

        if(driver.findElement(timeOfProgramm).getText().contains("28 занятий")){
            System.out.println("Часы по программе +++");
        }
        else System.out.println("Часы по программе ---");
        return this;
    }


    public TC_2_3 typeObjectOfLearn() {

        if(driver.findElement(objectOfLearn).getText().contains("Астрономия")){
            System.out.println("Предмет +++");
        }
        else System.out.println("Предмет ---");
        return this;
    }

    public TC_2_3 typeWeekOfLearn() {

        if(driver.findElement(weekOfLearn).getText().contains("6 дневная")){
            System.out.println("Неделя +++");
        }
        else System.out.println("Неделя ---");
        return this;
    }

    public TC_2_3 typeParallelOfLearn() {

        if(driver.findElement(parallelOfLearn).getText().contains("9 параллель")){
            System.out.println("Параллель +++");
        }
        else System.out.println("Параллель ---");
        return this;
    }


    public TC_2_3 typeLevelOfStudy() {

        if(driver.findElement(levelOfStudy).getText().contains("уровень ООО")){
            System.out.println("Уровень образования +++");
        }
        else System.out.println("Уровень образования ---");
        return this;
    }

    public TC_2_3 typeNapravlennost() {

        if(driver.findElement(napravlennost).getText().contains("Учебные курсы, обеспечивающие образовательные потребности обучающихся")){
            System.out.println("Направленность есть +++");
        }
        else System.out.println("Направленности нет ---");
        return this;
    }


    public TC_2_3 typeFormLearn() {

        if(driver.findElement(formLearn).getText().contains("очная")){
            System.out.println("Форма обучения есть +++");
        }
        else System.out.println("Формы обучения нет ---");
        return this;
    }

    public TC_2_3 typeProfileYP() {

        if(driver.findElement(profileYP).getText().contains("Технологический")){
            System.out.println("Профиль есть +++");
        }
        else System.out.println("Профиля нет ---");
        return this;
    }

    public TC_2_3 typeLinkLearn() {
        driver.findElement(linkLearn).click();
        return this;
    }


}
