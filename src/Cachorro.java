public class Cachorro {
    int id;
    String nome;
    String raca;
    String cor;
    int idade;

    //Métodos
    public void imprimitDados(){
        String registro = String.format("""
                Id: %s
                Nome: %s
                Raça: %s
                Cor: %s
                Idade: %s
                """, id, nome, raca, cor, idade);
        System.out.println(registro);

    }
}
