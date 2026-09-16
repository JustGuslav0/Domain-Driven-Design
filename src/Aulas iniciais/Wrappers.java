import java.util.ArrayList;

public class Wrappers {
    public static void main(String[] args) {

        //Primitivos - Valores

        byte valorByte = 10;
        short valorShort = 100;
        int valorInt = 10000;
        long valorLong = 100000L; //L é opcional
        float valorFloat = 55.55f; //f é obrigatório
        double valorDouble = 88.88d; // D é opcional
        char valorChar = 'A';
        boolean valorBoolean = true;

        // Trabalhando com Objetos baseados em Wrappers

        Byte wrapByte = 10;
        Short wrapShor = 100;
        Integer wrapInt = 10000;
        Long wrapLong = 1000000L; //L é oobrigatório
        Float wrapFloat = 44.44f; // F é obrigatório
        Double wrapDouble = 99.00d; // é opcional
        Character wrapChar = '6';
        Boolean wrapBool = true;

        // Exemplo de utilização de Wrapper

        ArrayList<Integer> numerosParesUmDigito = new ArrayList<>();

        // Criando objetos a partir de Wrappers
        Byte bytePorString = Byte.parseByte("10");
        System.out.println(bytePorString);

        //⚠⚠⚠⚠⚠⚠ TODOS OS WRAPPERS possuem o método .parse...

        //Criando objetos Wrappers com base em primitivos
        Byte byteParabyte = Byte.valueOf(valorByte);
        Character charParaCharacter = Character.valueOf(valorChar);

        //⚠⚠⚠⚠⚠⚠ TODOS OS WRAPPERS possuem o método .valueOf...
        //Qlq transformando entre tipos, pode ser considerado um type casting

        //trabalhando com Type Casting

        byte numByteA = 40;
        short numShortA = numByteA;
        int numIntA = numShortA;
        long numLongA = num IntA;
        float numFloatA = numLongA;
        double numDoubleA = numFloatA;
        System.out.println(numDoubleA);

        //Narrowing Cast
        double numDoubleB = 55.44d;
        float numFloatB = (float) numDoubleB;
        int numIntB = (int) numFloatB;
        System.out.println(numIntB);


    }
}