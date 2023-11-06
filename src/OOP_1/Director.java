package OOP_1;

public class Director extends Worker implements Salary {
    private boolean revenueCompanyGrowth;

    public Director(String companyName, int hoursWorked, boolean revenueCompanyGrowth) {
        super(companyName, hoursWorked);
        this.revenueCompanyGrowth = revenueCompanyGrowth;
    }

    public boolean isRevenueCompanyGrowth() {
        return revenueCompanyGrowth;
    }

    public void setRevenueCompanyGrowth(boolean revenueCompanyGrowth) {
        this.revenueCompanyGrowth = revenueCompanyGrowth;
    }

    @Override
    public int calculateSalary() {
        int prize = 0;
        if (revenueCompanyGrowth) {
            prize = 10000;
        }
        return super.calculateSalary() + prize;
    }
}
