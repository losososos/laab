package ee.Eevee;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class QuickAttack extends PhysicalMove {

    public QuickAttack(){
        this.type = Type.NORMAL;
        this.power = 40;
        this.accuracy = 100;
        this.priority = 1;

    }

    @Override
    protected String describe() {
        return "use Quick Attack";
    }

}