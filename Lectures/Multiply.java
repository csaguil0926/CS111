public class Multiply {

    public static void main (String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int total = 0; //summing variable
        
        while (a>0) {
            total = total + b;
            a = a-1;
        }

        System.out.println(total);

        //example of pre and post increment

        //a=0
        System.out.println(a++); //post increment means, use the value of the variable them increment

        //a=1
        System.out.println(++a); //pre increment means, increment first and then use the value
    }
}