import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;

//https://pokemondb.net/pokedex/relicanth
//https://pokemondb.net/pokedex/meowth
//https://pokemondb.net/pokedex/persian
//https://pokemondb.net/pokedex/nidoran-m
//https://pokemondb.net/pokedex/nidorino
//https://pokemondb.net/pokedex/nidoking

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Relicanth p1 = new Relicanth("Cube", 1);
        Meowth p2 = new Meowth("Kitten", 1);
        Persian p3 = new Persian("BigCat", 1);
        Nidoran p4 = new Nidoran("Dragon", 1);
        Nidorino p5 = new Nidorino("Worry", 1);
        Nidoking p6 = new Nidoking("Kesha", 1);


        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }


}