public class Main {
    public static void main(String[] args) {

        Employers john = new Employers("John", "Johnson",  50_000, 1, 1);
        System.out.println("John = " + john.getName() + " " + john.getSurname() + " " + john.getSalary() + " " + john.getDepartment() + " " + john.getuId());
    }
}