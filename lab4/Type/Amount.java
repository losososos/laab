package Type;

public enum Amount {
    ONE("one"),
    TWO("two"),
    MANY("many");

    private final String name;

    Amount(String name) {
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

