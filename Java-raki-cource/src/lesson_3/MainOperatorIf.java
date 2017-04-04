package lesson_3;

/**
 * Created by neste on 19.03.2017.
 */
public class MainOperatorIf {
    public  static  void  main(String[] args){
        int age = 20;
        if(age < 20){
            System.out.println("if works");
        } else if (age < 10){
            System.out.println("else works");
        } else {
            System.out.println("else if");
        }

    }
}
