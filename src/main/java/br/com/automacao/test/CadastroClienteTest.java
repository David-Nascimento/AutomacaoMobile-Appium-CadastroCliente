package br.com.automacao.test;



import org.junit.Assert;
import org.junit.Test;

import br.com.automacao.appium.BaseTeste;
import br.com.automacao.pages.CadastroClientePage;
import br.com.automacao.pages.PrincipalPage;

public class CadastroClienteTest extends BaseTeste {

	@Test
	public void validarTelaPrincipal() {
		PrincipalPage page = new PrincipalPage();
		Assert.assertEquals(page.obterMensagemTelaPrincilal(), "Nenhum cliente cadastrado");
		Assert.assertEquals(page.obterTituloTelaPrincilal(), "Cadastro de Clientes");
		page.cliqueBotaoAdicionar();
		Assert.assertTrue(page.existeElementoPorTexto("Cadastrar Novo"));
		Assert.assertTrue(page.existeElementoPorTexto("Exportar Dados"));
		Assert.assertTrue(page.existeElementoPorTexto("Sobre o App"));
		Assert.assertTrue(page.existeElementoPorTexto("Cadastrar Novo"));
		Assert.assertTrue(page.existeElementoPorTexto("Opções"));
	}
	
	@Test
	public void acessarPaginaCadastroCliente() {
		PrincipalPage page = new PrincipalPage();
		page.cliqueBotaoAdicionar();
		page.cliqueBotaoCadastrarNovo();
		Assert.assertTrue(page.existeElementoPorTexto("Cadastro de Clientes"));
		
	}
	
	@Test
	public void acessarPaginaCadastroClienteComTelaRetrato() throws InterruptedException {
		PrincipalPage page = new PrincipalPage();
		page.rotateScreen();
		page.cliqueBotaoAdicionar();
		page.cliqueBotaoCadastrarNovo();
		Assert.assertTrue(page.existeElementoPorTexto("Cadastro de Clientes"));
		
	}
	
	@Test
	public void cadastrarCliente() {
		acessarPaginaCadastroCliente();
		CadastroClientePage cadastro = new CadastroClientePage();
		cadastro.preencherDadosCliente();
		cadastro.cliqueBotaoSalvar();
		Assert.assertEquals("Perfeito", cadastro.getTituloMensagemAlerta());
		Assert.assertEquals("Cadastro efetuado com sucesso".toUpperCase(), cadastro.getMensagemAlerta().toUpperCase());	
		cadastro.cliqueBotaoOk();
		Assert.assertEquals("Nome", cadastro.getCampoNome());
		Assert.assertEquals("RG", cadastro.getCampoRg());
		Assert.assertEquals("CPF", cadastro.getCampoCpf());
		Assert.assertEquals("Data de Nascimento", cadastro.getCampoDataNascimento());
		Assert.assertEquals("Endereço", cadastro.getCampoEndereco());
		Assert.assertEquals("Bairro", cadastro.getCampoBairro());
		Assert.assertEquals("CEP", cadastro.getCampoCep());
		Assert.assertEquals("Cidade", cadastro.getCampoCidade());
		Assert.assertEquals("Telefone 1", cadastro.getCampoTelefone1());
		Assert.assertEquals("Telefone 2", cadastro.getCampoTelefone2());
		Assert.assertEquals("E-mail", cadastro.getCampoEmail());
		Assert.assertEquals("Observações", cadastro.getCampoObservacao());
		Assert.assertEquals("N°", cadastro.getCampoNumero());
	}
	
	@Test
	public void cadastrarClienteComTelaRetrato() {
		acessarPaginaCadastroCliente();
		CadastroClientePage cadastro = new CadastroClientePage();
		cadastro.rotateScreen();
		cadastro.preencherDadosCliente();
		cadastro.cliqueBotaoSalvar();
		Assert.assertEquals("Perfeito", cadastro.getTituloMensagemAlerta());
		Assert.assertEquals("Cadastro efetuado com sucesso".toUpperCase(), cadastro.getMensagemAlerta().toUpperCase());	
		cadastro.cliqueBotaoOk();
		Assert.assertEquals("Nome", cadastro.getCampoNome());
		Assert.assertEquals("RG", cadastro.getCampoRg());
		Assert.assertEquals("CPF", cadastro.getCampoCpf());
		Assert.assertEquals("Data de Nascimento", cadastro.getCampoDataNascimento());
		Assert.assertEquals("Endereço", cadastro.getCampoEndereco());
		Assert.assertEquals("N°", cadastro.getCampoNumero());
		Assert.assertEquals("Bairro", cadastro.getCampoBairro());
		Assert.assertEquals("CEP", cadastro.getCampoCep());
		cadastro.scroll(0.7,0.1);
		Assert.assertEquals("Cidade", cadastro.getCampoCidade());
		Assert.assertEquals("Telefone 1", cadastro.getCampoTelefone1());
		Assert.assertEquals("Telefone 2", cadastro.getCampoTelefone2());
		Assert.assertEquals("E-mail", cadastro.getCampoEmail());
		Assert.assertEquals("Observações", cadastro.getCampoObservacao());
	}
	
	@Test
	public void cadastrarClienteComFotoCamera() {
		acessarPaginaCadastroCliente();
		CadastroClientePage cadastro = new CadastroClientePage();
		cadastro.cliqueFoto();
		cadastro.cliqueCamera();
		cadastro.tirarFoto();
		cadastro.preencherDadosCliente();
		cadastro.cliqueBotaoSalvar();
		Assert.assertEquals("Perfeito", cadastro.getTituloMensagemAlerta());
		Assert.assertEquals("Cadastro efetuado com sucesso".toUpperCase(), cadastro.getMensagemAlerta().toUpperCase());	
		cadastro.cliqueBotaoOk();
	}
	
}
