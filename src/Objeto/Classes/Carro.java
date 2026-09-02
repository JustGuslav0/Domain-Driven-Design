//Sintaxe de uma classe
//modificador class NomeDaClasse

public class Carro {

    //Uma classe é dividida em Atributos (Propiedades) e Métodos

    //Propiedades - São as caracteristicas de um objeto
    //São representadas pelas variáveis dentro de uma classe
    //Sempre estarão no topo da classe

    int quantidadeDePortas;
    String cor;
    Modelo modelo;

    //Métodos - São as ações de um objeto
    //São representados pelas funções dentro de uma classe
    //Sempre estarão na BASE da classe

    public void acelerar(){
        //Código que fará o carro acelerar
        System.out.println("O carro está acelerando");
    }

    public void frear(){
        //Código que fará o carro frear
        System.out.println("O carro está freando");
    }

}
