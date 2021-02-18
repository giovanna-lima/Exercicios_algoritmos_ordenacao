package exercícios_algoritmo_ordenacao;

public class Bubble_sort {

	public static void main(String[] args) {
		int vet [] = {7, 10, 90, 15, 25, 40};
		int aux;
		boolean ctrl;
		
		
		for (int i = 0; i<vet.length; i++) {
			ctrl = true;
			for (int j = 0; j<(vet.length - 1); j++) {
				
				if(vet[j]>vet[j+1]) {
					aux = vet[j+1];
					vet[j+1]= vet[j];
					vet[j]=aux;
				ctrl = false;	
				}
		
			}
			if(ctrl) {
				break;
			}	
		}
	
		for (int i = 0; i<vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
}
