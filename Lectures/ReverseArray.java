public class ReverseArray {

    public static void main(String[] args) {
        char[] today = {'T','o','d','a','y',' ','i','s',' ','s','u','n','n','y'};

        //traverse from beginning to the middle of the array
        for (int i=0; i<today.length/2; i++) {

            //swap the item at index i with the item at index length - 1 - i
            char temp = today[i]; //save today[i]
            today[i] = today[today.length - 1 -i];
            today[today.length - 1 - i] = temp;
        }

        //i isn't visible

        for (int i = 0; i < today.length; i++) {
            System.out.print(today[i]);
        }
        System.out.println(); //insert new line

        //for each loop (enhanced loop)
        for (char itemValue : today) {
            // at each iteration item Value assume the value of the item in the array
            System.out.print(itemValue);
        }
    }
}