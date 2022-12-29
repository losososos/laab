package Type;

public enum Action {
    DISAPPEAR("disappear"),
    SEE("see"),
    WAKEUP("wake up"),
    WRITE("write"),
    SKIP("skip"),
    DECIDE("decide"),
    COMPLETE("complete"),
    UNDERSTAND("understand"),
    LEAVE("leave"),
    READ("read"),
    MEAN("mean"),
    KNOW("know");


    private final String name;

    Action(String name) {
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
