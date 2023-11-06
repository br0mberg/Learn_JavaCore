package OOP_2;
public class Person extends Student{
    protected final Integer salary;
    public Person(Integer grant, Integer salary) {
        super(grant);
        this.salary = salary;
    }

    public Person(Student student, Integer salary) {
        super(student.grant);
        this.salary = salary;
    }

    @Override
    protected int getIncome() {
        int income = super.getIncome();
        if (salary != null) return income + salary;
        return income;
    }
}
