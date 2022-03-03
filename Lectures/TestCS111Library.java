public class TestCS111Library {
    public static void main(String[] args) {

        int[] array = {4, 7, 6, 3};
        for(int i = 0; i<array.length; i++) {
            StdOut.println(array[i] +" "+ CS111Library.factorial(array[i]));
        }

        int[] copy = CS111Library.copyArray(array);
        for(int item : copy) { //enhanced for loop
            StdOut.println(item);
        }
    }
}