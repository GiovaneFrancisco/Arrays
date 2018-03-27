package br.com.array;

/**
 * @author Giovane Francisco 
 * Criando um array simples de tamanho variável
 */
public class Estudo1 {
	public static void main(String[] args) {
		// Criação de um campeonato SEM array
		String time1 = "Palmenras";
		String time2 = "Corinthians";
		String time3 = "Santos";
		String time4 = "São Paulo";

		System.out.println("Array simples");
		System.out.println();

		System.out.println("Ex. 1: Sem array");
		System.out.println("Time: " + time2 + time1 + time3 + time4);
		System.out.println();

		System.out.println("Ex. 2: Com array");
		String[] times = { "Palmeiras", "Corinthians", "Santos", "São Paulo" };
		// Cria um array 'times' com 4 espaços para Strings
		System.out.println("Time: " + times[1]);
		System.out.println();

		System.out.println("Ex. 3: Modificando um array");
		System.out.println("Time: " + times[1]);
		times[1] = "Flamengo"; // Muda o valor da casa do Array
		System.out.println("Time: " + times[1]);
		System.out.println("Tamanho do array: " + times.length); // Mostra o tamanho do array
		System.out.println();
	}

}
