public class Main {
	
	public static void main(String[] args) {
		int[] n = {5, 32, 77, 05, 37, 10};
		int maior = 0;
		
		for(int i = 0; i < 5; i++) {
				if(n[i] > maior) {
					maior = n[i];
				}
		}
		
		System.out.println(maior);
	}

}
