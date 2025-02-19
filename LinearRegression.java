public class LinearRegression {

    public static double calcM(double[][] data) {
        int n = data.length;
        double sumX = 0; 
        sumY = 0; 
        sumXY = 0;
        sumX2 = 0;

        for (double[] point : data) {
            double x = point[0];
            double y = point[1];
            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
        }

        return (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
    }

    public static double calcB(double[][] data) {
        int n = data.length;
        double sumX = 0; 
        sumY = 0;

        for (double[] point : data) {
            sumX += point[0];
            sumY += point[1];
        }

        double meanX = sumX / n;
        double meanY = sumY / n;
        double m = calcM(data);

        return meanY - m * meanX;
    }
}
