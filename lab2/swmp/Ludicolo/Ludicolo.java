package swmp.Ludicolo;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import swmp.Lombre.Lombre;
import swmp.Lotad.Lotad;

public class Ludicolo extends Lombre {


    public Ludicolo(String name, int lvl) {
        super(name, lvl);
        this.setStats(80, 70, 70, 90, 100, 70);
        this.addMove(new Facade());
    }

    public Ludicolo() {
        super();
        this.setStats(80, 70, 70, 90, 100, 70);
        this.addMove(new Facade());
    }

}
