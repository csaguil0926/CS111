public class RecursiveTriangle{

    public static void printRow(int nStars){
        if(nStars==0){
            System.out.println();
            return;
        }
        System.out.print("*");
        printRow(nStars-1);
    }

    public static void pyramid(int nStars){
        if (nStars==0){
            return; 
        }
        pyramid(nStars-1);
        printRow(nStars);
        
    }

    public static void upsideDownPyramid(int nStars){
        if (nStars==0){
            return;
        }
        printRow(nStars);
        upsideDownPyramid(nStars-1);
    }

    public static void main(String[] args){
        int peak = Integer.parseInt(args[0]);
        pyramid(peak);
        upsideDownPyramid(peak);
    }
}