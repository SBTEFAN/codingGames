import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        char[] tabline1 = line1.toCharArray();

        String line2 = in.nextLine();
        char[] tabline2 = line2.toCharArray();
        String line3 = in.nextLine();
        char[] tabline3 = line3.toCharArray();
        String ref1 = " _ " + "   " + " _ " + " _ " + "   " + " _ " + " _ " + " _ " + " _ " + " _ ";
        String ref2 = "| |" + "  |" + " _|" + " _|" + "|_|" + "|_ " + "|_ " + "  |" + "|_|" + "|_|";
        String ref3 = "|_|" + "  |" + "|_ " + " _|" + "  |" + " _|" + "|_|" + "  |" + "|_|" + " _|";
        char[] tabref1 = ref1.toCharArray();
        char[] tabref2 = ref2.toCharArray();
        char[] tabref3 = ref3.toCharArray();
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        for (int l = 0; l < line1.length() / 3; l++) {
            for (int r = 0; r < ref1.length() / 3; r++) {
                if (("" + tabline1[0 + 3 * l] + tabline1[1 + 3 * l] + tabline1[2 + 3 * l] + tabline2[0 + 3 * l]
                        + tabline2[1 + 3 * l] + tabline2[2 + 3 * l] + tabline3[0 + 3 * l]
                        + tabline3[1 + 3 * l] + tabline3[2 + 3 * l])
                        .equals("" + tabref1[0 + 3 * r] + tabref1[1 + 3 * r] + tabref1[2 + 3 * r] + tabref2[0 + 3 * r]
                                + tabref2[1 + 3 * r] + tabref2[2 + 3 * r] + tabref3[0 + 3 * r] + tabref3[1 + 3 * r]
                                + tabref3[2 + 3 * r])) {
                    System.out.print(r);
                }

            }
        }

    }
}
