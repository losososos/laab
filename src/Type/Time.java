package Type;

public enum Time {
    NONE("none"),
    EARLY("early"),
    ASALWAYS("as always"),
    INTHEMORNING("in the morning");


    private final String name;

    Time(String name) {
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

