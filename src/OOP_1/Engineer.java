package OOP_1;

public class Engineer extends Worker implements Salary {
    private int successDetails;
    public Engineer(String companyName, int hoursWorked, int successDetails) {
        super(companyName, hoursWorked);
        this.successDetails = successDetails;
    }

    public Engineer(Worker worker, int successDetails) {
        super(worker.getCompanyName(), worker.getHoursWorked());
        this.successDetails = successDetails;
    }

    public int getSuccessDetails() {
        return successDetails;
    }

    public void setSuccessDetails(int successDetails) {
        this.successDetails = successDetails;
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + 10 * successDetails;
    }
}
