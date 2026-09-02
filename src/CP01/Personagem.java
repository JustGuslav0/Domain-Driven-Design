import java.util.ArrayList;

public class Personagem {
    String name;
    int height;
    float mass;
    String hair_color;
    String skin_color;
    String eye_color;
    String birth_year;
    Gender gender;
    String homeworld;
    ArrayList <String> films;
    ArrayList <String> species;
    ArrayList <String> vehicles;
    ArrayList <String> starships;
    String created;
    String edited;
    String url;

    //Metodo
    public void imprimirDados(){
        String registro = String.format("""
                name: %s
                height: %s
                mass: %s
                hair_color: %s
                skin_color: %s
                eye_color: %s
                birth_year: %s
                gender: %s
                homeworld: %s
                films: %s
                species: %s
                vehicles: %s
                starships: %s
                created: %s
                edited: %s
                url: %s
                """, name, height, mass, hair_color, skin_color, eye_color, birth_year , gender, homeworld, films, species, vehicles, starships, created, edited, url );

        System.out.println(registro);
    }
}

