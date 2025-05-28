
//ATIVIDADE 15


// Importa a classe Scanner para ler entradas do teclado
import java.util.Scanner;

// Classe principal do programa
public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o peso do usuário (em kg)
        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble(); // Lê o valor digitado e armazena na variável peso

        // Solicita a altura do usuário (em metros)
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble(); // Lê a altura e armazena na variável altura

        // Calcula o IMC usando a fórmula: peso / (altura * altura)
        double imc = peso / (altura * altura);

        // Exibe o valor do IMC com uma casa decimal
        System.out.printf("Seu IMC é: %.1f\n", imc);

        // Exibe a classificação de acordo com o valor do IMC
        System.out.print("Classificação: ");
        
        // Verifica em qual faixa de IMC o usuário se encontra
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc < 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }

        // Fecha o Scanner (boa prática para liberar recursos)
        scanner.close();
    }
}
