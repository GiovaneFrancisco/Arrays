package br.com.array;

import java.util.ArrayList;

public class Estudoa10 {
	/**
	 * @author Giovane Francisco 
	 * Trabalhando com listas - ArrayList
	 */
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>(); // Cria um ArrayList (Array com tamanho vari�vel)
		
		cores.add("Vermelho"); // Nomeia os itens da lista
		cores.add("Azul");
		cores.add("Verde");
		cores.add("Amarelo");
		cores.add(0, "Roxo"); // Adiciona um item em um lugar (�ndice) espec�fico
		cores.add(1, "Laranja"); // (�ndice, item);
		
		System.out.println(cores.toString()); // Exibe o array
		System.out.println();
		
		System.out.println("Tamanho do array: " + cores.size()); // .size == .length
		System.out.println();
		
		for(int i =0; i<cores.size(); i++) {
			System.out.println("Conte�do do �ndice " + i + ": " + cores.get(i)); // Mostra o item no �ndice espec�fico
		}
		System.out.println();
		
		System.out.println("�ndice da cor azul: " + cores.indexOf("Azul")); // Mostra o �ndice do item
		System.out.println();
		
		System.out.println("Tem a cor Cinza? ");
		boolean resp = cores.contains("Cinza"); // Mostra se tem ou n�o o item na lista
		if(resp == true) { // Caso tenha
			System.out.println("Tem");
		}else { // Caso n�o tenha
			System.out.println("N�o tem");
		}
		System.out.println();
		
		cores.remove("Roxo"); // Remove um item
		System.out.println(cores.toString());
	}

}
