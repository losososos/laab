package swmp.Lombre;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import swmp.Lotad.Lotad;

public class Lombre extends Lotad {


    public Lombre(String name, int lvl) {

        super(name, lvl);
        this.setStats(60, 50, 50, 60, 70, 50);
        this.addMove(new Absorb());

    }

    public Lombre() {
        super();
        this.setStats(60, 50, 50, 60, 70, 50);
        this.addMove(new Absorb());
    }

}