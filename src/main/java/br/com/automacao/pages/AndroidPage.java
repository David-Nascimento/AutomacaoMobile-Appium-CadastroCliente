package br.com.automacao.pages;

import org.openqa.selenium.By;

import br.com.automacao.appium.BasePage;

public class AndroidPage extends BasePage {
	
	private final By menuOpcoes = By.xpath("//android.widget.ImageButton");
	private final By downloads = By.xpath("//*[@text=\"Downloads\"]");
	private final By camera = By.id("android:id/text1");
	private final By capturarImagem = By.id("com.android.camera2:id/shutter_button");
	private final By confirmarCapturaImagem = By.id("com.android.camera2:id/done_button");
	private final By cropImagem = By.id("br.com.dudstecnologia.cadastrodeclientes:id/crop_image_menu_crop");

	public void cliqueCamera() {
		aguardarElementoVisivel(camera);
		clique(camera);
	}
	
	public void cliqueCropImage() {
		aguardarElementoVisivel(cropImagem);
		clique(cropImagem);
	}
	
	public void tirarFoto() {
		clique(capturarImagem);
		clique(confirmarCapturaImagem);
		clique(cropImagem);
	}
			
	public void cliqueMenuOpcao() {
		aguardarElementoVisivel(menuOpcoes);
		clique(menuOpcoes);
	}
	
	public void cliqueDownloads() {
		aguardarElementoVisivel(downloads);
		clique(downloads);
		swipeDown();
	}
}
