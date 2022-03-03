public class LongRepeatingSub{

    public static String subseq(String input){
        int count = 1;
        int truecount = 1;
        char nowchar = input.charAt(0);
        char longchar = input.charAt(0);

        for (int i = 1; i<input.length(); i++){
            if (nowchar==input.charAt(i)){
                count += 1;
                if (count>truecount){
                    truecount=count;
                    longchar=nowchar;
                }
            } else {
                count = 1;
                nowchar=input.charAt(i);
            }

        }

        String output = "";
        for (int i = 0; i<truecount; i++){
            output += longchar;
        }

        return output;
    }

    public static void main (String[] args){
        StdOut.print(subseq("abbbcccccccccccc"));
    }
}