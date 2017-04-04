package HomeTask_Cycles;

/**
 * Created by neste on 20.03.2017.
 */
public class CycleDoWhile {
    public static void main(String[] args) {
        int salary = 1000;
        do {
            System.out.println("Your selary is: "+ salary + " $");
            salary = salary+1000;

        } while (salary<13000);
    }
}
