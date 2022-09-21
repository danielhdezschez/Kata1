package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Edu", new Date(49,8,24));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
        // System.out.println("Hello Edu!");
    }
}
