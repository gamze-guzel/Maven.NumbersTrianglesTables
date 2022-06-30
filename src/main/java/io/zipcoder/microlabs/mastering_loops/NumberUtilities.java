package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String x = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                x += i;
            }
        }
        return x;
    }


    public static String getOddNumbers(int start, int stop) {
        String x = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                x += i;
            }
        }
        return x;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
       StringBuilder squareNumber= new StringBuilder();
        for (int i = start; i < stop; i+=step) {
            squareNumber.append(i * i);
        }
        return String.valueOf(squareNumber);
}

    public static String getRange(int stop) {
        return getRange( 0 ,stop, 1 );
       // String result = " ";
       // for (int i = 0; i < stop; i++)

        //return result;
    }

    public static String getRange(int start, int stop) {
        return getRange(start,stop,1 );
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder str= new StringBuilder();
        for(int i= start; i<stop; i+=step ) {
            str.append(i);
        }

        return str.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder exponentiation= new StringBuilder();
        for (int i= start; i<stop; i+=step) {
            exponentiation.append((int) Math.pow(i, exponent));

        }
        return String.valueOf(exponentiation);
    }
}
