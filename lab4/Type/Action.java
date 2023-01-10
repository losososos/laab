package Type;

public enum Action {
    DISAPPEAR("disappear"),
    SEND("send"),
    SEE("see"),
    WAKEUP("wake up"),
    WRITE("write"),
    SKIP("skip"),
    DECIDE("decide"),
    COMPLETE("complete"),
    UNDERSTAND("understand"),
    LEAVE("leave"),
    READ("read"),
    KNOW("know"),
    DREAM("dream"),
    NEED("need"),
    PACK("pack"),
    SLEEP("fell asleep");


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
