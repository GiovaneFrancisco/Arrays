/**
 * 
 */
package br.com.array;

/**
 * @author Giovane Francisco 
 * Array multidimensional - Matriz
 */
public class Estudo8 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[][] notas = { { 8, 7, 9, 3 }, { 4, 5, 8, 6 } }; // Cria um array multidimensional com valores pré definidos
							// Colunas => {{}, {}, {}}
							// Linhas  =>  (), (), ()
		System.out.println("Nota LP: " + notas[1][2]); // [linha][coluna]

	}

}
