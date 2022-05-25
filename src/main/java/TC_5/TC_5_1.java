package TC_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_5_1 {
    WebDriver driver;

    public TC_5_1(WebDriver driver) {
        this.driver = driver;
    }



    //Ссылка оценок
    By linkMarks = By.xpath("//a/p[text()='Оценки']");

    //Кнопка по предмету
    By forSubjectButton = By.xpath("//span[text()='По предмету']/parent::button");
    //Оценки ученика
    By marksOfStudent = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div[2]");
    //Период с оценками
    By yearMarks = By.xpath("//p[text()='Годовая оценка']/parent::div");
    //Период
    By periodMark = By.xpath("//p[text()='4 период']");
    //Блок с оценками
    By marks = By.xpath("//h4[text()='Зчт']/parent::div");
    //Средний балл
    By middleBall = By.xpath("//span[text()='4.33']/parent::div");
    //Итоговая оценка
    By finalMark = By.xpath("//span[@class='MuiTypography-root MuiTypography-h5' and contains(text(),'5')]/parent::div");

    public TC_5_1 typeFinalMark() {
        if (driver.findElements(finalMark).size() > 0) System.out.println("Блок с годовой оценкой есть  +++");
        else System.out.println("Блока с годовой оценкой нет ---");
        return this;
    }

    public TC_5_1 typeMiddleBall() {
        if (driver.findElements(middleBall).size() > 0) System.out.println("Блок с средним баллом есть  +++");
        else System.out.println("Блока с средним баллом нет ---");
        return this;
    }

    public TC_5_1 typeMarks () {
        if (driver.findElements(marks).size() > 0) System.out.println("Блок c оценками есть  +++");
        else System.out.println("Блока с оценками нет ---");
        return this;
    }


    public TC_5_1 typePeriodMark() {
        if(driver.findElement(periodMark).getText().contains("4 период")){
            System.out.println("Период +++");
        }
        else System.out.println("Период ---");
        return this;
    }


    public TC_5_1  typeYearMarks() {
        driver.findElement(yearMarks).click();
        return this;
    }


    public TC_5_1 typeMarksOfStudent() {
        if (driver.findElements(marksOfStudent).size() > 0) System.out.println("Блок с оценками есть  +++");
        else System.out.println("Блока с оценками нет ---");
        return this;
    }

    public TC_5_1 typeForSubjectButton() {
        driver.findElement(forSubjectButton).click();
        return this;
    }

    public TC_5_1  typeLinkMarks() {
        driver.findElement(linkMarks).click();
        return this;
    }

}
