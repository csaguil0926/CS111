public class Methods{

    public static int gcf (int num1, int num2){

        int smallest = num1;
        if (num1>num2){
            num2 = smallest;
        }

        for (int divisor=smallest; divisor>1; divisor--){
            if (num1 % divisor == 0 && num2 % divisor == 0){
                return divisor;
            }
        }
        return 1;
    }

    public static void simplify(int numerator, int denominator){
        int factor = gcf(numerator, denominator);
        numerator /= factor;
        denominator /= factor;
        System.out.print(numerator + "/" + denominator);
    }

    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int factor = gcf(num1, num2);
        System.out.println(factor);
        simplify(num1, num2);

    }
    
}