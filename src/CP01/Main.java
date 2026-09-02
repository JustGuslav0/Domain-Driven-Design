import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Personagem personagemA = new Personagem();

        personagemA.name = "Luke Skywalker";
        personagemA.height = 172;
        personagemA.mass = 77;
        personagemA.hair_color = "blond";
        personagemA.skin_color = "fair";
        personagemA.eye_color = "blue";
        personagemA.birth_year = "19BBY";
        personagemA.gender = Gender.MALE;
        personagemA.homeworld = "https://swapi.info/api/planets/1";
        personagemA.films = new ArrayList<>();
        personagemA.films.add("https://swapi.info/api/films/1");
        personagemA.films.add("https://swapi.info/api/films/2");
        personagemA.films.add("https://swapi.info/api/films/3");
        personagemA.films.add("https://swapi.info/api/films/6");
        personagemA.vehicles = new ArrayList();
        personagemA.vehicles.add("https://swapi.info/api/vehicles/14");
        personagemA.vehicles.add("https://swapi.info/api/vehicles/30");
        personagemA.starships = new ArrayList();
        personagemA.starships.add("https://swapi.info/api/starships/12");
        personagemA.starships.add("https://swapi.info/api/starships/22");
        personagemA.created = "2024-12-09T13:50:51.644000Z";
        personagemA.edited = "2024-12-20T21:17:56.891000Z";
        personagemA.url = "https://swapi.info/api/people/1";


        personagemA.imprimirDados();

    }
}