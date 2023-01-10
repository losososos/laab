package Type;

public enum GroupTypes {
    KOROTISHKI("korotishki"),
    BOLTIKI("Vintik and Shpuntik");

    private final String name;

    GroupTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
