package TC_19;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TC_19_3 {
    WebDriver driver;

    public TC_19_3(WebDriver driver) {
        this.driver = driver;
    }


    //Блок с мероприятием
    By blockByEvent = By.xpath("//h5[text()='Мероприятие для автотестов #1 НЕ трогать']");
    //Имя ребенка
    By nameStudent = By.xpath("//p[text()='Геворкян Соня']");
    //Название мероприятия
    By nameEvent  = By.xpath("//p[text()='Мероприятие для автотестов #1 НЕ трогать']");
    //Описание мероприятия
    By descEvent = By.xpath("//p[text()='Описание мероприятия автотесты не трогать #1']");
    //Время проведения мероприятия
    By timeEvent = By.xpath("//p[text()='31 декабря 2022, 16:00 - 19:01']");
    //Адрес
    By addressEvent = By.xpath("//p[text()='Самара']");
    //Тип мероприятия
    By typeEvent = By.xpath("//p[text()='Поход']");
    //Программа
    By programEvent = By.xpath("//p[text()='Дополнительная общеобразовательная программа']");
    //Необходимый документ
    By documentEvent = By.xpath("//p[text()='Паспорт']");
    //Школа
    By shoolEvent = By.xpath("//p[text()='ГБОУ Школа № 1450 \"Олимп\"']");
    //Сопровождающий
    By mentorEvent = By.xpath("//p[text()='Авдоева Гозала Рамазовна']");
    //Телефон ментора
    By mentorPhone = By.xpath("//p[text()='+7 (790) 934-31-21']");


    public TC_19_3 typeMentorPhone() {

        if(driver.findElement(mentorPhone).getText().contains("+7 (790) 934-31-21")){
            System.out.println("Телефон ментора +++");
        }
        else System.out.println("Телефон ментора ---");
        return this;
    }


    public TC_19_3 typeMentorEvent() {

        if(driver.findElement(mentorEvent).getText().contains("Авдоева Гозала Рамазовна")){
            System.out.println("Сопровождающий +++");
        }
        else System.out.println("Сопровождающий ---");
        return this;
    }


    public TC_19_3 typeShoolEvent() {

        if(driver.findElement(shoolEvent).getText().contains("ГБОУ Школа № 1450 \"Олимп\"")){
            System.out.println("Школа +++");
        }
        else System.out.println("Школа ---");
        return this;
    }


    public TC_19_3 typeDocumentEvent() {

        if(driver.findElement(documentEvent).getText().contains("Паспорт")){
            System.out.println("Необходимый документ +++");
        }
        else System.out.println("Необходимый документ ---");
        return this;
    }

    public TC_19_3 typeProgramEvent() {

        if(driver.findElement(programEvent).getText().contains("Дополнительная общеобразовательная программа")){
            System.out.println("Программа +++");
        }
        else System.out.println("Программа ---");
        return this;
    }

    public TC_19_3 typeTypeEvent() {

        if(driver.findElement(typeEvent).getText().contains("Поход")){
            System.out.println("Тип мероприятия +++");
        }
        else System.out.println("Тип мероприятия ---");
        return this;
    }


    public TC_19_3 typeAddressEvent() {

        if(driver.findElement(addressEvent).getText().contains("Самара")){
            System.out.println("Адрес +++");
        }
        else System.out.println("Адрес ---");
        return this;
    }

    public TC_19_3 typeTimeEvent() {

        if(driver.findElement(timeEvent).getText().contains("31 декабря 2022, 16:00 - 19:01")){
            System.out.println("Время проведения мероприятия +++");
        }
        else System.out.println("Время проведения мероприятия ---");
        return this;
    }


    public TC_19_3 typeDescEvent() {

        if(driver.findElement(descEvent).getText().contains("Описание мероприятия автотесты не трогать #1")){
            System.out.println("Описание мероприятия +++");
        }
        else System.out.println("Описание мероприятия ---");
        return this;
    }



    public TC_19_3 typeNameEvent() {

        if(driver.findElement(nameEvent).getText().contains("Мероприятие для автотестов #1 НЕ трогать")){
            System.out.println("Название мероприятия +++");
        }
        else System.out.println("Название мероприятия ---");
        return this;
    }

    public TC_19_3 typeNameStudent() {

        if(driver.findElement(nameStudent).getText().contains("Геворкян Соня")){
            System.out.println("Имя ребенка +++");
        }
        else System.out.println("Имя ребенка ---");
        return this;
    }

    public TC_19_3 typeBlockByEvent() {
        driver.findElement(blockByEvent).click();
        return this;
    }

}



