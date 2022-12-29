package Type;

public enum Thing {
    NONE(""),
    SMTH("something"),
    IT("it"),
    NOTE("a note"),
    TABLE("table"),
    WRITTEN("\"to Solnechniy gorod\""),
    WRITTEN2("\"went to Solnechniy gorod\"");

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