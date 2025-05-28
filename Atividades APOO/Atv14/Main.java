
//ATIVIDADE 14



// Importa a classe Scanner para ler entrada do usuário
import java.util.Scanner;

// Classe principal do programa
public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt(); // Lê o número inteiro digitado

        // Exibe um título antes da tabuada
        System.out.println("Tabuada de " + numero + ":");

        // Estrutura de repetição que vai de 1 até 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i; // Calcula o produto
            // Exibe o resultado da multiplicação no formato tradicional
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fecha o Scanner (boa prática para liberar recurso)
        scanner.close();
    }
}

