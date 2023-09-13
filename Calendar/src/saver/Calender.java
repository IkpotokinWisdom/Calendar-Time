package saver;

import java.util.Calendar;

public class Calender {
    public static void calendar(){
        String month[]={"January","Febuary","March",
                        "April","May","June",
                        "July","August","September",
                        "October","November","December"};
        
        Calendar calendar= Calendar.getInstance();
        System.out.println("Date:  ");
        System.out.print(month[calendar.get(Calendar.MONTH)]);
        System.out.print(" "+calendar.get(Calendar.DATE)+" ");
        System.out.println(calendar.get(Calendar.YEAR));
        
    }
    public static void calenderTime(){
        Calendar calendar= Calendar.getInstance();
        System.out.println("Time:  ");
        System.out.print(calendar.get(Calendar.HOUR)+":");
        System.out.print(calendar.get(Calendar.MINUTE)+":");
        System.out.print(calendar.get(Calendar.SECOND)+":");

    }
}
