package br.com.automacao.utils;

import java.util.Random;

public class GenerateData {

	  	private static int mod(int dividendo, int divisor) {

	        return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
	    }

	    public static String generateRandomCpf() {

	        Random random = new Random();

	        int n = 9;
	        int n1 = (n);
	        int n2 = random.nextInt(n);
	        int n3 = random.nextInt(n);
	        int n4 = random.nextInt(n);
	        int n5 = random.nextInt(n);
	        int n6 = random.nextInt(n);
	        int n7 = random.nextInt(n);
	        int n8 = random.nextInt(n);
	        int n9 = random.nextInt(n);
	        int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

	        d1 = 11 - (mod(d1, 11));

	        if (d1 >= 10) {
	            d1 = 0;
	        }
 
	        int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

	        d2 = 11 - (mod(d2, 11));

	        String retorno = null;

	        if (d2 >= 10) {
	            d2 = 0;
	        }

	        retorno = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + d1 + d2;

	        return retorno;
	    }

	    public static String generateRandomCnpj() {

	        Random random = new Random();

	        int n = 10;
	        int n1 = random.nextInt(n);
	        int n2 = random.nextInt(n);
	        int n3 = random.nextInt(n);
	        int n4 = random.nextInt(n);
	        int n5 = random.nextInt(n);
	        int n6 = random.nextInt(n);
	        int n7 = random.nextInt(n);
	        int n8 = random.nextInt(n);
	        int n9 = random.nextInt(n);
	        int n10 = random.nextInt(n);
	        int n11 = random.nextInt(n);
	        int n12 = random.nextInt(n);

	        int soma = n12 * 2 + n11 * 3 + n10 * 4 + n9 * 5 + n8 * 6 + n7 * 7 + n6 * 8 + n5 * 9 + n4 * 2 + n3 * 3 + n2 * 4 + n1 * 5;
	        int valor = (soma / 11) * 11;
	        int d1 = soma - valor;
	        int resto = (d1 % 11);

	        if (d1 < 2) {
	            d1 = 0;
	        } else {
	            d1 = 11 - resto;
	        }

	        int soma2 = d1 * 2 + n12 * 3 + n11 * 4 + n10 * 5 + n9 * 6 + n8 * 7 + n7 * 8 + n6 * 9 + n5 * 2 + n4 * 3
	                + n3 * 4 + n2 * 5 + n1 * 6;
	        int valor2 = (soma2 / 11) * 11;
	        int d2 = soma2 - valor2;
	        resto = (d2 % 11);

	        if (d2 < 2) {
	            d2 = 0;
	        } else {
	            d2 = 11 - resto;
	        }

	        return "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + d1 + d2;
	    }
}
