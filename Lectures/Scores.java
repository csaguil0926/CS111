public class Scores {

    public static void main(String[] args){

        //declare the 2d array of 3 rows (students) and 4 columns (quizzes)
        double[][] scores = new double[3][4];

        //populate array randomly
        //scores.length is the number of rows
        for (int s = 0; s<scores.length; s++) {

            //for each row s populate the columns
            //scores[s].length is the number of columns in row s

            for (int q=0; q<scores[s].length; q++) {
                
                scores[s][q]=Math.random()*10; //value between 0 and less than 10
                System.out.println("[" + s + "]" + "[" + q + "] = " + scores[s][q]);

                //average all the quizzes for student at index s
                //go to row at index s and traverse all columns summing it up

            }

            //average all the quizzes for student at index s
            //go to row at index s and traverse all columns summing it up

            double quizSum = 0.0;
            for (int q = 0; q<scores[s].length; q++) {
                quizSum += scores[s][q];
            }
            System.out.println("Average of quizzes for student " + s + "=" + quizSum/scores[s].length);

        }

        //average all the quizzes for student at index 0
        //go to row at index 0 and traverse all columns summing it up

        //double quizSum = 0.0;
        //for (int q = 0; q<scores[0].length; q++) {
            //quizSum += scores[0][q];
        //}
        //System.out.println(quizSum/scores[0].length);

        //average of the student's grades for each quiz at index 0
        //int quiz = 0; //quiz index we want to average
        //double sum = 0;
        //for (int s = 0; s<scores.length; s++) {
            //sum += scores[s][quiz];
        //}
        //System.out.println(sum/scores.length);

        //int quiz = 1; quiz index we want to average
        //every single row has the same umber of columns

        for (int q = 0; q<scores[0].length; q++) { //interating over the columns
            double sum = 0; //summing variable for one quiz
            for (int s = 0; s < scores.length; s++) {
                sum += scores[s][q];
            }
            System.out.println("Average for quiz " + q + " = " + sum/scores.length);
        }

    }
}