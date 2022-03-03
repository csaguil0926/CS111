public class Debugging{

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); //read the command line argument
        int count = 0; //initialization

        while (count <= n) { //conditional
            System.out.print(count + " "); 
            count += 1; //increment

        }

        System.out.println(); //printing only new line
        System.out.println("Nest is the for loop prints");

        //write the above while loop into a for loop
        for (count=0; count<=n; count++) {
            System.out.print(count + " ");
        }
        //for loop counting operations
        //count = 0 (1 op) happens just one time
        //count <= n (1 op) happens n+1 times for true pls 1 time when conditional is false
        //count ++ (1 op) happens n+1 times 
        //sop (1 op) n+1


    }
}