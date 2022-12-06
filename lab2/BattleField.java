import ee.Eevee.Eevee;
import ee.Espeon.Espeon;
import hawl.Hawlucha;
import swmp.Lombre.Lombre;
import swmp.Lotad.Lotad;
import swmp.Ludicolo.Ludicolo;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class BattleField extends Eevee {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Hawlucha("a", 30);
        Pokemon p2 = new Hawlucha("b", 30);
        Pokemon p3 = new Hawlucha("c", 30);
        Pokemon p4 = new Hawlucha("d", 30);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addFoe(p3);
        b.addFoe(p4);

        b.go();
    }
}
