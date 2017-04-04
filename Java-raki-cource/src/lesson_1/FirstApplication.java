package lesson_1;

/**
 * Created by neste on 13.03.2017.
 */
public class FirstApplication {
    private  static String name = "Vasya";
    private  static  int age =25;
    private  final  static  int MY_SALARY = 10;   // constant

    public static void main(String[] args) {

        printInfo(name, age);
        System.out.println(name + " salary: " + getSalary(10));
        String company = "IBM";
        System.out.println(name + " works on" + company);
    }

    public static void  printInfo(String name, int age){
        System.out.println("User name " + name);
        System.out.println("User age " + age);

    }
    public  static int getSalary(int salary){

        return salary + MY_SALARY;
    }
}
