public class MultiplicationTable {

    public static void printTable (int num){
        for (int i = 1; i <= num; i++){
            for (int j = 1; j<= num; j++){
                int product = i*j;
                System.out.print(product + " ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        printTable(n);
    }
}