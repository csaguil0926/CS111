public class LetterGrade {

    public static void main (String[] args) {

        double score = Double.parseDouble(args[0]);

        if (score<0 || score>1000) {
            System.out.println("Score is out of range");
        } else {
            if (score >= 900) {
                System.out.println("A");
            } else {
                if (score >= 850) {
                    System.out.println("B+");
                } else {
                    if (score >= 800) {
                        System.out.println("B");
                    } else {
                        if (score >= 750) {
                            System.out.println("C+");
                        } else {
                            if (score >= 700) {
                                System.out.println("C");
                            } else {
                                if (score >= 600) {
                                    System.out.println("D");
                                } else {
                                    System.out.println("F");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}