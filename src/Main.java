public class Main {
    public static void main(String[] args) {

       String[] employee = new String[]{"john","sarah","tracy","frank","david","marcus","lewis","arthur","dexter", "kate"};
        int totalSalary = 0;
        int max = 0;
        int min = 0;
        int sum = 0;
        int midSum = 0;

        int [] middleSalary = {50_000,40_000,60_000,30_000,20_000,70_000,10_000,15_000,23_000,25_000};
        for (int i = 0; i < middleSalary.length; i++) {
            sum = sum + middleSalary[i];
        }
        midSum = sum / middleSalary.length;

        Employers john = new Employers("John", "Johnson",  50_000, 1, 1);
        Employers sarah = new Employers("Sarah", "Morrison",  40_000, 1, 1);
        Employers tracy = new Employers("Tracy", "Brown",  60_000, 2, 1);
        Employers frank = new Employers("Frank", "Miller",  30_000, 2, 1);
        Employers david= new Employers("David", "Harrison",  20_000, 3, 1);
        Employers marcus = new Employers("Marcus", "Stewensom",  70_000, 3, 1);
        Employers lewis = new Employers("Lewis", "Ramirez",  10_000, 4, 1);
        Employers arthur = new Employers("Arthur", "Flemming",  15_000, 4, 1);
        Employers dexter = new Employers("Dexter", "Shelby",  23_000, 5, 1);
        Employers kate = new Employers("Kate", "Monroe",  25_000, 5, 1);

        System.out.println("john.toString() = " + john.toString());
        System.out.println("sarah.toString() = " + sarah.toString());
        System.out.println("tracy.toString() = " + tracy.toString());
        System.out.println("frank.toString() = " + frank.toString());
        System.out.println("david.toString() = " + david.toString());
        System.out.println("marcus.toString() = " + marcus.toString());
        System.out.println("lewis.toString() = " + lewis.toString());
        System.out.println("arthur.toString() = " + arthur.toString());
        System.out.println("dexter.toString() = " + dexter.toString());
        System.out.println("kate.toString() = " + kate.toString());

        totalSalary = john.getSalary()+sarah.getSalary()+ tracy.getSalary() + frank.getSalary()+ david.getSalary()+ marcus.getSalary()+ lewis.getSalary()+
        arthur.getSalary()+ dexter.getSalary()+ kate.getSalary();
        System.out.println("Сумма зарплат = "+totalSalary);

        System.out.println("Средняя = " + midSum);


    }
}