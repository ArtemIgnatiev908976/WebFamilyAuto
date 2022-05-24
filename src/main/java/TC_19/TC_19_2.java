package TC_19;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TC_19_2 {
    WebDriver driver;

    public TC_19_2(WebDriver driver) {
        this.driver = driver;
    }

    //Блок с мероприятием
    By blockByEvent = By.xpath("//h5[text()='Мероприятие для автотестов #1 НЕ трогать']");
    //Нейм блока согласия
    By nameBlockConsent = By.xpath("//h2[text()='Согласия']");
    //Иконка все дети
    By iconAllChildren = By.xpath("//p[text()='Все']");
    //Иконка ребенка
    By iconChildren = By.xpath("//span[text()='ГС']");
    //Иконка ребенка2
    By iconChildren2 = By.xpath("//span[text()='ГА']");
    //Закладка все
    By tabAll = By.xpath("//a/p[text()='Все']");
    //Закладка Вакцинация
    By tabVaccination = By.xpath("//a/p[text()='Вакцинация']");
    //Закладка выездные мероприятия
    By tabEvent = By.xpath("//a/p[text()='Выездные мероприятия']");
    //Стрелка назад
    By backButton = By.xpath("//*[@id=\"root\"]/div[2]/main/div[2]/div/div/div[1]/button");
    //Кнопка архива
    By archiveButton = By.xpath("//span[text()='архив']");
    //Кнопка загрузить ещё
    By loadStillButton = By.xpath("//a[text()='Загрузить ещё']");
    //Кнопка настройки
    By settingsButton = By.xpath("//p[text()='Настройки']");
    //Селектр все статусы
    By selectorAllStatus = By.xpath("//p[text()='Все статусы']");
    //Селектор Требуется согласие/отказ
    By selectorYesOrNo = By.xpath("//p[text()='Требуется согласие/отказ']");
    //Согласие получено
    By selectorYes = By.xpath("//p[text()='Согласие получено']");
    //Отказ получен
    By selectorNo = By.xpath("//p[text()='Отказ получен']");



    public TC_19_2 typeSelectorNo() {

        if(driver.findElement(selectorNo).getText().contains("Отказ получен")){
            System.out.println("Отказ получен +++");
        }
        else System.out.println("Отказ получен ---");
        return this;
    }

    public TC_19_2 typeSelectorYes() {

        if(driver.findElement(selectorYes).getText().contains("Согласие получено")){
            System.out.println("Согласие получено +++");
        }
        else System.out.println("Согласие получено ---");
        return this;
    }

    public TC_19_2 typeSelectorYesOrNo() {

        if(driver.findElement(selectorYesOrNo).getText().contains("Требуется согласие/отказ")){
            System.out.println("Требуется согласие/отказ +++");
        }
        else System.out.println("Требуется согласие/отказ ---");
        return this;
    }

    public TC_19_2 typeSelectorAllStatus() {

        if(driver.findElement(selectorAllStatus).getText().contains("Все статусы")){
            System.out.println("Все статусы +++");
        }
        else System.out.println("Все статусы ---");
        return this;
    }


    public TC_19_2 typeSettingsButton() {

        driver.findElement(settingsButton).click();
        return this;
    }

    public TC_19_2 typeNameEvent() {

        if(driver.findElement(blockByEvent).getText().contains("Мероприятие для автотестов #1 НЕ трогать")){
            System.out.println("Название мероприятия +++");
        }
        else System.out.println("Название мероприятия ---");
        return this;
    }

    public TC_19_2 typeIconChildren2() {

        driver.findElement(iconChildren2).click();
        return this;
    }

    public TC_19_2 typeLoadStillButton() {
        driver.findElement(loadStillButton).click();
        return this;
    }
    public TC_19_2 typeArchiveButton() {
        driver.findElement(archiveButton).click();
        return this;
    }
    public TC_19_2 typeBackButton() {
        driver.findElement(backButton).click();
        return this;
    }
    public TC_19_2 typeBlockByEvent() {
        driver.findElement(blockByEvent).click();
        return this;
    }

    public TC_19_2 typeTabAllClick() {
        driver.findElement(tabAll).click();
        return this;
    }


    public TC_19_2 typeTabEvent() {

        if(driver.findElement(tabEvent).getText().contains("Выездные мероприятия")){
            System.out.println("Закладка выездные мероприятия +++");
        }
        else System.out.println("Закладка выездные мероприятия ---");
        return this;
    }

    public TC_19_2 typeTabVaccination () {

        if(driver.findElement(tabVaccination).getText().contains("Вакцинация")){
            System.out.println("Закладка Вакцинация +++");
        }
        else System.out.println("Закладка Вакцинация ---");
        return this;
    }

    public TC_19_2 typeTabAll() {

        if(driver.findElement(tabAll).getText().contains("Все")){
            System.out.println("Закладка все +++");
        }
        else System.out.println("Закладка все ---");
        return this;
    }

    public TC_19_2 typeIconChildren() {

        if(driver.findElement(iconChildren).getText().contains("ГС")){
            System.out.println("Иконка ребенка +++");
        }
        else System.out.println("Иконка ребенка ---");
        return this;
    }

    public TC_19_2 typeIconAllChildren() {

        if(driver.findElement(iconAllChildren).getText().contains("Все")){
            System.out.println("Иконка все дети +++");
        }
        else System.out.println("Иконка все дети ---");
        return this;
    }

    public TC_19_2 typeNameBlockConsent() {

        if(driver.findElement(nameBlockConsent).getText().contains("Согласия")){
            System.out.println("Нейм блока согласия +++");
        }
        else System.out.println("Нейм блока согласия ---");
        return this;
    }
}



