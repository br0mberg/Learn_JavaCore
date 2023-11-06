package OOP_2;

public class Student extends User {
    protected Integer grant;

    public Student(Integer grant) {
        this.grant = grant;
    }

    @Override
    protected int getIncome() {
        if (grant != null) return grant;
        return 0;
    }
}
