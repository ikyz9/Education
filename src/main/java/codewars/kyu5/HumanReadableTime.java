package codewars.kyu5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

//5 kyu
//Human Readable Time
//https://www.codewars.com/kata/52685f7382004e774f0001f7
public class HumanReadableTime {
    public static String firstMakeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", (seconds / 3600) % 100, (seconds / 60) % 60, seconds % 60);
    }

    //more correct since there are not 99 hours in the day
    public static String secondMakeReadable(int seconds) {
        return (seconds >= 0) && (seconds <=359999) ? new SimpleDateFormat("HH:mm:ss").format(new GregorianCalendar(0,0,0,0,0,seconds).getTime()) : "-1";

    }
}
