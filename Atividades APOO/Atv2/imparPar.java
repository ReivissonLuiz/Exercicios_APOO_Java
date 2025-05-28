import java.util.Scanner;

public class imparPar{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Digite o primeiro numero inteiro:");
		int numero1 = scanner.nextInt();
		
		boolean epar = (numero1 % 2 <= 0 );
		
		if(epar) {
			System.out.print("O numero informado é par!");
		}
		else{
			System.out.print("O numero informado é impar!");
		}
		}

}
