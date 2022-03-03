public class CommandLineArray {

    public static void main(String[] args) {

        System.out.println("Number of args" + args.length);

        for (int i=0; i<args.length; i++) {

            double var = Double.parseDouble(args[i]);
            System.out.println(var);
        }
    }
}