public class Employers {

    private String name;
    private String surname;
    private int salary;
    private int department;
    private int uId;


    public Employers(String name, String surname, int salary, int department, int uId) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        this.uId = uId;
    }


    public String getName () {
        return  this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getMaxSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return this.department;
    }


    @Override
    public String toString() {
        return  this.name + " " + this.surname + " " + this.salary + " " + this.department + " "+ this.uId;
    }

}
