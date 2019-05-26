public class Circle {

    public static double findSquare(double r1, double r2) {
        if (isNormalData(r1, r2) != true) {
            System.out.println("r1<r2");
            return -1.0;
        }
        final double Pi = 3.1415926536;
        double s = Pi * (r1*r1 - r2*r2);
        return s;
    }

    public static boolean isNormalData(double outerRad, double innerRad) {
        return outerRad > innerRad;
    }
}
