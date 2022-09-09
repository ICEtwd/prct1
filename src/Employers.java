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

    public int countTotal() {
        int total [] = total[];
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

    public int getuId() {
        int uId[] = new int [9];
        uId[0] = 1;
        uId[1] = 2;
        uId[2] = 3;
        uId[3] = 4;
        uId[4] = 5;
        uId[5] = 6;
        uId[6] = 7;
        uId[7] = 8;
        uId[8] = 9;
        for (int i = 0; i < uId.length; i++) {

        }
        return this.uId;
    }

}
