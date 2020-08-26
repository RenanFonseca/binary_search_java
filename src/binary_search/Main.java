package binary_search;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {		
	BinarySearch binarySearch = new BinarySearch();
	Scanner leia = new Scanner(System.in);
		
	
//	System.out.println("Qual o tamanho da lista? ");
//	int[] tamanhoVetor = new int[leia.nextInt()];
//		
//	for (int i = 0; i < tamanhoVetor.length; i++) {
//	System.out.println("Digite o "+ (1 + i) +"º valor da lista");
//		tamanhoVetor[i] = leia.nextInt();
//	}
//		
//	binarySearch.searchInt(tamanhoVetor, 20);
//	System.out.println("Ordenado como:");
//	binarySearch.printVetorInt(tamanhoVetor);
		
		
//		********************************************************
		
	String[] nomes = new String[5];
	for (int i = 0; i < nomes.length; i++) {
		System.out.println("Digite o "+ (1 + i) +"º nome da lista");
			nomes[i] = leia.nextLine();
	}
			
	binarySearch.searchString(nomes, "Renan");
	System.out.println("Ordenado como:");
	binarySearch.printVetorString(nomes);
		
		
	leia.close();
	}
}
