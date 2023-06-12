package MethodsProblem08;

public class Average {


    public static boolean checkAverage(int[] first, int[] second) {
        int sumFirst = 0;
        int sumSecond = 0;
        for (int i = 0; i < first.length; i++) {
            sumFirst += first[i];
            sumSecond += second[i];
        }

        if (sumFirst == sumSecond) {
            return true;
        } else {
            return false;
        }
    }
}
