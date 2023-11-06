package OOP_2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1000, 500);
        System.out.printf(person.toString() + " " + String.valueOf(person.getIncome()) + "\n");
        User student = new Student(2000);
        System.out.printf(student.toString() + " " + String.valueOf(student.getIncome()) + "\n");

        Person person2 = new Person((Student) student, 500);
        System.out.printf(person2.toString() + " " + String.valueOf(person2.getIncome()) + "\n");
    }
}