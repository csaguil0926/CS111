/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author: Carolette Saguil, cas699@scarletmail.rutgers.edu, cas699
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {

        double min = 0.0;
        double min2= 0.0;

        min = min2 = Double.MAX_VALUE;

        for (int i=0; i<args.length; i++) {

            double num1 = Double.parseDouble(args[i]);

            if (num1<min){
                min2 = min;
                min = num1;
            } else if (num1<min2) {
                min2 = num1;
            }
            
        }

        System.out.println(min);
        System.out.println(min2);
        
    }

}
