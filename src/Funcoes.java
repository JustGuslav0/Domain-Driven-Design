public class Funcoes {
    public static void main(String[] args) {
        primeiraFuncao();
        somar15Mais15();
        somarDoisValores(10, 15);
        identificador("Gustavo",15);
    }

    //Função é o Scrip de um conjunto de instruções
    //encapulado dentro de um escopo {} com um nome
    //Sintaxe:
    //modificador retorno nomeDaFuncao ()     {}
    //opcional    obrig.      obrig.         obrig.

    //Primeira Função
    //static libera a utilização de uma função dentro de classe
    static void primeiraFuncao(){
        System.out.println("Hello World");
    }

    //Função sem retorno e sem parâmetros
    static void somar15Mais15(){

        int valorA = 15;
        int valorB = 15;
        int soma = valorA + valorB;
        System.out.println(soma);
    }

    //Função com parâmetros
    static void somarDoisValores(int valorA, int valorB){
        int soma = valorA + valorB;
        System.out.println("A soma de " + valorA + " e " + valorB + " é: " + soma);
    }

    //DESAFIO
    //Crie uma função que identifique uma pessoa com relação ao seu nome e idade

    static void identificador(String nome, int idade){
        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos");
    }

}
