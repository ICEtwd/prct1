public class Employers {

    private String name;
    private String surname;
    private int salary;
    private int department;

    private int id;

    private static int counter = 1;


    public Employers(String name, String surname, int salary, int department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
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


    public int getDepartment() {
        return this.department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment (int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return  this.name + " " + this.surname + " " + this.salary + " " + this.department + " " + this.id;
    }

}
