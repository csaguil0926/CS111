public class CS111Library {

    //A library a java file with functions inside

    //Method/function to compute the factorial of a number x (input)
    //The method returns an integer
    public static int factorial (int x) { //definition/implementation of the method

        int result = 1; //hold the factorial of number x

        for (int i = 2; i<= x; i++) {
            result *= i; //same as result = result * i;
        }
        return result; //returning the value of the result to the caller method
    }

    //computes the absolute value of a number
    public static double absolute (double number) {

        if (number >= 0) {
            //positive
            return number;
        } else{
            //negative
            return number * -1.0;
        }
    }

    //Find the minimum value on an 1d double array
    public static double findMinimum (double[] array) {
        
        double min = array[0];
        for (int i = 1; i<array.length; i++) {
            if (min>array[i]){
                //found a new min
                min = array[i];
            }
        }
        return min;

    }

    //makes a copy of the integer array argument
    //returns a new array which is the copy of the argument array
    public static int[] copyArray (int[] copyFrom) {

        int[] copyTo = new int[copyFrom.length]; //allocated memory space for the copyTo array

        //traverse every single item of copyFrom and copy into copyTo
        for(int i = 0; i<copyFrom.length; i++) {
            copyTo[i]=copyFrom[i];
        }

        //copyTo = copyFrom; not a real copy actually copies memory addresses not values
        return copyTo;
    }

    //main method used to test my library
    public static void main (String[] args) { //main metod signature

        int number = 4;
        int fact = factorial(number); //calling the factorial method
        StdOut.println(fact);

        StdOut.println((absolute(-89.3)));
        StdOut.println((absolute(127.2)));

        double[] a = {7.3, 8.2, 835.1, 3.1, 1298.4, 12.5};
        StdOut.println(findMinimum(a));

        int[] array1 = {4, 2, 6, 13, 66, 98, 294, 73};
        int[] array2;
        //array2 = array1; is this copying? NO
        array2 = copyArray(array1);
    }
}