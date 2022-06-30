package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
         String Tri="";
         for (int i=1; i<=numberOfRows; i++ ) {
             Tri += getRow(i)+ "\n";
         }
        return Tri;
    }

    public static String getRow(int numberOfStars)  {
        String Row= "";
        for(int i = 1; i <= numberOfStars; i++) {
            Row += "*";
        }
        return Row;
    }

    public static String getSmallTriangle() {
        String out="";
        for(int i = 1; i <= 4; i++) {
            out += getRow(i) + "\n";
        }

        return out;
    }

    public static String getLargeTriangle() {
        String out="";
        for(int i = 1; i <= 9; i++) {
            out += getRow(i) + "\n";
        }

        return out;

    }
}
