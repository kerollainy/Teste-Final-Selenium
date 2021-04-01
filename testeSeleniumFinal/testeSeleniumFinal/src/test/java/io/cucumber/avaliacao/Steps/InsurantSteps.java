package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.avaliacao.Pages.InsurantPage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class InsurantSteps extends Configuracao {

    @Quando("digito First {string} Name")
    public void digito_First_Name(String string) {
        InsurantPage.inputFirstName(browser).sendKeys(string);
    }

    @Quando("digito Last {string} Name")
    public void digito_Last_Name(String string) {
        InsurantPage.inputLastName(browser).sendKeys(string);
    }

    @Quando("escolho Date of Birth {string}")
    public void escolho_Date_of_Birth(String string) {
        InsurantPage.dataBirth(browser).sendKeys(string);
    }

    @Quando("escolho Gender")
    public void escolho_Gender() throws InterruptedException {
		WebElement element = InsurantPage.inputGender(browser);
		Actions actions = new Actions(browser);
		actions.moveToElement(element).click().perform();
    }

    @Quando("digito Street {string}")
    public void digito_Street(String string) {
        InsurantPage.inputAddress(browser).sendKeys(string);
    }

    @Quando("escolho Country")
    public void escolho_Country() {
        InsurantPage.selectCountry(browser).click();
    }

    @Quando("digito {string} Code")
    public void digito_Code(String string) {
        InsurantPage.inputZipecode(browser).sendKeys(string);
    }

    @Dado("digito cidade {string}")
    public void digito_cidade(String string) {
        InsurantPage.inputCity(browser).sendKeys(string);
    }

    @Quando("escolho Occupation")
    public void escolho_Occupation() {
        InsurantPage.selectOccupation(browser).click();
    }

    @Quando("escolho Hobbies")
    public void escolho_Hobbies() {
        WebElement element = InsurantPage.inputHobbies(browser);
		Actions actions = new Actions(browser);
		actions.moveToElement(element).click().perform();
    }

    @Dado("digito website {string}")
    public void digito_website(String string) {
        InsurantPage.inputWebsite(browser).sendKeys(string);
    }
    
	@Entao("clico next para Product")
	public void clico_next_para_product() {
		InsurantPage.buttonNext(browser).click();
	}

}
