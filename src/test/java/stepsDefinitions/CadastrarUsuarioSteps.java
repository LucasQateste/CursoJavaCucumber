package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class CadastrarUsuarioSteps {

    @Quando("eu acionar a aba admin")
    public void euAcionarAAbaAdmin(){
        Na(TelaInicialPage.class).acionarAbaAdmin();
    }

    @Quando("acionar o botao add")
    public void acionarOBotaoAdd(){
        Na(TelaInicialPage.class).acionarBotaoAdd();
    }

    @Quando("informa no campo employer name {string}")
    public void informaNoCampoEmployerName(String employerName){
        Na(CadastrarUsuarioPage.class).informarCampoEmployerName(employerName);
    }
    @Quando("informa no campo username {string}")
    public void informaNoCampoUsername(String username) {
        Na(CadastrarUsuarioPage.class).informarCampoUsername(username);
    }

    @Quando("informa no campo password {string}")
    public void informaNoCampoPassword(String password) {
        Na(CadastrarUsuarioPage.class).informarCampoPassword(password);
    }

    @E("^acionar o botao salvar$")
    public void acionarOBotaoSalvar() throws Throwable {
        Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
    }

//    @Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
//    public void oSistemaCadastraOUsuario(String arg1) throws Throwable {
//        assertTrue(driver.findElement(By.xpath("//a[text()='" +userName+ "']")).isDisplayed());
//    }
}
