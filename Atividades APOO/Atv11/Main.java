
public class Main
{   
    //Definindo a classe pessoa
    static class Pessoa {
    String nome;
    int idade;
    
    //Construtor da classe
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    //Método para exibir o nome e a idade
    public void exibirDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade + " anos");
        }
    }
    
    //Criando um objeto com a classe e usando o método para exibir os dados
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("João", 35);
		pessoa1.exibirDados();
	}
}