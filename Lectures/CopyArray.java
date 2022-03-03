public class CopyArray {

    public static void main(String[] args) {

        double[] array = new double[300]; //declaring,creating the array

        //add random values
        for (int i = 0; i<array.length; i++) {
            array[i] = Math.random(); //put random values
        }

        double[] arrayCopy = new double[array.length];

        //copy
        arrayCopy = array; //doesn't work bc the address of aray is copy into arrayCoppy

        //how do i truly copy?
        for (int i=0; i<array.length; i++) {
            arrayCopy[i] = array[i];
        }
    }
}