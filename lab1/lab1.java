import static java.lang.Math.*;

public class lab1 {
    public static void main(String[] args) {
        long[] a = new long[9];
        float[] x = new float[13];
        float max = 13.0f, min = -8.0f;
        for (int i = 0; i < 13; i++) {
            float rn = (float) (random() * max) + min;
            x[i] = rn;
        }
        double[][] c = new double[9][13];
        for (int i = 0; i < 9; i++) {
            if (a[i] == 19) {
                for (int j = 0; j < x.length; j++) {
                    c[i][j] = /*(float)*/ pow(0.25 * pow(pow((x[j] + 1), x[j]), (log10(abs(x[j])) / 2)), 3);
                }
            } else {
                if (a[i] == 11 || a[i] == 13 || a[i] == 17 || a[i] == 21) {
                    for (int j = 0; j < x.length; j++) {
                        c[i][j] = /*(float)*/ cbrt(tan(cbrt(x[j])));
                    }
                } else {
                    for (int j = 0; j < x.length; j++) {
                        c[i][j] = pow(E,pow((2.0/3.0)/atan(sin(x[j])),pow(pow(x[j],2*x[j])+(3.0/4.0),pow((1.0/3.0)/(1-x[j]),2))));
                    }
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%.3f\t", c[i][j]);
            }
            System.out.println("");
        }
    }
}