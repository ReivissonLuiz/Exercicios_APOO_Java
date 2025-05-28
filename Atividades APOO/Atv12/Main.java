
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
    
    //Classe filha que herda os atributos da classe Pessoa
    static class Aluno extends Pessoa{
        String matricula;
        
        //Construtor da classe filha
        public Aluno(String nome, int idade, String matricula){
            super(nome, idade); //chama o construtor da classe mãe
            this.matricula = matricula;
        }
        
        @Override
        public void exibirDados(){
            super.exibirDados();//chama o método da super classe
            System.out.println("Mátricula: "+ matricula);
        }
    }
    
    //Criando um objeto com a classe e usando o método para exibir os dados
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Lucas", 22, "454548515");
		aluno1.exibirDados();
	}
}