package br.com.automacao.pages;

import org.openqa.selenium.By;

import br.com.automacao.appium.BasePage;

public class PrincipalPage extends BasePage {

	private final By mensagemTelaPrincial = By.id("br.com.dudstecnologia.cadastrodeclientes:id/txtNenhumCliente");

	private final By tituloTela = By.className("android.widget.TextView");

	private final By botaoAdicionar = By.className("android.widget.ImageButton");

	private final By botaoCadastrarNovo = By.id("floating_novo");

	private final By botaoExportarDados = By.id("br.com.dudstecnologia.cadastrodeclientes:id/floating_exportar");

	private final By botaoSobreoAPP = By.id("br.com.dudstecnologia.cadastrodeclientes:id/floating_sobre");

	private final By botaoOpcoes = By.xpath("//android.widget.ImageButton[@index='7']");

	public String obterMensagemTelaPrincilal() {
		return obterTexto(mensagemTelaPrincial);
	}

	public String obterTituloTelaPrincilal() {
		return obterTexto(tituloTela);
	}

	public void cliqueBotaoAdicionar() {
		clique(botaoAdicionar);
	}

	public void cliqueBotaoCadastrarNovo() {
		clique(botaoCadastrarNovo);
	}

	public void cliqueBotaoExportarDados() {
		clique(botaoExportarDados);
	}

	public void cliqueBotaoSobreoAPP() {
		clique(botaoSobreoAPP);
	}

	public void cliqueBotaoOpcoes() {
		clique(botaoOpcoes);
	}

}
