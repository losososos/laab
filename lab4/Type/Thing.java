package Type;

public enum Thing {
    NONE(""),
    ROCKET("rocket"),
    MOON("moon"),
    MOONGUYS("moon korotishki"),
    OTHER("other things"),
    ABOUT("about"),
    THAT("that"),
    SO("so"),
    SMTH("something"),
    IT("it"),
    NOTE("a note"),
    WHAT("what"),
    WRITTEN("\"to Solnechniy gorod\""),
    TELEGRAM("telegram"),
    TODO("to do"),
    WRITTEN2("\"went to Solnechniy gorod\""),
    WRITTEN3("\"Vintik, Shpuntik to Solnechniy gorod\"");

    private final String name;

    Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}