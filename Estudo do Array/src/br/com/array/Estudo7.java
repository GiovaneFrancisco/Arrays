/**
 * 
 */
package br.com.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Giovane Francisco
 *
 */
public class Estudo7 {

	private static Scanner teclado;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		String[] nomes = new String[5]; // Cria um array Fixo com 5 casas
		for (int i = 0; i < nomes.length; i++) { // Cria uma repeti��o de 0 at� .length
			System.out.print("Digite o nome: ");
			nomes[i] = teclado.nextLine(); // L� o nome cara cada [i]
		
		}
		System.out.println();
		Arrays.sort(nomes, 0, nomes.length); // Arruma o array em ordem alfab�tica
		System.out.println(Arrays.toString(nomes)); // Exibe os nomes
	}
}
