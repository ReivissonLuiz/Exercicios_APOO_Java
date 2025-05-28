import java.util.Scanner;

public class somaNumeros{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero inteiro: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo numero inteiro: ");
		int numero2 = scanner.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.print("A soma dos numeros interos é: " + soma);
		
		scanner.close();
	}

}