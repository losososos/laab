package ee.Eevee;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {

    public ShadowBall(){
        this.type = Type.GHOST;
        this.power = 80;
        this.accuracy = 100;

    }

    @Override
    protected String describe() {
        return "use Shadow Ball";
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        pok.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, -1).chance(0.2));
    }

}