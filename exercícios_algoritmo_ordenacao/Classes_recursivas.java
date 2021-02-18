package exercícios_algoritmo_ordenacao;

public class Classes_recursivas {

	public static void main(String[] args) {
	
	
System.out.println(fatorial (4));
	}
	
	public static int fatorial (int num) {
		if (num == 0) {
			return 1;
			
		}
		
		return num* fatorial (num - 1);
	}

}
