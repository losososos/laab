package ee.Espeon;

import ru.ifmo.se.pokemon.*;

public class Psybeam extends SpecialMove {

    public Psybeam(){
        this.type = Type.PSYCHIC;
        this.power = 65;
        this.accuracy = 100;

    }

    @Override
    protected String describe() {
        return "use Psybeam";
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        if (new Effect().chance(0.1).success()) {
            Effect.confuse(pok);
        }
    }
}