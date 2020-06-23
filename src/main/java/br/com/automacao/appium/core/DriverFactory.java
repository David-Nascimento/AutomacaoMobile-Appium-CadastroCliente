package br.com.automacao.appium.core;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			try {
				createDriver();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// createTestObjectDriver(); //Execucao remota
		}
		return driver;
	}

	private static void createDriver() throws IOException {
		System.out.println("Inicializando Driver");

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		String path = new File("src/test/resources/apk/cadastro_clientes_teste.apk").getCanonicalPath();
		desiredCapabilities.setCapability(MobileCapabilityType.APP, path);
		desiredCapabilities.setCapability("autoGrantPermissions", "true");
		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	private static void createTestObjectDriver() {
		System.out.println("Inicializando Driver Curso Factory");
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		// desiredCapabilities.setCapability("testobject_api_key",
		// "FDFC8E35554D4710B1A6C4919FF1FDF3");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("autoGrantPermissions", "true");

		desiredCapabilities.setCapability("appPackage", "com.ctappium");
		desiredCapabilities.setCapability("appActivity", "com.ctappium.MainActivity");
		desiredCapabilities.setCapability("showChromedriverLog", "true");
		try {
			// driver = new AndroidDriver<MobileElement>(new
			// URL("https://us1-manual.app.testobject.com/wd/hub"),
			// desiredCapabilities);
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
