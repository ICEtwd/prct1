public class Main {

    public static Employers[] employer = new Employers[10];

    private static Employers maxCount() {
        Employers employers = employer[0];
        int maxSalary = employers.getSalary();
        for (int i = 0; i < employer.length; i++) {
            if (employer[i].getSalary() > maxSalary) {
                maxSalary = employer[i].getSalary();
                employers = employer[i];
            }
        }
        return employers;
    }

    private static Employers minCount() {
        Employers employers = employer[0];
        int minSalary = employers.getSalary();
        for (int i = 0; i < employer.length; i++) {
            if (employer[i].getSalary() < minSalary) {
                minSalary = employer[i].getSalary();
                employers = employer[i];
            }
        }
        return employers;
    }

    private static Employers totalCount() {
        Employers salary = employer[0];
        int totalSalary = salary.getSalary();
        int sum = 0;
        for (int i = 0; i < employer.length; i++) {
            sum += salary.getSalary();
        }
        return salary;
    }

    public static void main(String[] args) {
        Employers john = new Employers("John", "Johnson", 50_000, 1);
        Employers sarah = new Employers("Sarah", "Morrison", 40_000, 1);
        Employers tracy = new Employers("Tracy", "Brown", 60_000, 2);
        Employers frank = new Employers("Frank", "Miller", 30_000, 2);
        Employers david = new Employers("David", "Harrison", 20_000, 3);
        Employers marcus = new Employers("Marcus", "Stewensom", 70_000, 3);
        Employers lewis = new Employers("Lewis", "Ramirez", 10_000, 4);
        Employers arthur = new Employers("Arthur", "Flemming", 15_000, 4);
        Employers dexter = new Employers("Dexter", "Shelby", 23_000, 5);
        Employers kate = new Employers("Kate", "Monroe", 25_000, 5);

        employer[0] = john;
        employer[1] = sarah;
        employer[2] = tracy;
        employer[3] = frank;
        employer[4] = david;
        employer[5] = marcus;
        employer[6] = lewis;
        employer[7] = arthur;
        employer[8] = dexter;
        employer[9] = kate;

        System.out.println(maxCount());
        System.out.println(minCount());
        System.out.println(totalCount());

    }
}