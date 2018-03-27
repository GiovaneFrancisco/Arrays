/**
 * 
 */
package br.com.array;

/**
 * @author Giovane Francisco
 *  Uso do for para compor o array
 */
public class Estudo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] dezenas = new int[11];
		for (int i = 0; i < dezenas.length; i++) {
			dezenas[i] = i;
			System.out.println("Dezena {" + i + "}" + " " + dezenas[i]);
		}
	}

}
