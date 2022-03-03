public class Vector{

    // Create a zero vector of length n
    public Vector(int n) {
        this.length = n;
        this.elements = new double[n];
    }

    // Create a vector with values
    public Vector(double[] elements) {
        this.length = elements.length;

        // Make a new array so the user cannot change the original array and alter this
        this.elements = new double[this.length];

        // Copy elements into new elements
        for (int i = 0; i < this.length; i++) this.elements[i] = elements[i];
    }

}