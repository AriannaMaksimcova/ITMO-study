package mypokemons;

import mymoves.PoisonSting;
import mymoves.ShadowClaws;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoran extends Pokemon {
    public Nidoran(String name, int level){
        super(name, level);

        super.setType(Type.POISON);
        super.setStats(46, 57, 40, 40, 40, 50);

        ShadowClaws shadowClaws = new ShadowClaws(70, 100);
        PoisonSting poisonSting = new PoisonSting(15, 100);
        super.setMove(shadowClaws, poisonSting);


    }
}
