import java.util.Scanner;

public class array5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	for(int i = 0; i<=5; i++) {
		int num[] = new int[5];
		
		System.out.print("Digite o numero " + (i + 1 ) + " que deseja armazenar");
		num[i] = scanner.nextInt();
		}
	scanner.close();
	
	}
}
