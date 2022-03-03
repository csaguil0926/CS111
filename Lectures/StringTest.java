public class StringTest {

    //returns the number of times c appears in str
    public static int letterCount(String str, char c){

        int counter = 0;
        String strLowercase = str.toLowerCase(); //creating a new object where all the character are lowercase
        char cLowercase = Character.toLowerCase(c); //converts c into lowercase

        for (int i = 0; i < strLowercase.length(); i++){
            char ch = strLowercase.charAt(i); //retrieves the character at index i from string strLowercase
            if (ch == cLowercase) {
                counter +=1;
            }   
        }
        return counter;
        
    }

    public static void main (String[] args) {

        StdOut.println(letterCount("Sleeping Cat", 'e'));
        StdOut.println(letterCount("Sleeping Cat", 'h'));
        StdOut.println(letterCount("Sleeping Cat", 's'));
    }
}