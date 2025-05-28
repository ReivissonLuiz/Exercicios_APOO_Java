

//ATIVIDADE 17

// Importa as bibliotecas necessárias:
// Scanner para ler entradas do teclado
// Random para gerar um número aleatório
import java.util.Scanner;
import java.util.Random;

// Declaração da classe principal com o nome Main
public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar o que o usuário digitar
        Scanner scanner = new Scanner(System.in);
        
        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();
        
        // Gera um número aleatório entre 1 e 100 (inclusive)
        // random.nextInt(100) gera de 0 a 99, por isso somamos 1
        int numeroSecreto = random.nextInt(100) + 1;
        
        // Variável para armazenar o palpite do usuário
        int tentativa;

        // Contador de tentativas feitas pelo usuário
        int tentativas = 0;
        
        // Mensagem inicial do jogo
        System.out.println("Tente adivinhar o número que estou pensando (entre 1 e 100).");

        // Estrutura de repetição que continua até o número ser adivinhado
        do {
            // Pede ao usuário que digite um palpite
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt(); // Lê o número digitado
            tentativas++; // Incrementa o contador de tentativas

            // Se o palpite for menor que o número secreto, dá a dica "Mais alto!"
            if (tentativa < numeroSecreto) {
                System.out.println("Mais alto!");
            }
            // Se o palpite for maior que o número secreto, dá a dica "Mais baixo!"
            else if (tentativa > numeroSecreto) {
                System.out.println("Mais baixo!");
            }
            // Se o palpite for igual ao número secreto, o usuário venceu
            else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }

        // O laço continua enquanto o número digitado for diferente do número secreto
        } while (tentativa != numeroSecreto);

        // Fecha o scanner para liberar o recurso do sistema
        scanner.close();
    }
}


