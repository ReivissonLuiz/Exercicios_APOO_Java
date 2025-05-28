
//ATIVIDADE 16

// Importa a classe Scanner para leitura de entrada do usuário
import java.util.Scanner;

// Classe principal do programa
public class Main {
    public static void main(String[] args) {
        // Cria o objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite uma senha
        System.out.print("Digite uma senha: ");
        String senha = scanner.nextLine(); // Lê a senha digitada

        // Chama a função que valida a senha e exibe o resultado
        if (validarSenha(senha)) {
            System.out.println("Senha válida!");
        } else {
            // Caso a senha seja inválida, informa os critérios necessários
            System.out.println("Senha inválida. Certifique-se de que ela tenha:");
            System.out.println("- Pelo menos 8 caracteres");
            System.out.println("- Pelo menos uma letra maiúscula");
            System.out.println("- Pelo menos uma letra minúscula");
            System.out.println("- Pelo menos um número");
        }

        // Fecha o Scanner (boa prática)
        scanner.close();
    }

    // Função que valida a senha de acordo com os critérios
    public static boolean validarSenha(String senha) {
        // Verifica se a senha tem pelo menos 8 caracteres
        if (senha.length() < 8) {
            return false;
        }

        // Flags para verificar os requisitos
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        // Percorre cada caractere da senha
        for (char c : senha.toCharArray()) {
            // Verifica se o caractere é uma letra maiúscula
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }
            // Verifica se o caractere é uma letra minúscula
            else if (Character.isLowerCase(c)) {
                temMinuscula = true;
            }
            // Verifica se o caractere é um número
            else if (Character.isDigit(c)) {
                temNumero = true;
            }
        }

        // Retorna verdadeiro somente se todos os critérios forem atendidos
        return temMaiuscula && temMinuscula && temNumero;
    }
}

