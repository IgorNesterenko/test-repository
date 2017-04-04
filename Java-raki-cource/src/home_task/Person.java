package home_task;

/**
 * Created by neste on 19.03.2017.
 */
public class Person {
    private static final String PERSON_NAME = "Your name is: ";
    private static final String PERSON_LAST_NAME = "Your last name is: ";
    private static final String COMPANY_NAME = "Your company is: ";
    private static final String YOUR_WORK_EXPERIANCE = "Your work experiance is: ";
    private static final String YOUR_PERCENT_OF_WORK = "Your percent of work  is: ";
    private static final String YOUR_AGE = "Your age is: ";

    private  String  name;
    private  String lastName;
    private  String company;
    private  int age;
    private  int workExperiance;
    private  int percentOfWork;

    public Person(){}


    public String getName() {
        System.out.println(PERSON_NAME + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        System.out.println(PERSON_LAST_NAME + lastName);
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        System.out.println(COMPANY_NAME + company);
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        System.out.println(YOUR_AGE + age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkExperiance() {
        System.out.println(YOUR_WORK_EXPERIANCE + workExperiance);
        return workExperiance;
    }

    public void setWorkExperiance(int workExperiance) {
        this.workExperiance = workExperiance;
    }

    public int getPercentOfWork(){
        percentOfWork = workExperiance * 100 / age;
        System.out.println(YOUR_PERCENT_OF_WORK + percentOfWork + " %");
        return percentOfWork;

    }
    public  void setPercentOfWork (int age, int workExperiance){
        this.percentOfWork = age;
        this.percentOfWork = workExperiance;
    }

}


