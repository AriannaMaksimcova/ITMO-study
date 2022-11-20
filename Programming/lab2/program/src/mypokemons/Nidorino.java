package mypokemons;

import mymoves.PoisonSting;
import mymoves.ShadowClaws;
import mymoves.FuryAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidorino extends Pokemon {
    public Nidorino(String name, int level){
        super(name, level);

        super.setType(Type.POISON);
        super.setStats(61, 72, 57, 55, 55, 65);

        ShadowClaws shadowClaws = new ShadowClaws(70, 100);
        PoisonSting poisonSting = new PoisonSting(15, 100);
        FuryAttack furyAttack = new FuryAttack(15, 85);
        super.setMove(shadowClaws, poisonSting, furyAttack);


    }
}
