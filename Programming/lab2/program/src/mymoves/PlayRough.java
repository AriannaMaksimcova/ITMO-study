package mymoves;

import ru.ifmo.se.pokemon.*;

public class PlayRough extends PhysicalMove {
    public PlayRough(double pow, double acc) {
        super(Type.FAIRY, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (chance(0.1)) {
            Effect attack = new Effect().stat(Stat.ATTACK, -1);
            p.addEffect(attack);
        }
    }

    @Override
    protected String describe () {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];
    }
    public static boolean chance(double d){
        return d > Math.random();
    }
    }
