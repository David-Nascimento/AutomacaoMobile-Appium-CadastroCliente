package br.com.automacao.appium;

import static br.com.automacao.appium.core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import com.cucumber.listener.Reporter;

import br.com.automacao.appium.core.DriverFactory;

public class BaseTeste {

	@Rule
	public TestName testName = new TestName();

	@AfterClass
	public static void finalizaClasse() {
		System.out.println("Finalizando Driver");
		DriverFactory.killDriver();
	}

	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File("config/report.xml"));
	}

	@Before
	public void Setup() throws MalformedURLException {
		getDriver();
	}

	@After
	public void tearDown() {
		gerarScreenShot();
		DriverFactory.getDriver().resetApp();
	}

	public void gerarScreenShot() {
		File imagem = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem, new File("target/screenshots/" + testName.getMethodName() + ".jpg"));
			// "+cenario.getId()+"
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void esperar(long tempoSegundos) {
		try {
			Thread.sleep(tempoSegundos * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}