package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.avaliacao.Pages.VehiclePage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class VehicleSteps extends Configuracao{

	@Quando("entro no site")
	public void entro_no_site() {
		Configuracao.open("http://sampleapp.tricentis.com/101/app.php");
	}

	@Quando("seleciono uma opcao Make")
	public void seleciono_uma_opcao_Make() {
		VehiclePage.selectMake(browser).click();
	}

	@Quando("seleciono o Model")
	public void seleciono_o_Model() {
		VehiclePage.selectModel(browser).click();
	}

	@Quando("digito o {} Capacity")
	public void digito_o_Capacity(String string) {
		VehiclePage.inputCylender(browser).sendKeys(string);
	}	

	@Quando("digito no campo {} Performance")
	public void digito_no_campo_Engine_Performance(String string) {
		VehiclePage.inputEngine(browser).sendKeys(string);
	}	

	@Quando("seleciono Date of Manufacture")
	public void seleciono_Date_of_Manufacture() throws InterruptedException {
		VehiclePage.buttonCalendario(browser).click();
		Thread.sleep(2000);
		VehiclePage.dataCalendario(browser).click();
	}
	
	@Quando("seleciono Number of Seats")
	public void seleciono_Number_of_Seats() {
		VehiclePage.opcoesSeats(browser).click();
	}

	@Quando("seleciono Right Hand Drive")
	public void seleciono_Right_Hand_Drive() throws InterruptedException {
		WebElement element = VehiclePage.rightHandDrive(browser);
		Actions actions = new Actions(browser);
		actions.moveToElement(element).click().perform();
	}	

	@Quando("seleciono Number of Seats motorcycle")
	public void seleciono_Number_of_Seats_motorcycle() {
		VehiclePage.opcoesSeatsMotorcycle(browser).click();
	}

	@Quando("seleciono Fuel Type")
	public void seleciono_Fuel_Type() {
		VehiclePage.opcoesFuel(browser).click();
	}

	@Quando("digito campo {} [kg]")
	public void digito_campo_kg(String string) {
		VehiclePage.inputPayload(browser).sendKeys(string);
	}
	
	@Quando("digito Total {} [kg]")
	public void digito_Total_kg(String string) {
		VehiclePage.inputWeight(browser).sendKeys(string);
	}	
		
	@Quando("digito List {}")
	public void digito_List(String string) {
		VehiclePage.inputPrice(browser).sendKeys(string);
	}

	@Quando("digito {} Plate Number")
	public void digito_Plate_Number(String string) {
		VehiclePage.inputLicense(browser).sendKeys(string);
	}

	@Quando("digito Annual {}")
	public void digito_Annual(String string) {
		VehiclePage.inputMileage(browser).sendKeys(string);
	}

	@Entao("clico next para Insurant")
	public void clico_next_para_insurant() {
		VehiclePage.buttonNext(browser).click();
	}

}