
public class Main {
    public static void main(String[] args) {

        //Criando objetos do tipo Carro
        //Instanciando objetos da classe Carro
        //A palavra reservada new, nos dá possibilidade de criar um novo objeto
        Carro carroA = new Carro();

        //Modificando as propiedades de Carro
        //Para acessar qlq propiedade ou métod0 de uma classe,
        //Utilizamos uma tecnica chamada dot syntax (sintaxe do ponto)
        carroA.quantidadeDePortas = 4;
        carroA.cor = "Amarelo";
        carroA.modelo = Modelo.HATCH;

        carroA.acelerar();
        carroA.frear();

        System.out.println(carroA.quantidadeDePortas);
        System.out.println(carroA.cor);
        System.out.println(carroA.modelo);

        //Objetos da classe Cachorro
        Cachorro cachorroA = new Cachorro();
        cachorroA.id = 18765;
        cachorroA.nome = "Mel";
        cachorroA.cor = "Branco e Caramelo";
        cachorroA.raca = "Beagle";
        cachorroA.idade = 14;

        cachorroA.imprimirDados();

    }
}