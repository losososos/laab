package ee.Eevee;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon {


    public Eevee(String name, int lvl) {

        super(name, lvl);
        this.addType(Type.NORMAL);
        this.setStats(55, 55, 50, 45, 65, 55);

        this.setMove(new ShadowBall(), new Tackle(), new QuickAttack());

    }

    public Eevee() {
        super();

        this.addType(Type.NORMAL);
        this.setStats(55, 55, 50, 45, 65, 55);
        this.setMove(new ShadowBall(), new Tackle(), new QuickAttack());
    }

}