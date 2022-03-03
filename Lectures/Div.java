public class Div
{
    public static void main ( String[] args ) {

        double dividend = Double.parseDouble(args[0]);
        double divisor = Double.parseDouble(args[1]);

        if (divisor == 0) {
            System.out.println("Error, cannot divide by 0");
        } else {
            double quotient = dividend/divisor;
            System.out.println(quotient);
        }
    }
}