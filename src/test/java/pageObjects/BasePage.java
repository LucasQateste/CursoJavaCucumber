package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

    @FindBy(linkText = "Submit")
    public WebElement abaAdmin;

    @FindBy(linkText = "Pim")
    public WebElement abaPim;

    @FindBy(id = "menu_pim_Configuration")
    public WebElement menuConfiguration;

    @FindBy(id = "menu_pim_listCustomFields")
    public WebElement menuField;

}
