package OOP_1;

public class HR extends Worker implements Salary {

    private int processedPerson;

    public HR(String companyName, int hoursWorked, int processedPerson) {
        super(companyName, hoursWorked);
        this.processedPerson = processedPerson;
    }

    public int getProcessedPerson() {
        return processedPerson;
    }

    public void setProcessedPerson(int processedPerson) {
        this.processedPerson = processedPerson;
    }

    @Override
    public int calculateSalary() {
        return 50 * processedPerson + super.calculateSalary();
    }
}
