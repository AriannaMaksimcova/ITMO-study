package mymoves;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {
    public CalmMind(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect specialAttack = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        Effect specialDefence = new Effect().stat(Stat.SPECIAL_DEFENSE, 1);
        p.addEffect(specialAttack);
        p.addEffect(specialDefence);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
