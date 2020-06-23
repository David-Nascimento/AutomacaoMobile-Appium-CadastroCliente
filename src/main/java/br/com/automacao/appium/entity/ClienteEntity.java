package br.com.automacao.appium.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ClienteEntity {
	
	private String nome;
	private String rg;
	private String cpf;
	private String dataNascimento;
	private String endereco;
	private String numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	private String telefone1;
	private String telefone2;
	private String email;
	private String observacao;
	
}
