package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2001,12,5);
        
        Person dani = new Person("Dani", date); 
        System.out.println(dani.getName() + " tiene " + dani.getAge() + " años");
        // System.out.println("Hello Edu!");
    }
}
