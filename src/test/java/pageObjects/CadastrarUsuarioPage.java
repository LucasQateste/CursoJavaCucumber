package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

    @FindBy(id = "systemUser_employeeName_empName")
    public WebElement campoEmployer;

    @FindBy(name = "systemUser[userName]")
    public WebElement campoUsername;

    @FindBy(name = "systemUser[password]")
    public WebElement campoPassword;

    @FindBy(name = "systemUser[confimarPassword]")
    public WebElement campoConfirmaPassword;

    @FindBy(name = "btnSave")
    public WebElement botaoSalvar;

    public void informarCampoEmployerName(String employerName) {
        campoEmployer.sendKeys(employerName);
    }

    public void informarCampoUsername(String userName) {
        campoUsername.sendKeys(userName);
    }

    public void informarCampoPassword(String senha) {
        campoPassword.sendKeys(senha);
    }

    public void informarCampoConfirmaPassword(String senha) {
        campoConfirmaPassword.sendKeys(senha);
    }

    public void acionarBotaoSalvar() {
        botaoSalvar.click();
    }
}
