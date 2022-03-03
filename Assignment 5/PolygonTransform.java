/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Carolette Saguil, cas699@scarletmail.rutgers.edu, cas699
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        double[] arrayCopy = new double[array.length];
        for (int i = 0; i < array.length; i++){
            arrayCopy[i] = array [i];
        }
        return arrayCopy;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++){
            x[i] = x[i] * alpha;
        }
        for (int i = 0; i < y.length; i++){
            y[i] = y[i] * alpha;
        }
        StdDraw.polygon(x,y);
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++){
            x[i] = x[i] + dx;
        }
        for (int i = 0; i < y.length; i++){
            y[i] = y[i] + dy;
        }
        StdDraw.polygon(x,y);
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

        double radian = Math.toRadians(theta);

        double[] oldx = copy(x);

        for (int i = 0; i < x.length; i++){
            x[i] = (x[i]*Math.cos(radian)) - (y[i]*Math.sin(radian));        }
        for (int i = 0; i < y.length; i++){
            y[i] = y[i]*Math.cos(radian) + (oldx[i]*Math.sin(radian));
        }
        StdDraw.polygon(x,y);
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
    }
}
