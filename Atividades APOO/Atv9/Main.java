import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Mostra na tela as opções disponiveis
		System.out.println("Escolha uma operação: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		
		//Armazena a escolha do usuario
		int escolha = scanner.nextInt();
		
		//Armazena os números escolhidos 
		System.out.println("Digite o primeiro número:");
		double num1 = scanner.nextDouble();
		System.out.println("Digite o segundo número:");
		double num2 = scanner.nextDouble();
		
		
		double resultado;
		
		//switch case, para cada operação
		switch (escolha) {
		    case 1:
		        resultado = num1 + num2;
		        System.out.println("Resultado de: "+ num1 + " + "+ num2 + " = "+ resultado);
		        break;
		        
		    case 2:
		        resultado = num1 - num2;
		        System.out.println("Resultado de: "+ num1 +" - "+ num2 +" = "+ resultado);
		        break;
		    case 3:
		        resultado = num1 * num2;
		        System.out.println("Resultado de: "+ num1 +" x "+ num2 +" = "+ resultado);
		        break;
		    case 4:
		        if (num2 != 0){
		            resultado = num1 / num2;
		            System.out.println("Resultado de: "+ num1 +" / "+ num2 +" = "+ resultado);
		        } else{
		            System.out.println("Eroo: divisão por 0.");
		        } break;
		        default:
		        System.out.println("Opção inválida.");
		}
		scanner.close();
	}
}