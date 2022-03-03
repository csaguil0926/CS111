public class Palindrome {

    //loop through first half and loop through second half
    public static boolean isPalindrome (String input){

        int index = input.indexOf(" ");
        
        input = input.toLowercase();
        //input = racecar
        //length = 7
        int length = input.length();
        for (int i = 0; i<length/2;i++) {
            if (input.charAt(i) != input.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        StdOut.print(isPalindrome("racecar"));


    }
}