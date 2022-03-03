public class NestedLoops {

    public static void main (String[] args) {

        int n = 3; //1 op

        //r=1 (1op)
        //r<=n (1op) happens n times when it is true, +1 when it is false
        //r ++ (1op) happens n times
        for (int r = 1; r <= n; r++) { //outer loop

            //c=1 (1op) happens n times
            //c<=n (1op) (happens n times when it is true, +1 when it is false) * n
            //c++ (1op) (happens n times) * n
            //s.o.p (1op) (happens n times) * n
            for (int c = 1; c <= n; c++) { //inner loop
                System.out.print("* ");
            }

            //1 op -happens n times
            System.out.println(); //prints a new line
        }

        // 1 + 1 + n + 1 + n + n + (n + 1) * n + n * n + n * n + n
        //3 + 5n + 3n^2
    }
}