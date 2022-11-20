package mypokemons;

import mymoves.Flamethrower;
import mymoves.PoisonSting;
import mymoves.ShadowClaws;
import mymoves.FuryAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoking extends Pokemon {
    public Nidoking(String name, int level){
        super(name, level);

        super.setType(Type.POISON, Type.GROUND);
        super.setStats(81, 102, 77, 85, 75, 85);

        ShadowClaws shadowClaws = new ShadowClaws(70, 100);
        PoisonSting poisonSting = new PoisonSting(15, 100);
        FuryAttack furyAttack = new FuryAttack(15, 85);
        Flamethrower flamethrower = new Flamethrower(90, 100);
        super.setMove(shadowClaws, poisonSting, furyAttack, flamethrower);


    }
}
