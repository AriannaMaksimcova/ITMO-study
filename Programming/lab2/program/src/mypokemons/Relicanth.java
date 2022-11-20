package mypokemons;

import mymoves.AquaTail;
import mymoves.Bulldoze;
import mymoves.CalmMind;
import mymoves.StoneEdge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Relicanth extends Pokemon {
    public Relicanth(String name, int level){
        super(name, level);

        super.setType(Type.WATER, Type.ROCK);
        super.setStats(100, 90, 130, 45, 65, 55);

        CalmMind calmMind = new CalmMind(0, 0);
        StoneEdge stoneEdge = new StoneEdge(100, 80);
        Bulldoze bulldoze = new Bulldoze(60, 100);
        AquaTail aquaTail = new AquaTail(90, 90);
        super.setMove(stoneEdge, calmMind, bulldoze, aquaTail);
    }
}
