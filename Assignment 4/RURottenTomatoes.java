/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Carolette Saguil, cas699@scarletmail.rutgers.edu, cas699
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		int r = Integer.parseInt(args[0]);
		int c = Integer.parseInt(args[1]);

		int reviews[][] = new int[r][c];

		int v = 2;

		for (int i = 0; i<reviews.length; i++){
			for (int j = 0; j<reviews[i].length; j++){
				reviews[i][j] = Integer.parseInt(args[(v)]);
				v = v+1;
			}
		}

		int sumhigh = Integer.MIN_VALUE;
		int index = 0;

		for (int i = 0; i<reviews[0].length; i++){
			int sumc = 0;
			for (int j = 0; j<reviews.length; j++){
				sumc = sumc + reviews[j][i];
				
			}

			if (sumc>sumhigh){
				sumhigh = sumc;
				index = i;
			}
		}
		
		System.out.println(index);
		
	}
}
