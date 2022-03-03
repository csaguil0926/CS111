/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:Carolette Saguil, cas699@scarletmail.rutgers.edu, cas699
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        long barcodeNum = Long.parseLong(args[0]);
        int count = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        while (barcodeNum>0) {

            int digit = (int)(barcodeNum%10);
            count += 1;

            if (count%2 != 0) {
                sum1 = sum1 + digit;
            } else {
                sum2 = sum2 + digit;
            }

            barcodeNum = barcodeNum/10;
        }

        sum1 = sum1%10;
        sum2 = (sum2%10)*3;
        sum2 = sum2%10;
        sum3 = (sum1+sum2)%10;

        System.out.println(sum3);

    }
}