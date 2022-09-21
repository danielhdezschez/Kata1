package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2001,12,5);
    
        
        Person dani = new Person("Dani", date); 
        System.out.println(dani.getName() + " tiene " + dani.getAge() + " años");
    }
}
