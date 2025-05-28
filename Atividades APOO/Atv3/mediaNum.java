import java.util.Scanner;

public class mediaNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Digite a primeira nota: ");
		int nota1 = scanner.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		int nota2 = scanner.nextInt();
		
		System.out.print("Digite a tercceira nota: ");
		int nota3 = scanner.nextInt();
		
		int media = nota1 + nota2 + nota3;
		media = media / 3;
		
		System.out.print("A média é: " + media);
	}
}
