package swmp.Ludicolo;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class Facade extends PhysicalMove {

    public Facade() {
        this.type = Type.NORMAL;
        this.power = 70;
        this.accuracy = 100;

    }

    @Override
    protected String describe() {
        return "use Facade";
    }


    @Override
    protected double calcBaseDamage(Pokemon poka, Pokemon pokb) {
        if (poka.getCondition() == Status.BURN | poka.getCondition() == Status.POISON | poka.getCondition() == Status.PARALYZE) {
            return super.calcBaseDamage(poka, pokb) * 2;
        } else {
            return super.calcBaseDamage(poka, pokb);
        }
    }
}