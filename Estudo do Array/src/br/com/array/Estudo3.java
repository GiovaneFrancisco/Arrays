/**
 * 
 */
package br.com.array;

/**
 * @author Giovane Francisco Criando objeto array
 */
public class Estudo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] impares = new int[5];
		// Instancia um objeto array Int com 5 casas, INFLEXÍVEL

		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9; // O mesmo que int ímpares[] = {1, 3, 5, 7, 9}

		System.out.println("Número: " + impares[3]);
		System.out.println("Tamanho: " + impares.length);

		impares[5] = 13; // Cria um erro por que o pedido excede o máximo do array

	}
}
