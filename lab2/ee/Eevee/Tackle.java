package ee.Eevee;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends PhysicalMove {

    public Tackle(){
        this.type = Type.NORMAL;
        this.power = 40;
        this.accuracy = 100;

    }

    @Override
    protected String describe() {

        return "use Tackle";
    }

}