/**
 * 
 */
package br.com.array;

/**
 * @author Giovane Francisco
 * Uso das estruturas for e forach para percorrer e recuperar conte�dos do array
 *
 */
public class Estudo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] pares = {0, 2, 4, 6, 8, 10}; // Em um array flex�vel se preenche as casas com os dados
		System.out.println("Ex1: La�o 'for' comum");
		for (int i = 0; i < pares.length; i++) {
			System.out.println("Pares {" + i + "} " + pares[i]);
		}
		System.out.println();
		System.out.println("ex.2: La�o 'foreach'");
		for (int i : pares) { // Mesma coisa que o 'for', mas com menos peso de mem�ria
			System.out.println("Pares: " + i ); // N�o se pode usar junto de String como no 'for'
		}
	}
}
