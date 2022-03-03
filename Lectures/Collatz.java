public class Collatz {

    //recursive
    public static void rCollatz (int n) {
        StdOut.print(n + " ");

        //base case
        if (n == 1){
            return; //reached the end of the sequence
        } 
        
        //recursive case
        if (n % 2 == 0) {
            rCollatz(n/2);
        } else {
            rCollatz(3*n+1);
        }
    }

    public static int nextNumberInSequence(int n) {
        if (n % 2 == 0) {
            return n/2;
        } else {
            return 3 * n + 1;
        }
    }

    //iterative
    public static void iCollatz (int n) {
        
        StdOut.print(n + " ");
        while (n != 1) {
            n = nextNumberInSequence(n);
            StdOut.print(n + " ");
        }
    }

    public static void main (String[] args){
        //to test our methods in collatz

        //test iterative
        StdOut.print("Enter a number: ");
        int number = StdIn.readInt();
        iCollatz(number);
        rCollatz(number);
    }
}