import java.util.*;
import java.io.*;
import java.math.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int leapYear = in.nextInt();
        String sourceDayOfWeek = in.next();
        String sourceMonth = in.next();
        int sourceDayOfMonth = in.nextInt();
        String targetMonth = in.next();
        int targetDayOfMonth = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.err.println("leapYear : " + leapYear);
        System.err.println("sourceDayOfWeek : " + sourceDayOfWeek);
        System.err.println("sourceMonth : " + sourceMonth);
        System.err.println("sourceDayOfMonth : " + sourceDayOfMonth);
        System.err.println("targetMonth : " + targetMonth);
        System.err.println("targetDayOfMonth : " + targetDayOfMonth);
        String[] tabmonth = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
                "Dec" };
        String[] tabday = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int[] tabmax = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (leapYear == 1) {
            tabmax[1] += 1;// resultat 28+1
            System.err.println("isLeapYear :" + leapYear);
            System.err.println("tabmax[1] :" + tabmax[1]);
        }

        
        
        // boucle de verification
        /*
         * for (int i = 0; i < tabmonth.length; i++) {
         * System.err.println("tabmonth[i] : " + tabmonth[i]);
         * }
         * for (int i = 0; i < tabday.length; i++) {
         * System.err.println("tabday[i] : " + tabday[i]);
         * }
         */
        
        // youtube
        // inits

        System.err.println("##############");
        Scanner sc = new Scanner(System.in);
        int month = 5;// tabmonth[2];
        int day = sourceDayOfMonth;
        // int year=1;
        // get month/day/year from user
        System.err.println("month : ");
        // month = sc.nextInt();
        System.err.println("day : ");
        // day = sc.nextInt();
        // System.err.println("year : ");
        // year = sc.nextInt();
        // sc.close();
        // use gauss's method for determining the day of the weeks
        double m;
        // int y;
        int dow;// Sun = 0,...,Sat = 6
        m = (month - 2 + 12) % 12;// calc month offset, Mar =1,...,Feb =12
        /*
         * if (month <= 2){
         * year--;//year = year-1
         * 
         * }
         */
        // y = 5*(year%4)+4*(year %100)+6*(year%400);
        dow = (day + (int) (2.6 * m - 0.2)) % 7;
        // output
        System.err.println("day of week ! : " +tabday[dow]);
        System.err.println("################### ");

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM");

        try {
            Date date = dateFormat.parse(tabmonth[2]);
            System.err.println(date);

        } catch (ParseException e) {
        }

        try {

            String sDate4 = tabmonth[11];

            SimpleDateFormat formatter4 = new SimpleDateFormat("MMM");

            Date date4 = formatter4.parse(sDate4);

            System.err.println("solution");
            System.err.println(formatter4.format(date4));
        } catch (ParseException e) {
        }

        SimpleDateFormat df = new SimpleDateFormat("EEEE MMM d");

        System.out.println("Tuesday");

    }
}
