public class IterativeInput {

    public static void main (String[] args) {
        
        //instead of System.out.println(""); will use StdOut.println("");
        StdOut.print("Hey, user, enter an integer: ");
        int value = StdIn.readInt(); //reads an integer from the standard input
        StdOut.println("User entered " + value);
    }
}