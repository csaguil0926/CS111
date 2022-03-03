public class UnderstandingArrays {

    public static void main(String[] args) {

        int[] varArray; //declaring a reference to an array
        varArray = new int[10]; //creating or allocating an array

        //10 items in the array varArray: 0 is the first item index, 9 is last item index

        varArray[0] = 56; //index 0 is the first position of the array
        varArray[1] = 78; //index 1 is the second position

        //the keyword new is a function that allocates the array in memory
        double[] doubleArray = new double[3000]; //declaring and creating an array
        doubleArray[50] = 4.3;

        char[] charArray = {'L','o','v','e'};
        System.out.println("Size of charArray is " + charArray.length);

        //i is the index on the array
        for (int i=0; i<charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}