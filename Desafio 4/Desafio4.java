package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		ArrayList<String> originals = new ArrayList<String>();
		Scanner input = new Scanner(System.in);

		int quantidade = input.nextInt();

		while (quantidade > 0) {
			input = new Scanner(System.in);
			String palavra = input.nextLine();

			int meio = palavra.length() / 2;

			String p1 = palavra.substring(0, meio);
			String p2 = palavra.substring(meio);

			String original = reverte(p1) + reverte(p2);
			originals.add(original);
			quantidade--;
		}

		for (String ori : originals) {
			System.out.println(ori);
		}
		input.close();

	}

	public static String reverte(String palavra) {
		String nstr = "";
		char letra;
		for (int i = palavra.length() - 1; i >= 0; i--) {
			letra = palavra.charAt(i);
			nstr = nstr + letra;
		}
		return nstr;
	}

}
