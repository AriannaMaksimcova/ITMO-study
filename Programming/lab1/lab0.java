public class Main {
    public static void main(String[] args) {
        short[] c = {18, 16, 14, 12, 10, 8, 6, 4, 2};
        double[] x = new double[11];
        for (int i = 0; i < x.length; i++) {
            x[i] = ((double) (Math.random() * 18) - 11);
        }
        //double[9][11] m;
        double[][] m = new double[9][11];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 11; j++) {
                if (c[i] == 12) {
                    m[i][j] = Math.cbrt(Math.pow((3.0 / 4.0) / (x[j] + 1) * (Math.log10(Math.abs(x[j])) - 1), Math.sin(x[j])));
                } else if ((c[i] == 2) | (c[i] == 4) | (c[i] == 6) | (c[i] == 14)) {
                    m[i][j] = Math.log10(Math.pow((2 / Math.abs(x[j])), x[j])) * Math.pow(1.0 / 4.0 - Math.pow(Math.cbrt(x[j]), 2), 2);
                } else {
                    m[i][j] = Math.pow(2 * (1 - Math.pow(2 * (1 - Math.pow(Math.pow((x[j] + 1), 2), Math.cbrt(x[j]))), 2)), Math.tan(Math.pow(Math.pow((2.0 / 3.0) / x[j], 2), (1.0 / 4.0) * (Math.asin(((x[j] - 2) / 18) - 1)))));
                }
                String number = String.format("%.2f", m[i][j]);
                System.out.println(number);
            }
        }
    }
}
