package exercícios_algoritmo_ordenacao;

public class Selection_sort {

	public static void main(String[] args) {
		int[] vet = {7, 10, 90, 15, 25, 40};
		selectionsort(vet);
		
		for(int i = 0; i<vet.length; i++) {
			System.out.println(vet[i]);
		}
		
			
	}
	
	public static void selectionsort(int[] vet) {
		for(int i = 0; i<vet.length; i++) {
			int menor = i;
		for (int j = i +1; j<vet.length; j++) {
			if(vet[j]<vet[menor]) {
				menor = j;
			}
			trocar (vet, i, menor);
		}
		}			
	}

	
	private static void trocar (int[]vet, int i, int menor ) {
		int aux = vet[i];
		vet[i] = vet[menor];
		vet[menor] = aux;
		
	}
	
}
