package br.com.automacao.pages;

import org.openqa.selenium.By;

import br.com.automacao.appium.BasePage;
import br.com.automacao.appium.entity.ClienteEntity;
import br.com.automacao.factory.ClienteFactory;

public class CadastroClientePage extends BasePage {

	private final By campoNome = By.id("editNome");
	private final By campoRG = By.id("editRg");
	private final By campoCPF = By.id("editCpf");
	private final By campoDataNascimento = By.id("editData");
	private final By campoEndereco = By.id("editEndereco");
	private final By campoNumero = By.id("editNumero");
	private final By campoBairro = By.id("editBairro");
	private final By campoCEP = By.id("editCep");
	private final By campoCidade = By.id("editCidade");
	private final By campoTelefone1 = By.id("editTelefone1");
	private final By campoTelefone2 = By.id("editTelefone2");
	private final By campoEmail = By.id("editEmail");
	private final By campoObservacao = By.id("editObs");
	private final By botaoExcluir = By.id("btnExcluir");
	private final By botaoSalvar = By.id("btnSalvar");
	private final By tituloMensagemAlerta = By.id("alertTitle");
	private final By mensagemAlerta = By.id("android:id/message");
	private final By botaoOk = By.id("android:id/button1");
	private final By foto = By.id("br.com.dudstecnologia.cadastrodeclientes:id/imagemCliente");
	private final By camera = By.id("android:id/text1");
	
	public void preencherCampoNome(String nome) {
		escrever(campoNome, nome);
	}

	public void preencherCampoRg(String rg) {
		escrever(campoRG, rg);
	}

	public void preencherCampoCpf(String cpf) {
		escrever(campoCPF, cpf);
	}

	public void preencherCampoDataNascimento(String dataNascimento) {
		escrever(campoDataNascimento, dataNascimento);
	}

	public void preencherCampoEndereco(String endereco) {
		escrever(campoEndereco, endereco);
	}

	public void preencherCampoNumero(String numero) {
		escrever(campoNumero, numero);
	}

	public void preencherCampoBairro(String bairro) {
		escrever(campoBairro, bairro);
	}

	public void preencherCampoCEP(String cep) {
		escrever(campoCEP, cep);
	}

	public void preencherCampoCidade(String cidade) {
		escrever(campoCidade, cidade);
	}

	public void preencherCampoTelefone1(String telefone1) {
		escrever(campoTelefone1, telefone1);
	}

	public void preencherCampoTelefone2(String telefone2) {
		escrever(campoTelefone2, telefone2);
	}

	public void preencherCampoEmail(String email) {
		escrever(campoEmail, email);
	}

	public void preencherCampoObservacao(String observacao) {
		escrever(campoObservacao, observacao);
	}

	public void cliqueBotaoSalvar() {
		clique(botaoSalvar);
	}

	public void cliqueBotaoExcluir() {
		clique(botaoExcluir);
	}
	
	public void cliqueBotaoOk() {
		clique(botaoOk);
	}
	
	public void cliqueFoto() {
		clique(foto);
	}
	
	public void cliqueCamera() {
		clique(camera);
	}
	
	public String getCampoNome(){
		return obterTexto(campoNome);
	}
	
	public String getCampoRg(){
		return obterTexto(campoRG);
	}
	
	public String getCampoCpf(){
		return obterTexto(campoCPF);
	}
	
	public String getCampoDataNascimento(){
		return obterTexto(campoDataNascimento);
	}
	
	public String getCampoEndereco(){
		return obterTexto(campoEndereco);
	}
	
	public String getCampoNumero(){
		return obterTexto(campoNumero);
	}
	
	public String getCampoBairro(){
		return obterTexto(campoBairro);
	}
	
	public String getCampoCep(){
		return obterTexto(campoCEP);
	}
	
	public String getCampoCidade(){
		return obterTexto(campoCidade);
	}
	
	public String getCampoTelefone1(){
		return obterTexto(campoTelefone1);
	}
	
	public String getCampoTelefone2(){
		return obterTexto(campoTelefone2);
	}
	
	public String getCampoEmail(){
		return obterTexto(campoEmail);
	}
	
	public String getCampoObservacao(){
		return obterTexto(campoObservacao);
	}
	
	public String getTituloMensagemAlerta(){
		return obterTexto(tituloMensagemAlerta);
	}
	
	public String getMensagemAlerta(){
		return obterTexto(mensagemAlerta);
	}
	
	public void preencherDadosCliente(){
		ClienteEntity cliente = ClienteFactory.getCliente();
		preencherCampoNome(cliente.getNome());
		preencherCampoRg(cliente.getRg());
		preencherCampoCpf(cliente.getCpf());
		preencherCampoDataNascimento(cliente.getDataNascimento());
		preencherCampoEndereco(cliente.getEndereco());
		preencherCampoNumero(cliente.getNumero());
		preencherCampoBairro(cliente.getBairro());
		preencherCampoCEP(cliente.getCep());
		preencherCampoCidade(cliente.getCidade());
		scroll(0.7,0.1);
		preencherCampoTelefone1(cliente.getTelefone1());
		preencherCampoTelefone2(cliente.getTelefone2());
		preencherCampoEmail(cliente.getEmail());
		preencherCampoObservacao(cliente.getObservacao());
	}

}