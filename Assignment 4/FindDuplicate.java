/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Carolette Saguil, cas699@scarletmail.rutgers.edu, cas699
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {
    public static void main(String[] args) {

		boolean duplicate = false;

		for (int i= 0; i<args.length; i++) {

			int num1 = Integer.parseInt(args[i]);

			for (int j = i+1; j<args.length; j++) {

				int num2 = Integer.parseInt(args[j]);

				if (num1 == num2) {
					duplicate = true;
				}
			}
		}
		System.out.println(duplicate);
	}
}
