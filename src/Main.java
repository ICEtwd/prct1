public class Main {
    public static void main(String[] args) {

        int[] employee = new int[10];
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

    }
}