public class Matrix{

    public static void main(String[] args){

        int sum1=0;
        int sum0=0;

        int[][] board = {{1,0,1,0},{1,1,0,1},{1,0,0,1},{0,0,1,0}};
        for (int i = 0; i<board.length; i++) {
            for (int j = 0; j<board[i].length; j++) {

                if (board[i][j] == 0) {
                    sum0 = sum0 + 1;
                } else {
                    sum1 = sum1 +1;
                }
            }
        }
        
        System.out.println(sum0);
        System.out.println(sum1);

        int[] arr = {1,2,3,4,5};
        int num = arr[arr.length-2];

        System.out.println(num);


    }
}