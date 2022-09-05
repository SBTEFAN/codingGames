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
        char[][] tabline = new char[][] { tabline1, tabline2, tabline3 };
        char[][] tabref = new char[][] { tabref1, tabref2, tabref3 };
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        for (int l = 0; l < line1.length() / 3; l++) {
            for (int r = 0; r < ref1.length() / 3; r++) {
                boolean troistour = true;
                for (int li = 0; li < 3; li++) {
                    String resul = "" + tabline[li][0 + 3 * l] + tabline[li][1 + 3 * l] + tabline[li][2 + 3 * l];
                    String resulref = "" + tabref[li][0 + 3 * r] + tabref[li][1 + 3 * r] + tabref[li][2 + 3 * r];
                    troistour &= resul.equals(resulref);

                }
                if (troistour) {
                    System.out.print(r);
                }

            }
        }

    }
}
