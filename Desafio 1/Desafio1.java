package desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Desafio 1: Considerando a entrada de valores inteiros não negativos, ordene
 * estes valores segundo o seguinte critério:
 * 
 * •Primeiro os Pares •Depois os Ímpares
 * 
 * Sendo que deverão ser apresentados os pares em ordem crescente e depois os
 * ímpares em ordem decrescente.
 * 
 * @author daniel
 *
 */
public class Desafio1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();
		int n = input.nextInt();

		while (n > 0) {
			int number = input.nextInt();

			if (number % 2 == 0) {
				par.add(number);
			} else {
				impar.add(number);
			}
			n--;
		}
		Collections.sort(par);
		Collections.sort(impar, Collections.reverseOrder());

		for (int values : par) {

			System.out.println(values);
		}
		for (int valuesI : impar) {
			System.out.println(valuesI);
		}

		input.close();

	}

}
