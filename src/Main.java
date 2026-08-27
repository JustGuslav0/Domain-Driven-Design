public class Main {
    public static void main(String[] args){

        //Criando objetos do tipo Carro
        //Instaciando objetos da classe Carro
        //A palavra reservada new, nos dá a possibilidade de criar um novo objeto
        Carro carroA = new Carro();


        //Modificando as propriedades de Carro
        //Para acessar qlqr propriedade ou metodo de uma classe,
        //utilizamos uma tecnica chamada dot syntax (sintaxe do ponto)
        carroA.quantidadeDePortas = 4;
        carroA.cor = "Amarelo";
        carroA.modelo = Modelo.HATCH;

        //carroA.acelerar();
        //carroA.frear();

        System.out.println(carroA.quantidadeDePortas);
        System.out.println(carroA.cor);
        System.out.println(carroA.modelo);

        Cachorro cachorro = new Cachorro();


    }


}
