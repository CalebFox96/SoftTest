/*
Name: Caleb Fox
Date: 09/03/2020
G00327455

Employee class for payroll system

Code will validate entries for title, name etc.

*/

package ie.gmit;

public class Employee {
    private String title;
    private String name;
    private String PPS;
    private String number;
    private String employmentType;
    private int age;


    public Employee(String title, String name, String PPS, String number, String employmentType, int age) {
        if(title.equals("mr")||title.equals("mrs")||title.equals("ms")){
            this.title = title;
        }
        else
            throw new IllegalArgumentException("Invalid Title");
        if(name.length()>=3 && name.length()<= 25){
            this.name = name;
        }
        else
            throw new IllegalArgumentException("Invalid name");
        if(PPS.length()==8){
            this.PPS = PPS;
        }
        else
            throw new IllegalArgumentException("Invalid PPS");
        if(number.length()==9 ){
            this.number =number;
        }
        else
            throw new IllegalArgumentException("Invalid number");

        if(employmentType.equals("full")||employmentType.equals("part")||employmentType.equals("contract")){
            this.employmentType = employmentType;
        }
        else
            throw new IllegalArgumentException("Invalid Employment type");

        if(age >18 ){
            this.age = age;
        }
        else
            throw new IllegalArgumentException("Invalid age, too young to work at company");

    }
    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getPPS() {
        return PPS;
    }

    public String getNumber() {
        return number;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public int getAge() {
        return age;
    }



}
