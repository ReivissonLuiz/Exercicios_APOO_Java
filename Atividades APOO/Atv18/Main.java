

//ATIVIDADE 18


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine(); // Lê a linha inteira

        // Remove espaços extras no início e no fim e divide a frase por espaços
        // A função split("\\s+") divide por qualquer quantidade de espaços em branco
        String[] palavras = frase.trim().split("\\s+");

        // Se o usuário não digitou nada (string vazia), evitamos erro
        int quantidadePalavras = frase.trim().isEmpty() ? 0 : palavras.length;

        // Exibe o resultado
        System.out.println("A frase contém " + quantidadePalavras + " palavra(s).");

        // Fecha o Scanner
        scanner.close();
    }
}


