public class RecursiveFactorial {

    public static int recfactorial(int n){
        int result = 1;
        if (n==0){
            return 1;
        }
        result = n*recfactorial(n-1);
        return result;
    }
}