package br.com.automacao.factory;

import java.util.Locale;
import java.util.Random;

import com.github.javafaker.Faker;

import br.com.automacao.appium.entity.ClienteEntity;
import br.com.automacao.utils.GenerateData;


public class ClienteFactory {

	public static ClienteEntity getCliente() {
		Locale locale = new Locale("pt-BR");
		Random r = new Random();
		Faker faker = new Faker(locale);
		
		ClienteEntity cliente = ClienteEntity.builder()
				.nome(faker.name().fullName())
				.rg("11122"+r.nextInt())
				.cpf(GenerateData.generateRandomCpf())
				.dataNascimento("10041989")
				.endereco(faker.address().streetName().toString())
				.numero(faker.number().digits(4))
				.bairro("Bairro "+faker.address().streetName())
				.cep(faker.address().zipCode())
				.cidade(faker.address().city())
				.telefone1(faker.phoneNumber().phoneNumber().toString())
				.telefone2(faker.phoneNumber().cellPhone().toString())
				.email(faker.internet().emailAddress())
				.observacao("observacao")
				.build();

		return cliente;
	}
}
