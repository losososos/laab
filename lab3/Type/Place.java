package Type;

public enum Place {
    NONE("none"),
    ROOM("Znaika's room"),
    HOME("home"),
    SUNCITY("Solnechniy gorod"),
    BREAKFAST("breakfast"),
    TABLE("on the table");

    private final String name;

    Place(String name) {
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
