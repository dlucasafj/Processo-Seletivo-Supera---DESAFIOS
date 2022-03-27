package desafios;

import java.util.Scanner;

/**
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor
 * representa um valor monetário. A seguir, calcule o menor número de notas e
 * moedas possíveis no qual o valor pode ser decomposto. As notas consideradas
 * são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10,
 * 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
 * 
 * @author daniel
 *
 */

public class Desafio2 {

	public static final int CEM = 100;
	public static final int CINQUENTA = 50;
	public static final int VINTE = 20;
	public static final int DEZ = 10;
	public static final int CINCO = 5;
	public static final int DOIS = 2;
	public static final int UM = 1;
	public static final double CINQUENTA_CENTS = 0.50;
	public static final double VINTE_CINCO_CENTS = 0.25;
	public static final double DEZ_CENTS = 0.10;
	public static final double CINCO_CENTS = 0.05;
	public static final double UM_CENTS = 0.01;

	public static void main(String[] args) {

		int qtd_cem = 0, qtd_cinquenta = 0, qtd_vinte = 0, qtd_dez = 0, qtd_cinco = 0, qtd_dois = 0, qtd_um = 0;
		int qtd_cinquenta_cents = 0, qtd_vinte_cinco_cents = 0, qtd_dez_cents = 0, qtd_cinco_cents = 0,
				qtd_um_cents = 0;

		Scanner input = new Scanner(System.in);

		String num = input.next();
		double number = Double.parseDouble(num.replace(",", ".")); // altera o ponto pela virgula

		// encontra qtd notas de 100
		qtd_cem = (int) (number / CEM);
		number = number - (CEM * qtd_cem);

		// encontra qtd notas de 50
		qtd_cinquenta = (int) (number / CINQUENTA);
		number = number - (CINQUENTA * qtd_cinquenta);

		// encontra qtd notas de 20
		qtd_vinte = (int) (number / VINTE);
		number = number - (VINTE * qtd_vinte);

		// encontra qtd notas de 10
		qtd_dez = (int) (number / DEZ);
		number = number - (DEZ * qtd_dez);

		// encontra qtd notas de 5
		qtd_cinco = (int) (number / CINCO);
		number = number - (CINCO * qtd_cinco);

		// encontra qtd notas de 2
		qtd_dois = (int) (number / DOIS);
		number = number - (DOIS * qtd_dois);

		// encontra qtd moedas de 1
		qtd_um = (int) (number / UM);
		number = number - (UM * qtd_um);

		// encontra qtd moedas de 0.50
		qtd_cinquenta_cents = (int) (number / CINQUENTA_CENTS);
		number = number - (CINQUENTA_CENTS * qtd_cinquenta_cents);

		// encontra qtd moedas de 0.25
		qtd_vinte_cinco_cents = (int) (number / VINTE_CINCO_CENTS);
		number = number - (VINTE_CINCO_CENTS * qtd_vinte_cinco_cents);

		// encontra qtd moedas de 0.10
		qtd_dez_cents = (int) (number / DEZ_CENTS);
		number = number - (DEZ_CENTS * qtd_dez_cents);

		// encontra qtd moedas de 0.05
		qtd_cinco_cents = (int) (number / CINCO_CENTS);
		number = number - (CINCO_CENTS * qtd_cinco_cents);

		// encontra qtd moedas de 0.01
		qtd_um_cents = (int) (number / UM_CENTS);
		number = number - (UM_CENTS * qtd_um_cents);

		System.out.println("NOTAS: ");
		System.out.println(qtd_cem + " nota(s) de R$ 100.00");
		System.out.println(qtd_cinquenta + " nota(s) de R$ 50.00");
		System.out.println(qtd_vinte + " nota(s) de R$ 20.00");
		System.out.println(qtd_dez + " nota(s) de R$ 10.00");
		System.out.println(qtd_cinco + " nota(s) de R$ 5.00");
		System.out.println(qtd_dois + " nota(s) de R$ 2.00");

		System.out.println("MOEDAS: ");

		System.out.println(qtd_um + " moeda(s) de R$ 1.00");
		System.out.println(qtd_cinquenta_cents + " moeda(s) de R$ 0.50");
		System.out.println(qtd_vinte_cinco_cents + " moeda(s) de R$ 0.25");
		System.out.println(qtd_dez_cents + " moeda(s) de R$ 0.10");
		System.out.println(qtd_cinco_cents + " moeda(s) de R$ 0.05");
		System.out.println(qtd_um_cents + " moeda(s) de R$ 0.01");

		input.close();
	}

}
