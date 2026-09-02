public class Condicionais {
    public static void main(String[] args) {

        //Trabalhando com expressões booleanas
        //Expressão, que depois de resolvida, nos dá um resultado
        //true ou false

        System.out.println(10 > 9);

        var hora = 10;
        var estaSol = true;

        System.out.println(hora < 12 && estaSol);

        boolean luzLigada = false;

        //Expressão reduntante (evitar):
        System.out.println(luzLigada == true);

        //Simples
        System.out.println(luzLigada);

        //Médio
        System.out.println(hora>12);

        //Complexo (Tabela verdade)
        System.out.println(hora < 12 && estaSol);

        //Sintaxe do if
        //if(expressão booleana){ações para o verdadeiro}
        int idade = 16;

        if(idade >= 16){
            System.out.println("Pode viajar sem autorização dos pais");
        }

        //Utilizando Expressão Simples
        if(luzLigada){
            System.out.println("A luz está ligada!");
        }

        boolean credito = false;
        boolean debito = true;

        if (debito || credito ){
            System.out.println("Sucesso na transação");
        }
        else {
            System.out.println("Erro na transação");
        }

        String sinal = "Verde";

        if(sinal.equals("Verde")){
            System.out.println("Sinal aberto");
        }
        else if (sinal.equals("Amarelo")){
            System.out.println("Sinal amarelo");
        }
        else if (sinal.equals("Vermelho")){
            System.out.println("Sinal fechado");
        }
        else {
            System.out.println("Farol quebrado");
        }

        int diaSemana = 7;

        switch(diaSemana){
            case 1:
                System.out.println("Hoje é Domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda");
                break;
            case 3:
                System.out.println("Hoje é Terça");
                break;
            case 4:
                System.out.println("Hoje é Quarta");
                break;
            case 5:
                System.out.println("Hoje é Quinta");
                break;
            case 6:
                System.out.println("Hoje é Sexta");
                break;
            case 7:
                System.out.println("Hoje é Sabado");
                break;

            default:
                System.out.println("Dia não encontrado...");
        }

        //A ultima alternativa para condicionar!!!
        //Operador ternário
        //Sintaxe: (expressão booleana) : ação true : ação false.
        int horaDoDia = 19;
        String resultado = (horaDoDia<18) ? "Está um lindo dia" : "Está uma bela noite";
        System.out.println(resultado);
    }
}