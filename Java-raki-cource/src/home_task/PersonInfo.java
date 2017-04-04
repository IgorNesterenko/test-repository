package home_task;

import java.util.Scanner;

/**
 * Created by neste on 18.03.2017.
 */
public class PersonInfo {

    public static void main(String[] args) {

        Person person = new Person();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = scn.nextLine();
        person.setName(name);

        System.out.println("Enter your last name ");
        String lastName = scn.nextLine();
        person.setLastName(lastName);

        System.out.println("Enter name of your company ");
        String companyName = scn.nextLine();
        person.setCompany(companyName);

        System.out.println("Enter your age ");
        int age = scn.nextInt();
        person.setAge(age);

        System.out.println("Enter your work experiance");
        int experiance = scn.nextInt();
        person.setWorkExperiance(experiance);
        person.setPercentOfWork(age, experiance);

        person.getName();
        person.getLastName();
        person.getCompany();
        person.getAge();
        person.getWorkExperiance();
        person.getPercentOfWork();
    }
}