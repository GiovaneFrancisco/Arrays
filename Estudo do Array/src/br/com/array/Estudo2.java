package br.com.array;

/**
 * 
 * @author Giovane Francisco Estudo do array
 *
 */
public class Estudo2 {
	
	//Copas -> Alt + 3
	//Ouros -> Alt + 4
	//Paus -> Alt + 5
	//Espada ->Alt + 6
	
	public static void main(String[] args) {
		String[] nipes = { "♠", "♣", "♥", "♦" };
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// Cria os arrays
		for (int d = 0; d < nipes.length; d++) { //Para cada nipe
			for (int i = 0; i < faces.length; i++) { //Para cada face
				System.out.println(faces[i] + " de " + nipes[d]); //Escreva a face e o nipe
				// Mostra o array faces com o número 'face' e o array nipes com o número 'nipe'
			}
			System.out.println();
		}
	}
}
