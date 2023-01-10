package Entity;

import java.util.Arrays;

public class Things {
    private final Object [] ThingsArray;

    public Things(Object[] thingsArray) {
        this.ThingsArray = thingsArray;
    }

    public void thingsOut() {
        for(int i = 0; i< ThingsArray.length-1; i++){
            System.out.print(ThingsArray[i]+", ");
        }
        System.out.println(ThingsArray[ThingsArray.length-1]);
    }

    @Override
    public String toString() {
        return "Things{" +
                " things = " + Arrays.toString(ThingsArray) +
                " }";
    }

}
