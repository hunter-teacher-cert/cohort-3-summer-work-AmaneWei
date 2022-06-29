/*
Create a new program called Time.java. From now on, we won’t remind you to start with a small, working program, but you should.

*/
public class Time {
    public static void main(String[] args) {

        // Following the example program in Section 2.4, create variables named hour, minute, and second. 
        // Assign values that are roughly the current time. Use a 24-hour clock so that at 2pm the value of hour is 14.
        int hour, minute, second;
        int secMin, secHour, secDay, totalSeconds;

        hour = 16;
        minute = 57;
        second = 54;

        secMin = 60;
        secHour = 60 * secMin;
        secDay = secHour*24;

        totalSeconds = second + (minute * secMin) + (hour * secHour);

        // Make the program calculate and display the number of seconds since midnight.

        System.out.println("It is now " + hour + ":" + minute + ":" + second);
        System.out.println("It has been " + totalSeconds + " since midnight.");

        // Calculate and display the number of seconds remaining in the day.
        System.out.println("There are " + (secDay - totalSeconds) + " seconds left in the day");

        // Calculate and display the percentage of the day that has passed. 
        // You might run into problems when computing percentages with integers, so consider using floating-point.
        System.out.println(totalSeconds*100/(secDay) + "% of the day has passed.");

        // Change the values of hour, minute, and second to reflect the current time. 
        // Then write code to compute the elapsed time since you started working on this exercise.
        hour = 17;
        minute = 10;
        second = 35;

        int newTotalSec;
        newTotalSec = second + (minute * secMin) + (hour * secHour);
        System.out.println("It has been " + (newTotalSec - totalSeconds) + " seconds since I started working on this.");
        
        
    }
}