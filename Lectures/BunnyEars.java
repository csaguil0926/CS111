public class BunnyEars{

    //returns the number of ears in a line of n bunnies
    public static int rBunnyEars(int n){
        if (n==0){
            return 0; //base case
        }
        
        if (n%2==0){
            //even position has 3 bunny ears
            return 3 + rBunnyEars(n-1);
        } else {
            //odd position has 2 bunny ears            return 2 + rBunnyEars(n-1);
        }
    }

    public static void main(String[] args){

        StdOut.print("Enter a number: ");
        int number = StdIn.readInt();
        int result = rBunnyEars(number);
        StdOut.print(result);
    }
}