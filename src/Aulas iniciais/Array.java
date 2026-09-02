import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //

        //Trabalhando com ArrayList
        //Conceito inicial de WRAPPER
        //Wrapper é uma representação de um primitivo em formato de classe para mais funcionalidades
        //Em um primeiro momento, os wrappes "libertam" os primitivos
        //ArrayList<Tipo> nome = new ArrayList();
        ArrayList<String> frutas = new ArrayList();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Melão");
        System.out.println(frutas);

        //Modificando itens de um ArrayList
        frutas.set(1,"Limão");
        System.out.println(frutas);

        //Verificando uma ocorrencia em um ArrayList
        frutas.remove(0);
        System.out.println(frutas);
        System.out.println(frutas.get(0));

        //Limpando um ArrayList
        frutas.clear();
        System.out.println(frutas);

        //Aplicando Loops em Arrays Primitivos - For Each
        //for(String umNome: ){}
    }
}
