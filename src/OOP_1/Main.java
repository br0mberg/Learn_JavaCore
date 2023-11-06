package OOP_1;

public class Main {
    public static void main(String[] args) {
        String companyName = "Java";
        Worker directory = new Director(companyName, 40, true);
        Salary directory2 = new Director(companyName, 40, false);
        System.out.println(directory.toString() + " " + directory.calculateSalary());
        System.out.println(directory2.toString() + " " + directory2.calculateSalary());
        Worker worker1 = new Worker(companyName, 30);
        Worker engineer = new Engineer(worker1, 120);
        System.out.println(worker1.toString() + " " + worker1.calculateSalary());
        System.out.println(engineer.toString() + " " + engineer.calculateSalary());
    }
}