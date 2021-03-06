package io.cucumber.avaliacao.Steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.avaliacao.Pages.SendQuotePage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class SendQuoteSteps extends Configuracao {

    @Dado("preencho o email {string}")
    public void preencho_o_email(String string) {
        SendQuotePage.inputEmail(browser).sendKeys(string);
    }
    
    @Dado("digito um telefone {string}")
    public void digito_um_telefone(String string) {
        SendQuotePage.inputPhone(browser).sendKeys(string);
    }
    
    @Dado("escolho um nome de usuario {string}")
    public void escolho_um_nome_de_usuario(String string) {
        SendQuotePage.inputUsername(browser).sendKeys(string);
    }
    
    @Dado("escolho uma senha {string}")
    public void escolho_uma_senha(String string) {
        SendQuotePage.inputPassword(browser).sendKeys(string);
    }
    
    @Dado("confirmo a senha Confirm {string}")
    public void confirmo_a_senha_Confirm(String string) {
        SendQuotePage.inputConfirmPassword(browser).sendKeys(string);
    }
    
    @Quando("clico em Send")
    public void clico_em_Send() {
        SendQuotePage.buttonSend(browser).click();
    }
    
    @Entao("Verifico a mensagem {string}")
    public void verifico_a_mensagem(String string) throws InterruptedException {
        Thread.sleep(12000);
		assertEquals(string, SendQuotePage.menssagemSucesso(browser).getText());
    }    

    @Quando("clico no botao Ok")
    public void clico_no_botao_Ok() {
        SendQuotePage.buttonOk(browser).click();
        browser.close();
    }

    
}
