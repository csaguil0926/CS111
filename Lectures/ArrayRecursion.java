public class ArrayRecursion{

    public static int sum(int[] array, int bIndex) {

        //base case
        if ( bIndex == array.length-1){
            //reached the last index of the array
            return array[bIndex]; //returns the last item
        }

        //recursive case
        return array[bIndex] + sum(array, bIndex+1);
    }

    public static void main(String[] args) {

        int[] a = {83, 1, 45, 2, 23, 12, 3, 8, 4, 34};
        int sum = sum(a, 0);
        StdOut.println("Sum is " + sum);
    }
}