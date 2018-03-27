/**
 * 
 */
package br.com.array;

import java.util.Arrays;

/**
 * @author Giovane Francisco
 *	Uso da classe Arrays
 */
public class Estudo6 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] times = { "Santos", "Corinthians", "Palmeiras", "São Paulo" };
		System.out.println(Arrays.toString(times)); // Exibe todo o conteúdo o array
		System.out.println("Time: " + times[0]);
		Arrays.sort(times, 0, times.length); // Muda os índices para ordem (array, começo, fim)
		System.out.println("Time: " + times[0]);
		System.out.println(Arrays.toString(times));
	}

}
