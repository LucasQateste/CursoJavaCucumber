package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
		
	@Quando("eu informa o usuario {string}")
	public void euInformaOUsuario(String usuario) {
		Na(LoginPage.class).informarCampoUsuario(usuario);
	}
	
	@Quando("informa a senha {string}")
	public void informaASenha(String senha) {
		Na(LoginPage.class).informarCampoSenha(senha);
	}
	
	@Quando("clicar no botao conecte-se")
	public void clicarNoBotaoConecteSe()	 {
		Na(LoginPage.class).acionarBotaoLogin();
	}
	
	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
		assertEquals("Invalid credentials	", driver.findElement(By.id("spamMessage")).getText());
	}
	
	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
	   assertEquals("Welcome Admin", driver.findElement(By.id("Welcome")).getText());
	}
}