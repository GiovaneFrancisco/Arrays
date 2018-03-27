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
		String[] times = { "Santos", "Corinthians", "Palmeiras", "S�o Paulo" };
		System.out.println(Arrays.toString(times)); // Exibe todo o conte�do o array
		System.out.println("Time: " + times[0]);
		Arrays.sort(times, 0, times.length); // Muda os �ndices para ordem (array, come�o, fim)
		System.out.println("Time: " + times[0]);
		System.out.println(Arrays.toString(times));
	}

}
