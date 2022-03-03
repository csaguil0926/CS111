public class Pay{

    public static void main(String[] args){

        //command line arguments come into the program through the variable args
        //first argument is args[0]
        //second argument is args[1]
        double hours = Double.parseDouble(args[0]); //reads the first argument as a double from the command line

        double rate = Double.parseDouble(args[1]); //reads the second argument as a double from the command line

        if (hours <= 0 || rate <= 0) {

            System.out.println("Error: hours or pay rate is less than zero");


        } else {
            double pay = hours * rate;
            System.out.println("Pay is " + pay);
        }
    }
}