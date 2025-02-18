public class Runner {
    public static void main(String[] args) {
        double[][] iceCreamData = {
            {14.2, 215},
            {16.4, 325},
            {11.9, 185},
            {15.2, 332},
            {18.5, 406},
            {22.1, 522},
            {19.4, 412},
            {25.1, 614},
            {23.4, 544},
            {18.1, 421},
            {22.6, 445},
            {17.2, 408}
        };

        double m = LinearRegression.calcM(iceCreamData);
        double b = LinearRegression.calcB(iceCreamData);

        System.out.println("Linear Regression Equation: y = " + m + "x + " + b);
    }
}
