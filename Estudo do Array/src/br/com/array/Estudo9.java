package br.com.array;
public class Estudo9 {
	/**
	 * @author Giovane Francisco 
	 * Exemplo Array multidimensional
	 */
	public static void main(String[] args) {
		String[][] agenda = { 
				{ "Giovane", "1111-1111", "giovane.franciscoforl@gmail.com" },
				{ "Luiza"  , "2222-2222", "luiza@gmail.com         " },
				{ "Deboráh", "3333-3333", "debora@outlook.com   " } 
				};
		// Cria um array com 3 linhas e 3 colunas, definindo os valores para cada com

		for (int l = 0; l < agenda.length; l++) { // Para cada linhas
			for (int c = 0; c < agenda.length; c++) { // Para cada coluna
				System.out.println(agenda[l][c]); // Escreva qual o texto dentro daquela linha/coluna
				/* Funcionamento
				 * l=0, c=0; sout (Giovane)
				 * l=0, c=1; sout (1111-1111)
				 * l=0, c=2, sout (giovane.franciscoforl@gmail.com)
				 * l=1, c=0, sout (Luiza)
				 * ...
				 */
			}
			System.out.println();
		}
	}
}
