
//ATIVIDADE 13


// Define a interface Veiculo com métodos acelerar() e frear()
interface Veiculo {
    void acelerar(); // Método para acelerar o veículo
    void frear();    // Método para frear o veículo
}

// Classe Carro que implementa a interface Veiculo
class Carro implements Veiculo {
    private int velocidade; // Velocidade atual do carro

    // Construtor inicializa a velocidade como 0
    public Carro() {
        this.velocidade = 0;
    }

    // Implementação do método acelerar()
    @Override
    public void acelerar() {
        velocidade += 10;
        System.out.println("O carro acelerou. Velocidade atual: " + velocidade + " km/h");
    }

    // Implementação do método frear()
    @Override
    public void frear() {
        if (velocidade >= 10) {
            velocidade -= 10;
        } else {
            velocidade = 0;
        }
        System.out.println("O carro freou. Velocidade atual: " + velocidade + " km/h");
    }
}

// Classe principal que executa o programa
public class Main {
    public static void main(String[] args) {
        // Cria uma instância de Carro
        Carro meuCarro = new Carro();

        // Chama os métodos da interface
        meuCarro.acelerar(); // Aumenta a velocidade para 10
        meuCarro.acelerar(); // Aumenta a velocidade para 20
        meuCarro.frear();    // Reduz a velocidade para 10
    }
}

