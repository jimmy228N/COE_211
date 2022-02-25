public class Employee {
    private String firstname;
    private String lastname;
    private int age;
    private double salary;

    public Employee(String fName, String lName, int age, double salary){
        firstname = fName;
        lastname = lName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){

        return "Employee Information: "+firstname+" "+lastname+", "+age+", "+salary;
    }
}
