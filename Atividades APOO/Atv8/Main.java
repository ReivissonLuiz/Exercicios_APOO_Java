import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        //Cria um objeto Scanner para fazer a leitura do usuario
        Scanner scanner = new Scanner(System.in);
        
        //Pega o texto e transforma todas as letras em minusculas
        
        System.out.println("Digite uma frase ");
        String texto = scanner.nextLine();
        texto = texto.toLowerCase();
        
        int contador = 0;
        
        //percorre o texto
        for (int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }
        
        System.out.println("Numero de vogais " + contador);
        
        scanner.close();
    }
}