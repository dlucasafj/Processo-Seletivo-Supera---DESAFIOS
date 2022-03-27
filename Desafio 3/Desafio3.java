package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>();

		Scanner input = new Scanner(System.in);

		String values = input.nextLine(); // Captura Tamanho do Array e valor Alvo
		String[] valores = values.split("\\s+");

		int n = Integer.parseInt(valores[0]); // Tamanho do Array
		int alvo = Integer.parseInt(valores[1]); // valor Alvo

		String line = input.nextLine(); // Captura dados do Array
		String[] a = line.split("\\s+");

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(a[i]);
			array.add(num);
		}

		System.out.println(contaPares(array, alvo));

		input.close();

	}

	public static int contaPares(ArrayList<Integer> array, int alvo) {
		int pares = 0;
		for (int i = 0; i < array.size(); i++) {

			for (int j = i + 1; j < array.size(); j++) {
				if (j > array.size()) {
					break;
				} else {

					int conta = 0;
					if (array.get(j) > array.get(i)) {
						conta = array.get(j) - array.get(i);
					} else {
						conta = array.get(i) - array.get(j);
					}

					if (conta == alvo) {
						pares++;
					}
				}
			}
		}

		return pares;
	}

}
